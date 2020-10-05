# Answer the following questions for the method search() in the book:
* (a) “Location of element in list” fails the disjointness property. Give an example that illustrates this.
* (b) “Location of element in list” fails the completeness property. Give an example that illustrates this.
* (c) Supply one or more new partitions that capture the intent of “Location of element in list” but do not suffer from completeness or disjointness problems.

* Đặc trưng: Location of element in list
- Block 1: element is first entry in list.
- Block 2: element is last entry in list.
- Block 3: element is in some position other than first or last.

# Trả lời:
* (a) Đặc trưng "Location of element in list" (Vị trí của phần tử trong danh sách) vi phạm tính rời rạc (disjointness) vì nếu danh sách có độ dài là 1 phần tử thì khi đó, nếu phần tử đó chính là phần tử cần tìm thì nó thuộc cả 3 khối: vừa ở vị trí đầu, vừa ở vị trí cuối, vừa ở vị trí bất kì trong danh sách. Ví dụ: danh sách A = {1} và cần tìm số 1 trong danh sách.
* (b) Đặc trưng "Location of element in list" vi phạm tính toàn vẹn (completeness) vì nó không bao phủ toàn bộ tiêu chuẩn: nó thiếu trường hợp phần tử đó không có trong danh sách. Ví dụ: Danh sách A = {1, 2, 3} và cần tìm số 4 trong danh sách.
* (c) Với đặc trưng "Location of element in list" mà không vi phạm tính toàn vẹn hay tính rời rạc, em sẽ phân chia thành các đặc trưng nhỏ như sau:
	- Số lần xuất hiện của phần tử cần tìm trong danh sách: gồm các block: 0, 1, >1.
	- Phần tử cần tìm xuất hiện ở đầu danh sách: True và False.
	- Phần tử cần tìm xuất hiện ở cuối danh sách: True và False.