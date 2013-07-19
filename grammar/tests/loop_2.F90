! a simple test for a loop
program loop_2

    print*, "A second FP-Loop: "
    
    ! definition of a FP variable
    !$FP x = 6 5 4 3 2 1

    ! definition of a second FP variable
    !$FP y = 1, 6

    print*, "x(3) = ", ${x((3))}

    !$FP do i = 1, 6
        print*, " x=", ${x(i)}, " y=", ${y(i)}
    !$FP end do

end program