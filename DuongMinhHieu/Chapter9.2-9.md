# Try to design mutation operators that subsume Combinatorial Coverage. Why wouldn’t we want such an operator?

# Trả lời:
* Ví dụ như a = b * c thì ta đổi thành a += b * c,.. đến khi ta được tất cả tổ hợp. Ta không muốn có toán tử như vậy vì khi đó ta sẽ không kiểm thử được từng trường hợp.