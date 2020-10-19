# Consider "stuck-at" faults, where a literal is replaced by the constant true or the constant false. These faults do not appear in the fault list given in Table 8.1 or the corresponding fault detection relationships given in Figure 8.2.

### a, Which fault dominates the stuck-at fault for the constant true? That is, find the fault in figure 8.2 such that if a test set is guaranteed to detect every occurrence of that fault, then the test set also detects all stuck-at true faults. Explain your answer.
Việc phân biệt tất cả các vấn đề Literal Omission sẽ đảm bảo xác định tất cả các lỗi bị mắc kẹt (lỗi stuck-at), bởi vì việc loại bỏ một ký tự logic cũng giống như việc gán nó bằng một hằng số boolean là true.

### b, Which fault dominates the stuck-at fault for the constant false? That is, find the fault in figure 8.2 such that if a test set is guaranteed to detect every occurrence of that fault, then the test set also detects all stuck-at false faults. Explain your answer.
(Tôi chịu...)