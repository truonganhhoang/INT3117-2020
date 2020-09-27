

## Question 5


### Chương trình cần sửa
```java
public class Calc
{
	
	private static int tinh_giai_thua(int k)
 {
		int temp = 1;
		if(k<0) {
			return -1;
		}else if((k==0)||(k==1)) {
			return 1;
		}else {
			for(int i=2; i<k; i++) {
				temp*= i;
			}
		}
		return temp;
	}

}
```
+ nó thiếu dấu bằng ở đoạn code bên dưới nên nó chỉ trả về giai thừa n-1
```java
for(int i=2; i<k; i++)
```
### Chương trình Sau khi  sửa
```java
public class Calc 
{
	
	private static int tinh_giai_thua(int k) 
{
		int temp = 1;
		if(k<0) {
			return -1;
		}else if((k==0)||(k==1)) {
			return 1;
		}else {
			for(int i=2; i<=k; i++) {
				temp*= i;
			}
		}
		return temp;
	}
}
```
### Testcase 
```java
public class CalcTest  {
	@Test public void test_tinh_giai_thua()
	{
		assertEquals (120,Calc.tinh_giai_thua(5));
	}
}
```