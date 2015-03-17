program test_dynamic_cast

    class(*), pointer   :: v1
    real, pointer       :: v2
    real, target        :: v0
    integer             :: v3
    
    v0 = 7
    v1 => v0
    v2 => dynamic_cast<real, pointer>(v1)
    v3 = 8
    
    print*, v2, dynamic_cast<real>(v1), dynamic_cast<real>(v3)
    
end program