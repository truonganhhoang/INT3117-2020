# Section 8.3-7

# Answer the following questions for the program fragments below:

a, Give a GACC test set for fragment P. (Note that GACC, CACC, and RACC
yield identical test sets for this example.)

- Từng mệnh đề phải đúng với các mệnh đề sai, và sai đó tất cả các mệnh đề phải sai. T GACC = {(T, F, F), (F, T, F), (F, F, T), (F, F, F)}

b, Does the GACC test set for fragment P satisfy Edge Coverage on fragment Q?

- tập kiểm tra GACC cho P có phù hợp với bao phủ đỉnh ở Q

c, Write down an Edge Coverage test set for fragment Q. Make your test set include as few tests from the GACC test set as possible.

- T1 = {(T, T, T), (F, T, T), (F, F, T), (F, F, F)}
- T2 = {(T, T, F), (F, T, T), (F, F, T), (F, F, F)}
- T3 = {(T, F, T), (F, T, T), (F, F, T), (F, F, F)}
- T4 = {(T, F, F), (F, T, T), (F, F, T), (F, F, F)}
- T5 = {(T, T, T), (F, T, F), (F, F, T), (F, F, F)}
- T6 = {(T, T, F), (F, T, F), (F, F, T), (F, F, F)}
- T7 = {(T, F, T), (F, T, F); (F, F, T), (F, F, F)}
- T8 = {(T, F, F), (F, T, F), (F, F, T), (F, F, F)}