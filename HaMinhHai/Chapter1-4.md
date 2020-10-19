# 4. Bài tập giúp việc kiểm thử trở nên nghiêm ngặt hơn
a) Viết phương thức JAVA trả về một Vectơ của các đối tượng nằm trong hai đối số Vectơ
``` java
public static Vector union (Vector a, Vector b)
{
	Vector res = new Vector (a); // lấy tất cả các phần từ của vector a
	Iterator itr = b.iterator();
	while (itr.hasNext())
	{
		Object obj = itr.next();
		if (!a.contains (obj))
		{ // nếu có tồn tại phần tử của a
			result.add (obj);
		}
	}
	return result;
}
```

b) Mô tả nhiều lỗi nhất có thể. (Lưu ý: Vector là một thư viện trong Java. Nếu bạn đang sử dụng một ngôn ngữ khác, hãy diễn giải Vector dưới dạng danh sách.)
```
- Điều gì xảy ra nếu
?	input Vector là null?
?	input Vector bị trùng lặp?
?	input Vector chứa các null entries?
?	các input được sửa đổi?
? 	giá trị trả về luôn là 1 new Set hoặc có thể là a hoặc b?
```
- Lựa chọn kiểu đối số và trả về dạng Vector, best practice là sử dụng loại ít cụ thể nhất phù hợp với mục tiêu đề ra.
- Đặc biết nếu Vector được thay thế bằng List sẽ giải quyết 1 số vấn đề nhưng không phải tất cả. Thay thế bằng Set sẽ là 1 ý tưởng tốt hơn.

c) Sẽ không gặp khó khăn khi tạo ra các tests bổ sung. Lưu ý: Các giải pháp khác để giải quyết ambiguities chắc chắn là có thể. Ví dụ, specifier có thể quyết định xử lý các input null. Hoặc, specifier có thể chặn các input null với 1 điều kiện tiên quyết.

d) Viết lại phương pháp cho chính xác để làm rõ các lỗi và sự mơ hồ được xác định trước đó.
``` java
public static Set union (Set a, Set b)
// EFFECTS: if (a || b) = null => throw NullPointerException
// else return a new Set that is the set union of a, b
// e.g. union (null,{}) is NullPointerException
// e.g. union ({1,2},{2,3}) is {1,2,3}
// e.g. union ({1,2},{cat,hat}) is {1,2,cat,hat}
// e.g. union ({null},{cat,hat}) is {null,cat,hat}
// e.g. union (a,a) is Set t st that t!=a, but t.equals(a)
```

