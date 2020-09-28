**Question:** 
How are faults and failures related to testing and debugging?

**Answer:**

Như bài trước:
* Lỗi tĩnh (hay còn gọi là "Fault") là lỗi chưa được thể hiện ra bên ngoài của mã nguồn của sản phẩm phần mềm.
* Lỗi (hay còn gọi là "Failure") là các lỗi đã thể hiện ra bên ngoài khi chương trình thực thi không đúng với mong muốn của nhà phát triển hoặc nhà đầu tư, không phù hợp với đặc tả yêu cầu.

Kiểm thử (testing) là quá trình người kiểm thử (tester) đưa các bộ test case đã được soạn sẵn vào chương trình để chương trình thực hiện. Từ đó, khiếm khuyết (fault) sẽ được thể hiện ra ngoài thành thành lỗi (failure) mà con người có thể nhận biết, quan sát được.

Gỡ lỗi (debugging) là quá trình lướt qua mã nguồn (source code) để tìm các khiếm khuyết (fault) của phần mềm. Nếu ngăn chặn, xóa bỏ được các khiếm khuyết (fault) đó thì sẽ giảm thiểu được rất nhiều lỗi (failure) khi thực thi chương trình sau này
