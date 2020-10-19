# Exercise 2 - Section 3 - Chapter 8

## Question
Complete and run the tests to satisfy CC for the [Thermostat class](https://cs.gmu.edu/~offutt/softwaretest/java/Thermostat.java)

## Answer

We have 4 clauses:  
- a: curTemp < dTemp - thresholdDiff    
- b: Override  
- c: curTemp < overTemp - thresholdDiff  
- d: timeSinceLastRun > minLag

This exercise is similar to exercise 8-3-1. However, we have to evaluate each clause to false for the test to be completed, as some clause may not be evaluated if the previous one is set to false (for example c will not be evaluated if b is false).