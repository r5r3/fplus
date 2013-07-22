program conditional_1

	!$FP var1 = 1
	!$FP var2 = 2

	!$FP if (var1 == 1) 		print*, "var1 is 1"
	!$FP if (.not. var1 == 1) 	print*, "var1 is not 1"

	!$FP if (var1 == 1 .and. var2 == 2) print*, "var1 is 1 and var2 is 2"
	!$FP if (var1 == 2 .and. var3 == 3) print*, "var3 is not present"

	!$FP if (var1 > 0 .or. var2 < 2) print*, "var1 is larger than 0 or var2 smaller than 2"
	!$FP if (var1 > 1 .or. var2 /= 1) print*, "var1 is larger than 1 or var2 not equal to 1"
	!$FP if (var1 > 1 .or. var2 > 2) print*, "var1 is larger than 1 or var2 larger then 2"

	!$FP if (var1 == 1) then
		print*, "a if block without else"
	!$FP end if

	!$FP if (var1 == 2) then
		print*, "a if block with else"
	!$FP else
		print*, "else block"
	!$FP end if

end program