# Define 12 mutants for the following method `cal()` using the effective mutation operators given previously. Try to use each mutation operator at least once. Approximately how many mutants do you think there would be if all mutants for `cal()` were created?

# Trả lời:
* 12 biến dị:
	* `month2 == month1` đổi thành `month2 leftOp month1`.
	* `m4 = year % 4` đổi thành `m4 = year - 4`.
	* `m100 = year % 100` đổi thành `m4 = year + 100`.
	* `m400 = year % 400` đổi thành `m400 = year * 400`.
	* `m4 != 0` đổi thành `m4 == 0`.
	* `m100 == 0` đổi thành `m100 != 0`.
	* `m400 != 0` đổi thành `m400 falseOp 0`.
	* `daysIn[2] = 28` đổi thành `daysIn[2] += 28`.
	* `daysIn[2] = 29` đổi thành `daysIn[2] -= 29`.
	* `numDays = day2 + (daysIn[month1] - day1)` đổi thành `numDays = day2 + (daysIn[month1] + day1)`.
	* `numDays = day2 + (daysIn[month1] - day1)` đổi thành `numDays = day2 + (daysIn[month1] * day1)`.
	* `numDays = daysIn[i] + numDays` đổi thành `numDays += daysIn[i] + numDays`.

* Nếu như tạo ra tất cả biến dị thì sẽ có khoảng 100 biến dị.