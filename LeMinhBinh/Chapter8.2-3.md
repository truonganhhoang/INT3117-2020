# Chapter 8.2-3

> Consider “stuck-at” faults, where a literal is replaced by the constant true or the constant false. These faults do not appear in the fault list given in table 8.1 or the corresponding fault detection relationships given in Figure 8.2.\
> (a) Which fault type “dominates” the stuck-at fault for the constant true? That is, find the fault in Figure 8.2 such that if a test set is guaranteed to detect every occurrence of that fault, then the test set also detects all stuck-at true faults. Explain your answer.\
> (b) Which fault type dominates the stuck-at fault for the constant false? That is, find the fault in Figure 8.2 such that if a test set is guaranteed to detect every occurrence of that fault, then the test set also detects all stuck-at false faults. Explain your answer.

(a)
Phát hiện tất cả các lỗi LO (Literal Omission) đảm bảo phát hiện tất cả các lỗi stuck-at.
Lý do là việc bỏ qua mệnh đề về mặt logic cũng giống như việc thay thế mệnh đề hằng số true.

(b)
