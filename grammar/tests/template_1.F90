module mod_template_1

	!$FP interface template sum_of_two
	!$FP interface template product_of_two	

contains

	!$FP template sum_of_two
		!$FP do T = real integer
			!$FP do K = 4 8

			! calculate the sum of the two ${T} arguments
			${T} (kind=${K}) function sum_of_two(arg1, arg2) result (res)
				${T} (kind=${K}) :: args1, arg2
				res = args1 + args2
			end function	
			!$FP end do	
		!$FP end do
	!$FP end template 

	!$FP template product_of_two
		!$FP do T = real integer
			!$FP do K = 4 8

			! calculate the product of the two ${T} arguments
			function product_of_two(arg1, arg2) result (res)
				${T} (kind=${K}) :: args1, arg2, res
				res = args1 * args2
			end function	
			!$FP end do	
		!$FP end do
	!$FP end template 

end module 