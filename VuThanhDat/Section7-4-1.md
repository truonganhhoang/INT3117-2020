Ex 7.4-1

a. Draw a control flow graph for Watch.

![](resources\Screenshot_1.png)

b. List all the call sites.
The call sites are:

1. Line 62, Watch::constructor() ! Time:constructor()
2. Line 63, Watch::constructor() ! Time:constructor()
3. Line 64, Watch::constructor() ! Time:constructor()
4. Line 69, Watch::toString() ! Time:toString()
5. Line 70, Watch::toString() ! Time:toString()
6. Line 70, Watch::toString() ! Time:toString()
7. Line 82, Watch::doTransition() ! Time:changeTime()
8. Line 88, Watch::doTransition() ! Time:changeTime()
9. Line 94, Watch::doTransition() ! Time:changeTime()

c. List all coupling du-pairs for each call site.

-  Call sites 1, 2 and 3 are implicit within the constructor for Watch. Since Time
  does not have a constructor defined, the default constructor is called.
  
-  Call sites 4, 5 and 6 are from Watch’s toString() method to Time’s toString
  method. The Time objects are passed in, and a string is returned. Time’s toString()
  method does not refer to the object explicitly, so we use "instance" for the variable
  name. The six du-pairs are:
  
  A. (Watch::toString(), watch, 69) ! (Time::toString(), instance, 55)
  
  B. (Watch::toString(), stopwatch, 70) ! (Time::toString(), instance, 55)
  
  C. (Watch::toString(), alarm, 71) ! (Time::toString(), instance, 55)
  
  D. (Time::toString(), String, 55) ! (Watch::toString(), String, 69)
  
  E. (Time::toString(), String, 55) ! (Watch::toString(), String, 70)
  
  F. (Time::toString(), String, 55) ! (Watch::toString(), String, 71)
  
-  Call sites 7, 8 and 9 are from Watch’s doTransition() to Time’s changeTime().

  A. Call site 7: (Watch::doTransition(), button, 74) ! (Time::changeTime(), 29)
  
  B. Call site 8: (Watch::doTransition(), button, 74) ! (Time::changeTime(), 29)
  
  C. Call site 9: (Watch::doTransition(), button, 74) ! (Time::changeTime(), 29)
  
  D. (Time::changeTime(), instance, 31) ! (Watch::doTransition(), watch, 82)
  
  E. (Time::changeTime(), instance, 35) ! (Watch::doTransition(), watch, 82)
  
  F. (Time::changeTime(), instance, 37) ! (Watch::doTransition(), watch, 82)
  
  G. (Time::changeTime(), instance, 42) ! (Watch::doTransition(), watch, 82)
  
  H. (Time::changeTime(), instance, 46) ! (Watch::doTransition(), watch, 82)
  
  I. (Time::changeTime(), instance, 48) ! (Watch::doTransition(), watch, 82)
  
  J. (Time::changeTime(), instance, 31) ! (Watch::doTransition(), stopwatch, 88)
  
  K. (Time::changeTime(), instance, 35) ! (Watch::doTransition(), stopwatch, 88)
  
  L. (Time::changeTime(), instance, 37) ! (Watch::doTransition(), stopwatch, 88)
  
  M. (Time::changeTime(), instance, 42) ! (Watch::doTransition(), stopwatch, 88)
  
  N. (Time::changeTime(), instance, 46) ! (Watch::doTransition(), stopwatch, 88)
  
  O. (Time::changeTime(), instance, 48) ! (Watch::doTransition(), stopwatch, 88)
  P. (Time::changeTime(), instance, 31) ! (Watch::doTransition(), alarm, 94)
  
  Q. (Time::changeTime(), instance, 35) ! (Watch::doTransition(), alarm, 94)
  
  R. (Time::changeTime(), instance, 37) ! (Watch::doTransition(), alarm, 94)
  
  S. (Time::changeTime(), instance, 42) ! (Watch::doTransition(), alarm, 94)
  
  T. (Time::changeTime(), instance, 46) ! (Watch::doTransition(), alarm, 94)
  
  U. (Time::changeTime(), instance, 48) ! (Watch::doTransition(), alarm, 94)

d. Create test data to satisfy All-Coupling-Use Coverage for Watch.
+ t1: mode = TIME, button = UP
+ t2: mode = TIME, button = UP, UP, ..., UP 60 times (we abbreviate this as
  UP 60)
+ t3: mode = TIME, button = UP 1440
+ t4: mode = TIME, button = DOWN
+ t5: mode = TIME, button = DOW N60
+ t6: mode = TIME, button = DOW N1440
+ t7: mode = STOPWATCH, button = UP
+ t8: mode = STOPWATCH, button = UP 60
+ t9: mode = STOPWATCH, button = UP 1440
+ t10: mode = STOPWATCH, button = DOWN
+ t11: mode = STOPWATCH, button = DOW N60
+ t12: mode = STOPWATCH, button = DOW N1440
+ t13: mode = ALARM, button = UP
+ t14: mode = ALARM, button = UP 60
+ t15: mode = ALARM, button = UP 1440
+ t16: mode = ALARM, button = DOWN
+ t17: mode = ALARM, button = DOW N60
+ t18: mode = ALARM, button = DOW N1440
