
### (a) Give all call sites using the line numbers given.
We only have one callsite : trash() --> takeOut() (Line 12)

### (b) Give all pairs of last-def s and first-uses.
- (trash(), m, 5) --> (takeOut(), a, 19) 
- (trash(), m, 7) --> (takeOut(), a, 19) 
- (trash(), n, 9) --> (takeOut(), b, 21)
- (trash(), n, 9) --> (takeOut(), b, 23) 
- (trash(), n, 11) --> (takeOut(), b, 21) 
- (trash(), n, 11) --> (takeOut(), b, 23) 
- (takeOut(), e, 21) --> (trash(), o, 13) 
- (takeOut(), e, 23) --> (trash(), o, 13) 

### (c) Provide test inputs that satisfy all-coupling-uses (note that trash() only has one input).
- x = 0: satisfies 1, 6, 8 
- x = 1: satisfies 2, 5, 7 
- x = 6: satisfies 2, 3, 7 
- 4 can't be satisfied because if trash :: x>5, m=4, then takeout :: x>0
