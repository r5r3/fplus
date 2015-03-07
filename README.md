# fplus - a FORTRAN Preprocessor

The idea behind fplus was a missing feature in FORTRAN: code templates like in C++.
FORTRAN has already some features needed to implement generic subroutines, functions, 
and module procedures, but without additional tools a lot of code duplication is 
needed. The resulting code is hard to maintain and error-prone. Here is an example of
a generic subroutine:

```fortran
module mod_swap
    implicit none
    private

    interface swap
        module procedure swap_real
        module procedure swap_int
    end interface

    public swap
    
contains

    subroutine swap_real(a, b)
        real, intent(inout) :: a, b
        real :: c
        c = a
        a = b
        b = c
    end subroutine

    subroutine swap_int(a, b)
        integer, intent(inout) :: a, b
        integer :: c
        c = a
        a = b
        b = c
    end subroutine

end module
```

This module provides to its users the subroutine swap which can be used to swap the
values stored in two real or two integer variables. The problem is, that the two
implementations `swap_real` and `swap_int` are, apart of the data types, identical. This
is actually not really a problem with such extremely small procedures, but think about 
larger procedures that are implemented for more then two data types. 

With fplus the same module looks like that:
```fortran
module mod_swap
    implicit none
    private

    !$FP interface template swap

    public swap
    
contains

    !$FP template swap
        !$FP do T = real integer
            subroutine swap(a, b)
                ${T}, intent(inout) :: a, b
                ${T} :: c
                c = a
                a = b
                b = c
            end subroutine
        !$FP end do
    !$FP end template

end module
```

Before compiling we have to run fplus on this file:
`fplus mod_swap.F90 -o mod_swap.f90`

The output of fplus is again a FORTRAN source file like the hand written example 
above:
```fortran
module mod_swap
    implicit none
    private

    interface swap
        module procedure swap_1
        module procedure swap_2
    end interface swap

    public swap
    
contains

            subroutine swap_1(a, b)
                real, intent(inout) :: a, b
                real :: c
                c = a
                a = b
                b = c
            end subroutine
            subroutine swap_2(a, b)
                integer, intent(inout) :: a, b
                integer :: c
                c = a
                a = b
                b = c
            end subroutine

end module
``` 

The code duplication as well as the interface block are done by fplus. The only thing 
you have to do is to maintain the template. There is no need edit every implementation 
by yourself and it is pretty easy to add additional implementations for more data types:

```fortran
module mod_swap
    implicit none
    private

    !$FP interface template swap

    public swap
    
contains

    !$FP template swap
        !$FP do T = real {real (kind=8)} integer {integer (kind=8)} 
            subroutine swap(a, b)
                ${T}, intent(inout) :: a, b
                ${T} :: c
                c = a
                a = b
                b = c
            end subroutine
        !$FP end do
    !$FP end template

end module
``` 

Running again fplus creates the following output:

```fortran
module mod_swap
    implicit none
    private

    interface swap
        module procedure swap_1
        module procedure swap_2
        module procedure swap_3
        module procedure swap_4
    end interface swap

    public swap
    
contains

            subroutine swap_1(a, b)
                real, intent(inout) :: a, b
                real :: c
                c = a
                a = b
                b = c
            end subroutine
            subroutine swap_2(a, b)
                real (kind=8), intent(inout) :: a, b
                real (kind=8) :: c
                c = a
                a = b
                b = c
            end subroutine
            subroutine swap_3(a, b)
                integer, intent(inout) :: a, b
                integer :: c
                c = a
                a = b
                b = c
            end subroutine
            subroutine swap_4(a, b)
                integer (kind=8), intent(inout) :: a, b
                integer (kind=8) :: c
                c = a
                a = b
                b = c
            end subroutine

end module
```

This example only illustrates a small part of fplus's functionality, but it 
should already by enough to imagine that the creation of larger libraries that 
implement functions and subroutines for different data types becomes much easier 
to write and to maintain.

If you are familiar with C++ then you should already have noticed that the fplus 
templates are not really comparable to C++ templates. You still have to list the data types
that your module should support, in C++ the implementation for the data type you need 
is created in place when you use it the first time. Such a C++-like functionality might 
be included in the future, but is currently not on the todo list. 

# How it works
## Technical background
fplus is written in Java. The big advantage of Java is platform-independence. Java
programs can be distributed as binaries and executed nearly everywhere without the 
need of re-compilation. That means it is possible the distribute fplus together with 
the FORTRAN source code it should compile. 

Internally fplus is based on a FORTRAN parser which is created with 
[ANTLR](http://antlr.org) (ANother Tool for Language Recognition).
The included FORTRAN grammar is far from being complete but perfectly adequate for
the intended purpose. The basic structure of a FORTRAN file in recognized. Thus fplus 
is able detect what belongs to a procedure it is supposed to duplicate and where to 
put the created code.

## Preprocessor directives
Adding additional functionality to a language is often done with so called preprocessor
directives. These are lines that are processed by a preprocessor but ignored by the 
compiler itself. A good example of this approach is [OpenMP](http://www.openmp.org)
which adds shared memory parallel programming capabilities to C/C++ and FORTRAN by such
directives. The fplus preprocessor directives are lines that start with `!$FP`. 
The example above includes the following directives:
```fortran
!$FP interface template swap
!$FP template swap
    !$FP do T = real integer
    !$FP end do
!$FP end template
```

* `!$FP interface template swap` 
This line tells fplus where to place the interface block for the subroutine swap. 
This directive is only allowed within  the declaration sections of a module 
above `contains`
* `!$FP template swap`
This line marks the beginning of a template. A template is only allowed within 
the implementation part of a module below `contains
* `!$FP do T = real integer`
This line is the beginning of a loop. In this example the variable T iterates 
over all words appended behind the equal sign. It is allowed to place curly 
braces around multiple words to group them together. 
* `!$FP end do`
This line is the end of a loop. Everything between the beginning and the end of 
a loop is repeated for each value of the loop variable. That also applies to comments.
* `!$FP end template`
This line is the end of a template. 

This is only a small subset of the preprocessor directives used by fplus. Additional ones
are explained later.

## fplus variables in curly braces
fplus makes use of curly braces to distinguish its variables from FORTRAN variables 
when used outside of preprocessor directives. This is comparable to a bash shell script
where `${var}` expands to the value of var.

`${T}, intent(inout) :: a, b`
This line is also from the example above.
Every time fplus reaches this line `${T}` expands to its current value. Such
variables in curly braces are allowed everywhere, that includes comments. Although it is
not necessary to use different names for FORTRAN and fplus variables, it is highly 
recommended to do so to avoid confusion. 

