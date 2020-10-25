Nêu ra 12 đột biến trong phương thức **cal()**

![image](https://user-images.githubusercontent.com/48431650/96531465-e677f800-12b3-11eb-94d7-e32e00dbac46.png)

* 1: numDays = abs (day2 - day1);
* 2: numDays = day2 - -abs (day1);
* 3: numDays = failOnZero (day2 - day1);
* 4: numDays = day2 * day1;
* 5: if ((m4 > 0) || ((m100 ==0) && (m400 != 0)))
* 6: if (month2 >= month1)
* 7: if (false) // ROR operator (falseOp)
* 8: if ((m4 != 0) || ((m100 ==0) || (m400 != 0)))
* 9: if ((m4 != 0)) // COR operator (leftOp)
* 10: numDays = day2 + -(daysIn[month1] - day1);
* 11: numDays = day1 + (daysIn[month1] - day1);
* 12: Replace "daysIn[2] = 29;" with \Bomb();"