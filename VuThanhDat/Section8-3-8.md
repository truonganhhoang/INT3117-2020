# **Question**
```
For the index() program in Chapter 7, complete the test sets for the following coverage criteria by filling in the “don’t care” values. Make sure to ensure reachability. Then derive the expected output. Download the program, compile it, and run it with your resulting test cases to verify correct outputs.
(a) Predicate Coverage (PC)
(b) Clause Coverage (CC)
(c) Combinatorial Coverage (CoC)
(d) Correlated Active Clause Coverage (CACC) 
```

# **Answer**

(a) PC:
|----| predicate        | X | Y | Z     | Output            | X | Y | Z | Output            |
|----|----------------  |---|---|----   |----------------   |---|---|---|-----------------  |
| 12 | argv.length==3   | 4 | 6 | 3     | No Solution       | - | - | - | R1=1.5, R2=2.75   |
| 35 | ok==TRUE         | 8 | 5 | -3    | R1=0.37, R2=-1.0  | 4 | 6 | 3 | No Solution       |
| 48 | D<0.0            | 8 | 5 | -3    | R1=0.37, R2=-1.0  | 4 | 6 | 3 | No Solution       |
