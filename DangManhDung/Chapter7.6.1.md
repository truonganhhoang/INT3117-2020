Tạo hai trường hợp sử dụng cho tương tác với ATM.

**Trường hợp:** rút tiền từ tài khoản

**Tóm tắt:** khách hàng dùng một thẻ hợp lệ để lấy tiền từ tài khoản ngân hàng hợp lệ
**Người tham gia:** khách hàng
**Trạng thái ban đầu:** ATM hiện màn hình chờ

(a) Khách hàng cho thẻ ATM vào máy đọc thẻ ATM
(b) Nếu hệ thống phát hiện ra thẻ, nó sẽ đọc số thẻ
(c) Hệ thống yêu cầu mã PIN từ khách hàng
(d) Khách hàng nhấn vào mã PIN
(e) Hệ thống kiểm tra ngày hết hạn và thẻ có bị cướp hoặc đánh mất
(f) Nếu thẻ là hợp lệ, hệ thống kiểm tra xem mã PIN có khớp mã PIN của thẻ không
(g) Nếu mã PIN khớp, hệ thống tìm xem tài khoản nào thẻ có thể tương tác được
(h) Hệ thống hiển thị tài khoản của khách hàng và yêu cầu khách hàng chọn một loại thanh toán. Có ba loại: *Lấy tiền từ tài khoản, Xem số dư, Chuyển tiền*
(i) Khách hàng chọn *Lấy tiền từ tài khoản*, chọn số tài khoản, gõ vào số lượng
(j) Hệ thống kiểm tra xem tài khoản có hợp lệ, khách hàng có đủ tiền trong tài khoản không, mức rút tiền trong ngày chưa được vượt quá, ATM có đủ tiền không
(k) Nếu bốn tiêu chí thỏa mãn, hệ thống rút ra tiền
(l) Hệ thống in ra hóa đơn với số thanh toán, loại thanh toán, số lượng rút ra, số dư tài khoản mới
(m) Hệ thống nhả ra thẻ
(n) Hệ thống hiện màn hình chờ

* Nếu hệ thống không nhận diện được thẻ, nó nhả thẻ ra và hiện màn hình chờ
* Nếu ngày hiện tại quá ngày hết hạn, thẻ sẽ bị thu lại và hệ thống hiện màn hình chờ
* Nếu thẻ được báo là bị cướp hoặc đánh mất, sẽ bị thu lại và hệ thống hiện màn hình chờ
* Nếu khách hàng điền số PIN không khớp số PIN của thẻ, hệ thống yêu cầu điền lại mã PIN
* Nếu khách hàng điền sai mã pin ba lần, thẻ sẽ bị thu lại và hệ thống hiện màn hình chờ
* Nếu số tài khoản được chọn bởi khách hàng không hợp lệ, hệ thống hiển thị thông báo lỗi ,nhả thẻ ra và hiện màn hình chờ
* Nếu yêu cầu rút tiền vượt quá mức trong ngày, hệ thống hiển thị thông báo xin lỗi, nhả thẻ ra và hiện màn hình chờ
* Nếu yêu cầu rút tiền vượt quá lượng tiền trong ATM, hệ thống hiển thị thông báo xin lỗi, nhả thẻ ra và hiện màn hình chờ
* Nếu khách hàng chọn *Cancel*, hệ thống dừng thanh toán, nhả thẻ ra và hiện màn hình chờ
* Nếu yêu cầu rút tiền vượt quá số dư trong tài khoản, hệ thống hiển thị thông báo xin lỗi, nhả thẻ ra và hiện màn hình chờ

**Trạng thái kết thúc:** Tiền được rút ra từ tài khoản của khách hàng


**Trường hợp:** xem số dư
**Tóm tắt:** khách hàng dùng một thẻ hợp lệ để xem số dư từ tài khoản ngân hàng hợp lệ
**Người tham gia:** khách hàng
**Trạng thái ban đầu:** ATM hiện màn hình chờ

(a) Khách hàng cho thẻ ATM vào máy đọc thẻ ATM
(b) Nếu hệ thống phát hiện ra thẻ, nó sẽ đọc số thẻ
(c) Hệ thống yêu cầu mã PIN từ khách hàng
(d) Khách hàng nhấn vào mã PIN
(e) Hệ thống kiểm tra ngày hết hạn và thẻ có bị cướp hoặc đánh mất
(f) Nếu thẻ là hợp lệ, hệ thống kiểm tra xem mã PIN có khớp mã PIN của thẻ không
(g) Nếu mã PIN khớp, hệ thống tìm xem tài khoản nào thẻ có thể tương tác được
(h) Hệ thống hiển thị tài khoản của khách hàng và yêu cầu khách hàng chọn một loại thanh toán. Có ba loại: *Lấy tiền từ tài khoản, Xem số dư, Chuyển tiền*
(i) Khách hàng chọn *Xem số dư*, chọn số tài khoản
(j) Hệ thống kiểm tra xem tài khoản có hợp lệ
(k) Nếu kiểm tra thành công, hệ thống in ra hóa đơn với số thanh toán, loại thanh toán, số dư tài khoản hiện tại
(l) Hệ thống nhả ra thẻ
(m) Hệ thống hiện màn hình chờ

* Nếu hệ thống không nhận diện được thẻ, nó nhả thẻ ra và hiện màn hình chờ
* Nếu ngày hiện tại quá ngày hết hạn, thẻ sẽ bị thu lại và hệ thống hiện màn hình chờ
* Nếu thẻ được báo là bị cướp hoặc đánh mất, sẽ bị thu lại và hệ thống hiện màn hình chờ
* Nếu khách hàng điền số PIN không khớp số PIN của thẻ, hệ thống yêu cầu điền lại mã PIN
* Nếu khách hàng điền sai mã pin ba lần, thẻ sẽ bị thu lại và hệ thống hiện màn hình chờ
* Nếu số tài khoản được chọn bởi khách hàng không hợp lệ, hệ thống hiển thị thông báo lỗi ,nhả thẻ ra và hiện màn hình chờ
* Nếu khách hàng chọn *Cancel*, hệ thống dừng thanh toán, nhả thẻ ra và hiện màn hình chờ


**Trạng thái kết thúc:** Không có thay đổi gì xảy ra với tài khoản của khách hàng
