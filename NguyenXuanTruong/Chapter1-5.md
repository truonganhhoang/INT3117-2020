5, 
Hàm lastZero()

(a)Vòng lặp for nên duyệt từ cuối về đầu:

    for (int i=x.length-1; i >= 0; i--)

(b)Tất cả các inputs đều gây ra Fault, kể cả NULL input

(c)Error xảy ra ở vòng lặp, nên nếu không thực sự thực hiện vòng lặp, sẽ không không xuất hiện Error, đó là trường hợp xâu có độ dài bằng 0 hoặc 1

    Input: x = [5]
    Expected Output: -1
    Actual Output: -1

(d)Error xảy ra bất cứ khi nào thực hiện vòng lặp, tuy nhiên khi phần tử 0 ở vị trí thứ 2 trong xâu 3 phần tử, đó là 1 trường hợp cho Failure đúng

    Input: x = [1, 0, 3]
    Expected Output: 1
    Actual Output: 1

(e)Phẩn tử đầu tiên của testcase có giá trị bằng 0, i=0, nó chính là kết quả được trả về, tuy nhiên kết quả mong đợi là i=2 hay i=length.x.

    Input: x = [0, 1, 0]
    Expected Output: 2
    Actual Output: 0
    First Error State: x = [0, 1, 0], i = 0

(f)Thay vòng lặp for thành for (int i= x.length-1; i >= 0; i--)

Hàm oddOrPos()

(a)Thiếu điều kiện các số âm

    if (x[i]%2 == -1 || x[i] > 0)  

(b)Tất cả các inputs đều gây ra Fault, trừ NULL input

    Input: x = []
    Expected Output: 0
    Actual Output: 0

(c)Error xảy ra ở việc thiếu trường hợp cho các phần tử âm, nên nếu testcase không bao gồm các phần tử âm, sẽ không không xuất hiện Error

    Input: x = [1, 2, 3]
    Expected Output: 3
    Actual Output: 3 

(d)Mọi Error đều dẫn tới Failure

(e) Input: x = [-3, -2, 0, 1, 4]

    Expected Output: 3
    Actual Output: 2
    First Error State:
        x = [-3, -2, 0, 1, 4]
        i = 0;
        count = 0;

(f)Bổ sung thêm điều kiện 

    if (x[i]%2 == -1 || x[i] > 0)
