! a simple test for a loop
program loop_1

    print*, "A first FP-Loop: "
    
    !$FP do i in 1 "2 3" 4 "17"
    !$FP do j in 1 3
    !$FP do k = 1, 3
        print*, " i=", ${i}, " j=", ${j}, " k=", ${k}
    !$FP end do
    !$FP end do
    !$FP end do

end program