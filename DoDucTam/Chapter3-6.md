## **Question 6: Sử dụng class PrimeNumbers mô tả 5 test bằng cách sử dụng các method của class để hiển thị các điểm tiếp theo:** ##

## **a) A test that does not reach the fault** ##

## **b) A test that reaches the fault but does not infect** ##

## **c) A test that infects the state but does not propagate** ##

## **d) A test that propagates but does not reveal** ##

## **e) A test that reveals a fault** ##


Khi một test không tìm ra fault được gọi trong method computerPrime với tham số nhỏ hơn hoặc bằng 0 computerPrime(0)

Điều này sẽ không cho ta biết được operation đang được thực hiện là gì và fault hiện tại đang ở đâu

Đối với test số 2, nếu ta gọi method với một tham số trong ví dụ 3, computerPrime(3), chương trình sẽ chạy 1 phần của code nơi mà fault đang tồn tại, nhưng vì 3 không kết thúc bởi kí tự 9 nên nó khong bị ảnh hưởng

Đối với test thứ 3, nếu ta gọi method với tham số là 19, nó sẽ không trả về 19 là số nguyên tố gây ra bởi fault trong chương trình. Nhưng vì ta không chay toString() cho class PrimeNumber nên dù có bị ảnh hưởng, nó cũng không truyền đi và người dùng cũng không nhận ra

Đối với test thứ 4, cũng giống như test 3, nhưng lần này ta sẽ dùng method toString() khiến người dùng nhận ra điều gì sai trong việc thực hiện. Chỉ khi người dùng nhận ra điều này (bằng việc so sánh kết quả test giống nhau) thì stage mới hiện ra rõ ràng, nếu không nó sẽ tiếp tục ở stage chuyển tiếp
