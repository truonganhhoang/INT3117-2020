
a, Hình vẽ ở link bên dưới:
https://docs.google.com/document/d/1d4TiszqbNo938-ALZtQzR4tgGStyAjdii2wmANW4dhM/edit

b,
Các dòng lệnh đó là:
i. Dòng 62, Watch::constructor() → Time:constructor()
ii. Dòng 63, Watch::constructor() → Time:constructor()
iii. Dòng 64, Watch::constructor() → Time:constructor()
iv. Dòng 69, Watch::toString() → Time:toString()
v. Dòng 70, Watch::toString() → Time:toString()
vi. Dòng 70, Watch::toString() → Time:toString()
vii. Dòng 82, Watch::doTransition() → Time:changeTime()
viii. Dòng 88, Watch::doTransition() → Time:changeTime()
ix. Dòng 94, Watch::doTransition() → Time:changeTime()

c,
 *i,* 
 ii và iii được ngầm định bên trong hàm tạo cho Watch. Vì Thời gian không có hàm tạo được xác định, nên hàm tạo mặc định được gọi (theo quy tắc của Java, điều đó có nghĩa là các giá trị mặc định được gán cho các biến thể phiên bản, tức là giờ và phút đều nhận giá trị 0).
*ii.*
 iv, v và vi là từ phương thức Watch’s toString () sang phương thức Time’s toString. Các đối tượng Thời gian được chuyển vào và một chuỗi được trả về. Phương thức Time’s toString () không tham chiếu đến đối tượng một cách rõ ràng, vì vậy chúng tôi sử dụng “instance” cho tên biến. Sáu cặp du là:
 A. (Watch::toString(), watch, 69) → (Time::toString(), instance, 55)
B. (Watch::toString(), stopwatch, 70) → (Time::toString(), instance, 55)
C. (Watch::toString(), alarm, 71) → (Time::toString(), instance, 55)
D. (Time::toString(), String, 55) → (Watch::toString(), String, 69)
E. (Time::toString(), String, 55) → (Watch::toString(), String, 70)
F. (Time::toString(), String, 55) → (Watch::toString(), String, 71)
*iii,*
vii, viii và ix là từ Watch’s doTransition () sang Time’s changeTime (). Nút tham số được định nghĩa ngầm tại dòng 74 (lối vào phương thức) và các đối tượng Thời gian được định nghĩa trong changeTime (). Ba cặp du đôi đầu tiên có cùng số dòng cho lần sử dụng cuối cùng và lần sử dụng đầu tiên, do đó được thông báo với số trang web cuộc gọi. Do logic phức tạp trong changeTime (), nó chứa sáu định nghĩa cuối cùng của biến thể hiện của nó (gán cho phút và giờ), dẫn đến 18 cặp du ghép cho các giá trị được trả về doTransition ().
A. Call site vii: (Watch::doTransition(), button, 74) → (Time::changeTime(), 29) 
B. Call site viii: (Watch::doTransition(), button, 74) → (Time::changeTime(), 29)
C. Call site vix: (Watch::doTransition(), button, 74) → (Time::changeTime(), 29)
D. (Time::changeTime(), instance, 31) → (Watch::doTransition(), watch, 82)
E. (Time::changeTime(), instance, 35) → (Watch::doTransition(), watch, 82)
F. (Time::changeTime(), instance, 37) → (Watch::doTransition(), watch, 82)
G. (Time::changeTime(), instance, 42) → (Watch::doTransition(), watch, 82)
H. (Time::changeTime(), instance, 46) → (Watch::doTransition(), watch, 82)
I. (Time::changeTime(), instance, 48) → (Watch::doTransition(), watch, 82)
J. (Time::changeTime(), instance, 31) → (Watch::doTransition(), stopwatch, 88)
K. (Time::changeTime(), instance, 35) → (Watch::doTransition(), stopwatch, 88)
L. (Time::changeTime(), instance, 37) → (Watch::doTransition(), stopwatch, 88)
M. (Time::changeTime(), instance, 42) → (Watch::doTransition(), stopwatch, 88)
N. (Time::changeTime(), instance, 46) → (Watch::doTransition(), stopwatch, 88)
O. (Time::changeTime(), instance, 48) → (Watch::doTransition(), stopwatch, 88)
P. (Time::changeTime(), instance, 31) → (Watch::doTransition(), alarm, 94)
Q. (Time::changeTime(), instance, 35) → (Watch::doTransition(), alarm, 94)
61
R. (Time::changeTime(), instance, 37) → (Watch::doTransition(), alarm, 94)
S. (Time::changeTime(), instance, 42) → (Watch::doTransition(), alarm, 94)
T. (Time::changeTime(), instance, 46) → (Watch::doTransition(), alarm, 94)
U. (Time::changeTime(), instance, 48) → (Watch::doTransition(), alarm, 94)