# Chapter 8.3-7

> Answer the following questions for the program fragments below:\
> (a) Give a GACC test set for fragment P. (Note that GACC,CACC, and RACC yield identical test sets for this example.)\
> (b) Does the GACC test set for fragment P satisfy Edge Coverage on fragment Q?\
> (c) Write down an Edge Coverage test set for fragment Q. Makeyour test set include as few tests from the GACC test set as possible.
>

(a)
Ta thấy mỗi mệnh đề phải đúng với các mệnh đề khác sai, và sau đó tất cả các mệnh đề phải sai, do đó tạo ra 4 ca kiểm thử thử (được đánh số 4, 6, 7, 8 trong sơ đồ bảng chân trị thông thường):
T<sub>GACC</sub> = {(T, F, F), (F, T, F), (F, F, T), (F, F, F)}.

(b)
Có

(c)

- T<sub>EDGE:1</sub> = {(T, T, T),(F, T, T),(F, F, T),(F, F, F)}
- T<sub>EDGE:2</sub> = {(T, T, F),(F, T, T),(F, F, T),(F, F, F)}
- T<sub>EDGE:3</sub> = {(T, F, T),(F, T, T),(F, F, T),(F, F, F)}
- T<sub>EDGE:4</sub> = {(T, F, F),(F, T, T),(F, F, T),(F, F, F)}
- T<sub>EDGE:5</sub> = {(T, T, T),(F, T, F),(F, F, T),(F, F, F)}
- T<sub>EDGE:6</sub> = {(T, T, F),(F, T, F),(F, F, T),(F, F, F)}
- T<sub>EDGE:7</sub> = {(T, F, T),(F, T, F),(F, F, T),(F, F, F)}
- T<sub>EDGE:8</sub> = {(T, F, F),(F, T, F),(F, F, T),(F, F, F)}
