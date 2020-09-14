- Ảnh 1: Tìm vị trí cuối cùng của phần tử <br>
  a. Kết quả sai do ở vòng for duyệt phần tử từ vị trí i=length – 1 đến vị trí i=1 (vì i > 0 nên chỉ duyệt đến i=1) nên kết quả ra sai.<br>
Cách sửa: thay i>0 thành i>=0 <br>
b. Tất cả các đầu vào đều gây ra lỗi, vì không duyệt phần tử ở vị trí 0. <br>
c. Đầu vào : x = [2, 1, 0, 3],  y=0<br>
    Kết quả mong muốn: 2<br>
    Kết quả thực tế: 2<br>
d. Đầu vào : x = [1, 1, 0, 1], y=1<br>
    Kết quả mong muốn: 3<br>
    Kết quả thực tế: 3<br>
e. Đầu vào : x = [2, 3, 5], y=2<br>
   Kết quả mong muốn: 0<br>
   Kết quả thực tế: -1<br>
  Code chạy:<br>
  x = [2, 3, 5]<br>
  i=2  có x[i] = 5 (!= 2) bỏ qua, i--<br>
  i=1 có x[i] = 3 (!= 2) bỏ qua, i--<br>
  i=0 thoát vòng lặp vì chỉ lấy i>0, lấy giá trị return -1.<br>
 => Actual ouput: -1<br>
f. Sửa lại:<br>
```java
public int findLast (int[] x, int y) {
        for (int i=x.length-1; i>=0; i--) 
        {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }
```
Đầu vào: x = [2, 3, 5], y = 2<br>
Kết quả: 0<br>
* Ảnh 2: Tìm vị trí cuối của số 0.<br>
a. Kết quả sai do vì 0 xuất hiện ở vị trí 0 nên khi x[i] == 0 nên chương trình đã trả về kết quả 0, chương trình sẽ trả kết quả ngay khi có sự xuất hiện 0.<br>
Cách sửa: thay vì duyệt từ đầu mảng, ta duyệt từ cuối mảng.<br>
b. Tất cả các đầu vào đều gây ra lỗi, vì không duyệt phần tử ở vị trí 0. <br>
c. Đầu vào: x = [2, 1, 0, 1]<br>
   Kết quả mong muốn: 2<br>
   Kết quả thực tế: 2<br>
d. Đầu vào: x = [2, 1, 0]    <br>
    Kết quả mong muốn: 2    <br>
    Kết quả thực tế: 2<br>
e. Đầu vào: x = [0, 1, 0]  <br>  
Kết quả mong muốn: 2   <br>
Kết quả thực tế: 0<br>
Code chạy: x = [0, 1, 0]   <br> 
                       i=0 có x[i]=0 nên trả về kết quả là 0.<br>
f. Sửa lại:<br>
 ```java
 public static int lastZero (int[] x) {
        for (int i=x.length-1; i>=0; i--) 
        {
            if (x[i] == 0) {
                return i;
            }
        }
        return -1;
    }
 ```
 Input : x = [0, 1, 0]<br>
Output: 2<br>
* Ảnh 3: Đếm giá trị dương<br>
a. Kết quả sai do giá trị dương lớn hơn 0 nhưng trong chương trình lại so sánh các giá trị trong mảng lớn hơn hoặc bằng 0.<br>
Cách sửa: thay x[i] >= 0 thành x[i] > 0<br>
b. Đầu vào là rỗng. Những đầu vào khác dẫn đến lỗi vẫn được thực thi.<br>
Đầu vào : x = []<br>
Kết quả mong muốn:  0<br>
Kết quả thực tế: 0<br>
c. Đầu vào : x = [2, 1, 3]<br>
Kết quả mong muốn: 3<br>
Kết quả thực tế: 3<br>
d. Đầu vào : x = [2, 1, 1]     <br>
Kết quả mong muốn: 3    <br>
Kết quả thực tế: 3<br>
e. Đầu vào: x = [-4, 2, 0, 2]<br>
     Kết quả mong muốn: 2   <br>
     Kết quả thực tế: 3<br>
Code chạy: <br>
x = [-4, 2, 0, 2]<br>
	i = 0, x[i] = -4 (<0), count = 0.<br>
	i = 1, x[i] = 2 (>0), count++ => count = 1.<br>
	i = 2, x[i] = 0 (=0), count++ => count = 2.<br>
	i = 3, x[i] = 2 (>0), count++ => count = 3.<br>
	=> Actual output: 3<br>
f. Sửa lại:<br>
```java
public int countPositive(int[] x) {
        int count = 0;
        for (int i=0; i<x.length; i++) 
        {
            if (x[i] > 0) 
            {
                count++;
            }
        }
        return count;
    }
```
Đầu vào: x = [-4, 2, 0, 2]<br>
Kết quả: 2<br>
* Ảnh 4: Đếm phần tử lẻ hoặc dương<br>
a. Kết quả sai do điều kiện if, vì trong mảng -3 là số lẻ âm nên điều kiện x[i] % 2 == 1 là sai trong trường hợp số lẻ âm.<br>
Cách sửa: thay x[i]%2 == 1 thành Math.abs(x[i])%2 == 1.<br>
b. Đầu vào là rỗng. Những đầu vào khác dẫn đến lỗi vẫn được thực thi.<br>
Input : x = []<br>
Expected output:  0<br>
Actual output: 0<br>
c. Tất cả đầu vào có giá trị dương<br>
     Đầu vào: x = [2, 1, 4, 5]<br>
     Kết quả mong muốn: 4<br>
     Kết quả thực tế: 4<br>
d. Đầu vào : x = [2, 1, 4]<br>
     Kết quả mong muốn: 3<br>
     Kết quả thực tế: 3<br>
e. Đầu vào: x = [-3, -2, 0, 1, 4]<br>
     Kết quả mong muốn:  3<br>
   Kết quả thực tế: 2<br>
    Code chạy: <br>
    x = [-3, -2, 0, 1, 4]<br>
	     count = 0<br>
	     i=0 thì x[i] = -3 (<0 và chia cho 2 dư -1), count = 0<br>
	     i=1 thì x[i] = -2 (< 0 và chia cho 2 dư 0), count = 0<br>
	     i=2 thì x[i] = 0  (= 0 và chia cho 2 dư 0), count = 0<br>
	     i=3 thì x[i] = 1  (> 0), count = 1<br>
	     i=4 thì x[i] = 4  (> 0), count = 2<br>
    	=>Actual output: 2     <br>
        f. Cài đặt:<br>
```java
public static int oddOrPos(int[] x){
        int count = 0;
        for (int i=0; i<x.length; i++)
        {
            if (Math.abs(x[i])%2 == 1 || x[i] > 0)
            {
                count++;
            }
        }
        return count;
    } 
```
Đầu vào: x = [-3, -2, 0, 1, 4]<br>
Kết quả: 3
