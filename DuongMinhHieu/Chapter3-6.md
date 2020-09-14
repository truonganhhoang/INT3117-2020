# Using the class PrimeNumbers describe 5 tests using the methods of the class to show the next points:
a) A test that does not reach the fault.
b) A test that reaches the fault but does not infect.
c) A test that infects the state but does not propagate.
d) A test that propagates but does not reveal.
e) A test that reveals a fault.

# Trả lời:

* Với test đầu tiên, ta sẽ gọi `computePrime(0)` thì chương trình sẽ không vào được vòng lặp while nơi mà các toán tử được thực hiện và có lỗi (fault) xuất hiện. Do đó ta không tới được lỗi.

* Với test thứ hai, ta sẽ gọi `computePrime(5)` (hoặc thay 5 bằng số nào đó không kết thúc bằng 9) thì chương trình sẽ chạy đoạn mã có lỗi nhưng lại không bị lây nhiễm (infect) vì số không kết thúc bằng 9 nên không bị lỗi.

* Với test thứ ba, ta sẽ gọi `computePrime(19)` thì chương trình sẽ không thêm số 19 là số nguyên tố do đoạn mã lỗi. Nhưng vì ta không in danh sách ra (không dùng hàm toString()) do đó người dùng không hề biết có lỗi, chỉ thấy chương trình vẫn chạy bình thường. Do đó dù có bị lây nhiễm nhưng lại không lan truyền và không gây ra lỗi khi hiển thị (failure).

* Với test thứ tư, ta sẽ gọi hàm như test thứ ba cùng với hàm toString() thì người dùng sẽ nhận ra lỗi sai ở trong khi chương trình chạy. Khi đó, ca kiểm thử sẽ ở giai đoạn lan truyền (propagate). Chỉ khi người dùng nhận ra lỗi sai này khi só sánh các kết quả thì mới ở trong giai đoạn bộc lộ (reveal) và khi đó là test thứ năm.