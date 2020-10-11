# Chapter 7.2.2-3
## 3. Subsumption has a significant weakness. Suppose criterion C<sub>strong</sub> subsumes criterion C<sub>weak</sub> and that test set T<sub>strong</sub> satisfies C<sub>strong</sub> and test set T<sub>weak</sub> satisfies C<sub>weak</sub>. It is not necessarily the case that T<sub>weak</sub> is a subset of T<sub>strong</sub>. It is also not necessarily the case that T<sub>strong</sub> reveals a fault if T<sub>weak</sub> reveals a fault. Explain these facts.


<br>

## C<sub>weak</sub> là tập con của C<sub>strong</sub> không có nghĩa là T<sub>weak</sub> cũng là tập con của T<sub>strong</sub>. Nếu có cùng 1 yêu cầu kiểm thử chung của cả C<sub>weak</sub> và C<sub>strong</sub> thì có thể chọn 1 test trong T<sub>weak</sub> và 1 test khác trong T<sub>strong</sub>, khi đó test chọn từ T<sub>weak</sub> có thể phát hiện lỗi nhưng test khác trong T<sub>strong</sub> thì không.
