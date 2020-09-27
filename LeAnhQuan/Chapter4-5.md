Câu 5:  
- Code đầu:
```java
public class number_string{
  int dem = 0;
  public static int number0fstring(String[] strings){
    for(int i = 1; i< strings.legnth(); i++){
      if(strings.chartAt[i] != '')dem++;
     }
     return dem;
  }
}
```

- Kiểm có lỗi:
```java
public class test_number_string{
  @Test
  public static void test_number0fstring(){
    string a = "hello";
    assertEquals(4, number_string.number0fstring[a]);
    /// Error: number_string.number0fstring[a] = 3 not 4
  }
}  
```

- Sau khi sửa:
```java  
public class number_string{
  int dem = 0;
  public static int number0fstring(String[] strings){
  /// Sửa i=1 thành i=0
    for(int i = 0; i< strings.legnth(); i++){
      if(strings.chartAt[i] != '')dem++;
     }
     return dem;
  }
}
```  

-Kiểm không còn lỗi:
```java
public class test_number_string{
  @Test
  public static void test_number0fstring(){
    string a = "hello";
    assertEquals(4, number_string.number0fstring[a]);
    /// True: number_string.number0fstring[a] = 4 
  }
}  
```
