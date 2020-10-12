# Chapter 7.2.2-3

**Subsumption has a significant weakness. Suppose criterion C<sub>strong</sub> subsumes criterion C<sub>weak</sub> and that test set T<sub>strong</sub> satisfies C<sub>strong</sub> and test set T<sub>weak</sub> satisfies C<sub>weak</sub>. It is not necessarily the case that T<sub>weak</sub> is a subset of T<sub>strong</sub>. It is also not necessarily the case that T<sub>strong</sub> reveals a fault if T<sub>weak</sub> reveals a fault. Explain these facts.**

Giả thuyết chỉ nói về C<sub>strong</sub> bao hàm C<sub>weak</sub>, chứ không đề cập đến bộ kiểm thử T<sub>strong</sub> bao hàm T<sub>weak</sub> (chúng chỉ thuộc các tiêu chí C<sub>strong</sub> và C<sub>weak</sub>).<br/> Nên khi chọn ra các bộ kiểm thử thì trường hợp T<sub>weak</sub> có thể có các ca kiểm thử mà phát hiện được lỗi trong mã nguồn mà T<sub>strong</sub> không có.
