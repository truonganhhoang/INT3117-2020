# **Question:** 
The following exercise is intended to encourage you to think of testing in a more rigorous way than you may be used to. The exercise also hints at the strong relationship between specification clarity, faults, and test cases

**Dịch**
> Bài tập sau đây nhằm khuyến khích bạn nghĩ đến việc kiểm thử theo cách nghiêm ngặt hơn bạn thường làm. Bài tập cũng gợi ý mối quan hệ chặt chẽ giữa sự rõ ràng của đặc tả, lỗi và các ca kiểm thử

# **Answer:**
**<h2>(a)</h2>** 
Write a Java method with the signature
public static Vector union (Vector a, Vector b) The method should return a Vector of objects that are in either of the two argument Vectors.
> Viết một phương thức trong java: public static Vector union (Vector a, Vector b). Phương thức này sẽ trả về một Vector của các đối tượng mà nó nằm trong một trong hai vector truyền vào

```java
import java.util.Vector;

public class Solution{
    private Solution(){}
    public static Vector union(Vector a, Vector b){
        Vector union = new Vector<>();
        a.forEach(
                (object) -> {
                    union.add(object);
                }
        );
        b.forEach(
                (object) -> {
                    union.add(object);
                }
        );
        return union;
    }
}
```

**<h2>(b)</h2>**
Upon reflection, you may discover a variety of defects and
ambiguities in the given assignment. In other words, ample
opportunities for faults exist. Describe as many possible faults as you can. (Note: Vector is a Java Collection class. If you are using another language, interpret Vector as a list)

> bla bla... Câu a cho có nhiều khiếm khuyết và nhiều điều không rõ ràng. Nói cách khác là nó sinh ra lỗi *(fault)*. Hãy mô tả càng nhiều lỗi càng tốt
>> Chú ý: Vector là một Collection trong Java. Nếu bạn sử dụng ngôn ngữ khác thì hãy chuyển Vector thành List)

Answer:
- Kiểu dữ liệu không rõ ràng, việc sử dụng vector thay vì Collection sẽ khiến mất đi tính kế thừa (Vector implement của List, List lại là implementation của Collection)
- Việc khởi tạo một vector là tốn bộ nhớ nếu mảng đối tượng nhỏ hơn 10. Do vector khi khởi tạo nếu không chỉ định gì thì mặc định sẽ khơi tạo với dung lượng 10 phần tử. Nếu thêm phần tử mới vào (vector khởi tạo với capacity tự tạo) và vượt quá sức chứa của vector thì vector tự scale ra thêm 100% capacity đó nữa
- Đầu bài không clear (Có check điều kiện object có cả trong a và b thì thêm cả 2 hay là một thôi - check trùng lặp)
- Tên phương thức không rõ ràng

**<h2>(c)</h2>**
Create a set of test cases that you think would have a reasonable chance of revealing the faults you identified above. Document a rationale for each test in your test set. If possible, characterize all of your rationales in some concise summary. Run your tests against your implementation.

**Test Case**:
- Vector a (0, 1), Vector b(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    * Em lựa chọn test case này để mô tả sự tốn bộ nhớ của Vector khi luôn khởi tạo mảng có 10 phần tử.
- Vector a (0, 1, 2, 3, 4, 5, 6, 7, 8, 9), Vector b();
    * Em lựa chọn test case này vì muốn biết nếu Vector b rỗng thì có bị NullPointerException không

**<h2>(d)</h2>**
Reformat code để sửa các lỗi

```java
import java.util.Vector;

public class Solution{
    private Solution(){}
    public static Vector union(Vector a, Vector b){
        while()
        Vector union = new Vector<>(a);
        b.forEach(
                (object) -> {
                    if(!a.contains(object))
                        union.add(object);
                }
        );
        return union;
    }
}
```