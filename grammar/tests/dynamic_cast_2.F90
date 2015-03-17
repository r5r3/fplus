module mod_dynamic_cast_2
    implicit none
    
contains

    function test() result(res)
        real :: res

        class(*), pointer   :: v1
        real, target        :: v0

        v0 = 7
        v1 => v0
        res = dynamic_cast<real>(v1)
    end function
end module