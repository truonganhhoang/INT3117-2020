# Exercise 6 - Section 1 - Chapter 8

## Question
In Section 8.1.6, we introduced the example p = (a ∨ b) ∧ c, and provided expanded versions of the clauses using program variables. We then gave specific values to satisfy PC. We also gave truth values to satisfy CC. Find values for the program variables given to satisfy CC; that is, refine the abstract tests into concrete test values.

## Answer
The predicate is:  
> p = (a v b) ^ c  
Which is refined into:  
> p = ((x < y) v *done*) ^ list.contain(str)  
Where:  
- a: x < y, a relational expression for program variables x and y  
- b: done, a primitive boolean value  
- c: list.contains(str), for List and String objects  


Concrete test values to satisfy Clause Coverage, assume list = ["Gac", "Lai", "Au", "Lo"]:  
| a | b | c |
|---|---|---|
| x = 1, y = 3 | | |
|x = 3, y = 1 | | |
| | true | |
| | false | |
| | | list.contains("Lo") |
| | | list.contains("Miu") |