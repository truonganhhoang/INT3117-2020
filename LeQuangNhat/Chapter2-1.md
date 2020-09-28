# How are faults and failures related to testing and debugging?

- ***Lỗi phần mềm (Software Fault)***, như đã nói ở bài tập chương 1, là lỗi nằm trong đoạn mã nguồn của chương trình mà chưa được phát hiện ra hay chưa được xử lý. Thôn
- ***Thất bại phần mềm*** (Software Failure), như đã nói ở bài tập chương 1, là hành vi phần mềm không đưa ra kết quả đúng so với thiết kế, và được phát hiện ra khi phần mềm đó được sử dụng (bởi người dùng, người kiểm thử, ...).
  - ***Mối liên hệ giữa lỗi và thất bại của phần mềm:*** như đã nói ở bài tập chương 1, dựa trên một vài thao tác nhất định của người dùng, phần mã nguồn lỗi sẽ được xử lý và từ đó gây nên thất bại phần mềm, khiến phần mềm đưa ra kết quả sai hoặc phần mềm đó sẽ tự thoát (terminate)
- ***Kiểm thử (Testing)*** là quá trình được diễn ra nhằm mục đích phơi bày lỗi và thất bại nằm trong phần mềm bằng cách cho phần mềm đó xử lý một hoặc nhiều bộ dữ liệu đầu vào (hay nói cách khác, test cases), và người kiểm thử sẽ quan sát hành vi của phần mềm đó khi nó đang được xử lý. Ngoài ra, một điều quan trọng nữa là không phải ca kiểm thử (test case) nào cũng có thể phát hiện được lỗi của phần mềm.
- ***Gỡ lỗi (Debugging)*** là quá trình thăm dò và kiểm tra đoạn mã nguồn sau khi một hoặc nhiều thất bại phần mềm (Failures) đã được phát hiện để tìm ra lỗi (Faults) gây ra thất bại đó.
- ***Mối liên hệ giữa lỗi phần mềm, thất bại phần mềm và kiểm thử, gỡ lỗi:*** Như đã viết ở trên, mục đích của kiểm thử và gỡ lỗi là để phơi bày thất bại phần mềm và từ đó truy tìm được phần mã nguồn lỗi gây ra thất bại đó, và phải truy tìm được nhiều lỗi nhất có thể.