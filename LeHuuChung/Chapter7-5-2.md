Question
```
(a) How many states are there?
(b) Draw and label the states (with variable values) and transitions (with method names). Notice that all of the methods are total, that is, their behaviors are defined for all possible inputs.
(c) A test case is simply a sequence of method calls. Provide a test set that satisfies Edge Coverage on your graph.
```

Answer
```
(a)
- There are 4 states:
(1) : (Wake, Low)
(2) : (Wake, High)
(3) : (Sleep, Low)
(4) : (Sleep, High)

(b)
- There are 12 edges (3 total methods each of which applies in 4 states). - The initial states is (1)

1, advance(): (1) --> (3)
2, advance(): (2) --> (4)
3, advance(): (3) --> (1)
4, advance(): (4) --> (2)
5, up(): (1) --> (2)
6, up(): (2) --> (2)
7, up(): (3) --> (4)
8, up(): (4) --> (4)
9, down(): (1) --> (1)
10, down(): (2) --> (1)
11, down(): (3) --> (3)
12, down(): (4) --> (3)

(c)
Initially in state (1)
down() - edge 9 to state (1)
advance() - edge 1 to state (3)
down() - edge 11 to state (3)
up() -  edge 7 to state (4)
up() - edge 8 to state (4)
advance() - edge 4 to state (2)
up() - edge 6 to state (2)
down()- edge 10 to state (1)
up() - edge 5 to state (2)
advance() - edge 2 to state (4)
down() - edge 12 to state (3)
advance() - edge 3 to state (1)
```