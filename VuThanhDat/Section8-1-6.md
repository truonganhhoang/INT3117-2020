# Chapter 8 - Section 1 - Exercise 6

## p = (a ∨ b) ∧ c

- a: ```x < y```, a relational expression for program variables ```x``` and ```y```
- b: ```done```, a primitive boolean value
- c: ```list.contains(str)```, for ```List``` and ```String``` objects

### Answer:

|           | a            | b            | c                                 |
|-----------|--------------|--------------|-----------------------------------|
| a = true  | x = 1, y = 2 |              |                                   |
| a = false | x = 1, y = 0 |              |                                   |
| b = true  |              | done = true  |                                   |
| b = false |              | done = false |                                   |
| c = true  |              |              | list = ["a", "b", "c"], str = "a" |
| c = false |              |              | list = ["a", "b", "c"], str = "J" |