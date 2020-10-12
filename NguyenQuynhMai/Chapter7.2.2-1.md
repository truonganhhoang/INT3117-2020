Định nghĩa lại độ bao phủ cạnh:
- Bao phủ nút (NC): Tập kiểm thử T thỏa mãn bao phủ nút trên một đồ thị G nếu với mỗi nút n có thể tiếp cận theo cú pháp trong N có đường đi p nào đó trong tập path(T) mà p thăm n.
Đơn giản hơn là TR chứa mỗi nút có thể tới được trong G.
- Bao phủ cạnh (EC) mạnh hơn bao phủ nút một chút: TR chứa mỗi một đường tới được với độ dài lên tới 1 trong G (lên tới 1 nghĩa là tính cả 1 nút và 0 cạnh).
- NC và EC chỉ khác nhau khi có một cạnh và một đường con khác giữa một cặp nút. Ví dụ đồ thị có đường đi từ 1 tới 3: 1-3 và 1-2-3.
Bao phủ nút có: TR = {1, 2, 3} và Test Path = [1, 2, 3].
Bao phủ cạnh có: TR = {(1, 2), (1, 3), (2, 3)} và Test Path = [1, 2, 3] và [1, 3].
