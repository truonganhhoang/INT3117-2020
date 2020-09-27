2. 
- Sử dụng Jenkins để thiết lập tích hợp liên tục.
- Ví dụ: chương trình có đầu ra là chuỗi "Hello world!" và kiểm tra xem ứng dụng có hoạt động như mong đợi hay không.
Mã nguồn: App.java
```java
package testing.app;

public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
