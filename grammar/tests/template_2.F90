module mod_template_2

	type, public :: test
		real (kind=8) :: value
	contains
		!$FP generic, public :: set_value => test_set_value
	end type

contains

	!$FP template test_set_value
		!$FP do K = 4 8
			subroutine test_set_value(this, val)
				class (test) :: this
				real (kind=${K}) :: val
				this%value = real(val,8)
			end subroutine
		!$FP end do
	!$FP end template
end module