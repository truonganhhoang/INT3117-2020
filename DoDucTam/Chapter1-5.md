## Question 5: 
### Code #1:
The function return last index of element y so the iterator did not begin at the first value of the array so leading to missing case:
```java
	change:
	for(int i=x.length() - 1; i > 0; i--)
	to 
	for(int i=x.length() - 1; i >= 0; i--)
```

test case does not cause error: x={1, 2, 3}, y = 3 so the answer: 2
test case causes error: x = [0, 1, 2, 3, 4], y = 1 so the answer: 1
		      code compiled successfully because it still fill correct answer
	
### Code #2:
a)  function returned the index of last element which values 0; but the for loop just return the first index of element which values 0
```java
change:
for(int i=0; i <x.length; i++) 
to
for(int i =  x.length() - 1; i>=0 ; i--)
```
b) The test case does not return error: `x = [0, 1, 2]` so the answer is 0 and 0 only appear 1 time

c) The test case causes error: x=[0, 5, 0] and the answer 0
`x = [1, 0, 3, 5]` and the answer is 1

From test cases, after iterate to index 0 will stop so can not find out the last element which values 0

### Code #3:
Function count the amount of positive number but it includes 0 so the answer is false
```java
change
if(x[i] >=0) 
to 
if(x[i] > 0)
```
b) The test case does not cause error: `x = [1,2,3]` so the answer is 3

c) The test case cause error: `x = [0,1,2,3]` so the answer is 4

e) From test cases, count includes 0 which is not a positive number so the code did not compile successfully

### Code #4:
a) function count the amount of odd number but does not include

 test case return number % 2 === 1 so it caused error

 test case does not cause error: `x = [1,2,3]` so answer is 3

 test case causes error: `x = [-3,0,4]` so answer is 2

e) In code #4 even though -3 % 2 === 1 but did not counted so the code can not compiled successfully
