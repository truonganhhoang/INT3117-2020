Viết ra thuộc tính để thể hiện yêu cầu: *"Liệt kê toàn bộ những con chuột không dây mà được bán giá trên $100 hoặc cửa hàng mang nó có hơn 20 hàng. Đồng thời liệt kê chuột không phải không dây mà được bán giá trên $50"*

* ((mouseType = wireless) ^ ((retail > 100) v (stock > 20))) v (not(mouseType = wireless) ^ (retail > 50))