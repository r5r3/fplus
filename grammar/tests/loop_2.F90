! a simple test for a loop
program loop_2

    print*, "A second FP-Loop: "
    
    ! definition of a FP variable
    !$FP x = 1 2 3 4 5 6

    ! definition of a second FP variable
    !$FP y = 1, 6

    !$FP do i = 1, 6
        print*, " x=", ${x(i)}, " y=", ${y(i)}, " x*y=", ${x(i)*y(i)}
    !$FP end do

end program