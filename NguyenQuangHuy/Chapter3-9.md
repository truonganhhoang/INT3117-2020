(a)

_**Point p1 = new Point(1, 2);**_

_**Point p2 = new Point(1, 2); // p1.equals(p2)**_

_**Set\&lt;Point\&gt; s = new HashSet\&lt;Point\&gt;();**_

_**s.add(p1);**_

_**boolean b = s.contains(p2);**_

Nếu như b đúng thì sẽ có hai đối tượng Point trỏ đến hai buckets khác nhau, dẫn đến b sẽ sai!!!

(b)

2 đối tượng chỉ có thể bằng nhau (thông qua _**equal()**_) nếu chúng có cùng hash code.

2 đối tượng khác nhau vẫn có thể có cùng hash code

(c)

_**@Test public void hashConsistentWithEquals() {**_

_**Point p1 = new Point(1,2);**_

_**Point p2 = new Point(1,2);**_

_**assertTrue(&quot;Hash codes must match&quot;, p1.hashCode() == p2.hashCode());**_

_ **}** _

(d)

_**@Override public int hashCode() {**_

_ **int result = 17;** _

_ **result = 31 \* result + x;** _

_ **result = 31 \* result + y;** _

_ **return result;** _

_ **}** _

(e)

_**@Theory public void hashConsistentWithEqualsTheory(Object o1, Object o2) {**_

_**assumeTrue(o1 != null);**_

_**assumeTrue(o2 != null);**_

_**assumeTrue(o1.equals(o2));**_

_**assertTrue(&quot;Hash codes must match&quot;, o1.hashCode() == o2.hashCode());**_

_ **}** _

_**@DataPoints public static Object[] objects = {**_

_**new Point(1,2), new Point(1,2), new Point(1,3), &quot;ant&quot;, null**_

_ **};** _

Có một số điều cần lưu ý về lý thuyết này. Trước tiên, để làm cho lý thuyết này chung chung càng tốt, và do đó càng hữu ích càng tốt, kỹ sư kiểm tra phải luôn chọn các kiểu tham số càng gần gốc của hệ thống phân cấp kiểu càng tốt. Vì thế các tham số cho phương pháp lý thuyết có kiểu _ **Object** _, và không thuộc kiểu _ **Point** _. Đây là thích hợp vì các phương thức _**equals ()**_ và _**hashCode ()**_ được định nghĩa trong lớp _ **Object** _ . Nói cách khác, mặc dù động cơ cho lý thuyết này là các đối tượng _ **Point** _, kết quả áp dụng cho tất cả các đối tượng Java! Thứ hai, các giả định về các giá trị không rỗng nghĩa là lý thuyết này có thể được áp dụng mà không cần lo lắng về việc liệu _ **DataPoints** _ tình cờ chứa giá trị _ **null** _. Thứ ba, lý thuyết này được đánh giá qua tích chéo của bộ năm giá trị trong cấu trúc _ **DataPoints** _ với chính nó. Trong số này 5 \* 5 = 25 giá trị, 5 không vượt qua điều kiện tiên quyết đầu tiên. Trong số 20 người còn lại, 4 người không đạt điều kiện tiên quyết thứ hai. Trong số 16 lần làm lại, 6 chiếc vượt qua điều kiện tiên quyết thứ ba. Tất cả 6 trong số này thỏa mãn hậu điều kiện.