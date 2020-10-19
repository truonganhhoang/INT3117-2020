<h2>6. Answer the following questions for the method twoPred() below:</h2>

**(a) List test inputs for twoPred() that achieve Restricted Active Clause Coverage (RACC).**

- `x < y` true; `x + y == 10` true; Example : ```twoPred(4, 6)```.\
- `x < y` false; `x + y == 10` true; Example : ```twoPred(6, 4)```.\
- `x < y` true; `x + y == 10` false; Example : ```twoPred(4, 5)```.\

**(b) List test inputs for twoPred() that achieve Restricted Inactive Clause Coverage (RICC)**

- `x < y` false; `x + y == 10` false; Example : ```twoPred(6, 5)```.\
- `x < y` true; `x + y == 10` false; Example : ```twoPred(4, 5)```.\
- `x < y` false; `x + y == 10` true; Example : ```twoPred(6, 4)```.
