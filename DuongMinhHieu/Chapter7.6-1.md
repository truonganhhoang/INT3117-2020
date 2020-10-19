# Construct two separate use cases and use case scenarios for interactions with a bank Automated Teller Machine. Do not try to capture all the functionality of the ATM into one graph; think about two different people using the ATM and what each one might do. Design test cases for your scenarios.

# Trả lời:
* Ta xét 2 trường hợp sử dụng là Rút tiền và Gửi tiền. Rút tiền ta xét kịch bản không đủ tiền trong cây ATM. Gửi tiền ta xét kịch bản số tài khoản gửi tới không hợp lệ. Từ 1-8 dùng chung cho cả 2 trường hợp sử dụng.
1. Khách hàng cho thẻ ATM vào khe đọc thẻ ATM.
2. Nếu hệ thống nhận diện đượcc thẻ, nó sẽ đọc số thẻ.
3. Hệ thống yêu cầu khách hàng nhập mã PIN.
4. Khách hàng nhập mã PIN.
5. Hệ thống kiểm tra thẻ có hợp lệ không (còn hạn sử dụng không, thẻ có bị đánh cắp không,...).
6. Nếu thẻ hợp lệ, hệ thống kiểm tra mã PIN có chính xác không.
7. Nếu mã PINs chính xác, hệ thống kiểm tra loại tài khoản của khách hàng.
8. Hệ thống hiển thị các thông tin và yêu cầu khách hàng chọn 1 loại giao dịch.

* Rút tiền:
9. Khách hàng chọn rút tiền, chọn số tài khoản và nhập số tiền cần rút.
10. Hệ thống kiểm tra nếu tài khoản hợp lệ, đảm bảo tài khoản của khách hàng còn đủ tiền, đảm bảo giới hạn giao dịch của thẻ vẫn còn và đảm bảo còn tiền trong cây ATM.
11. Tài khoản của khách hàng không đủ tiền, hệ thống sẽ hiển thị thông báo, kết thúc giao dịch và yêu cầu khách hàng nhận thẻ.
12. Hệ thống đẩy thẻ ra và hiển thị tin nhắn chào khách hàng.

* Gửi tiền:
9. Khách hàng chọn gửi tiền, nhập số tài khoản cần gửi và nhập số tiền cần gửi,
10. Hệ thống kiểm tra nếu tài khoản hợp lệ, đảm bảo tài khoản của khách hàng còn đủ tiền, đảm bảo giới hạn giao dịch của thẻ vẫn còn và đảm bảo còn tiền trong cây ATM, kiểm tra số tài khoản khách hàng nhập có tồn tại.
11. Số tài khoản của khách hàng nhập không hợp lệ thì hệ thống sẽ hiển thị thông báo và kết thúc giao dịch, yêu cầu khách hàng nhận thẻ.
12. Hệ thống đẩy thẻ ra và hiển thị tin nhắn chào khách hàng.