program inplace 
    implicit none

    integer :: x, y, i, j

    x = 0
    x += 1      ! x = x + 1
    print*, x

    !$FP do v1 = x y
    !$FP do v2 = i j
    ${v1} += ${v2}
    !$FP end do
    !$FP end do

end program
