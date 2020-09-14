# When overriding the `equals()` method, programmers are also required to override the `hashCode()` method; otherwise clients cannot store instances of these objects in common Collection structures such as `HashSet`. For example, the `Point` class from Chapter 1 is defective in this regard.
(a) Demonstrate the problem with Point using a HashSet.

(b) Write down the mathematical relationship required between `equals()` and `hashCode()`.

(c) Write a simple JUnit test to show that `Point` objects do not enjoy this property.

(d) Repair the `Point` class to fix the fault.

(e) Rewrite your JUnit test as an appropriate JUnit theory. Evaluate it with suitable DataPoints.


# Trả lời:

* (a) 
```java
    Point p1 = new Point(1, 2);
    Point p2 = new Point(1, 2); // p1 = p2
    Set<Point> s = new HashSet<Point>();
    s.add(p1);
    boolean b = s.contains(p2); // Expectation: true. Actual: false.
```
Do `p1 = p2` nên ta hi vọng kết quả là `b = true`, nhưng do hai điểm p1 và p2 có hash code khác nhau, do đó `b = false`.

* (b) Quan hệ toán học yêu cầu giữa `equals()` và `hashCode()` là: nếu hai vật thể được cho là bằng nhau (qua phương thức `equals()`) thì chúng phải có hash codes như nhau (qua phương thức `hashCode()`), nhưng ngược lại thì không đúng.

* (c)
```java
    @Test
    public void checkHashCodes(){
        Point p1 = new Point(2, 3);
	Point p2 = new Point(2, 3);
        assertTrue("Hash codes bang nhau", p1.hashCode() = p2.hashCode());
    }
```

* (d)
```java
    @Override
    public int hashCode(){
        int result = 15;
        result = 45 * result + x;
        result += 7 * y;
        return result;
    }
```

* (e)
```java
    @Theory
    public void checkHashCodesTheory(Object obj1, Object obj2){
        assumeTrue(obj != null);
	assumeTrue(obj != null);
        assumeTrue(obj1.equals(obj2));
        assertTrue("Hash codes bang nhau", obj1.hashCode() == obj2.hashCode());
    }
    @DataPoints
    public static Object[] objects = { new Point(2, 3), new Point(2, 3), new Point(1, 3), "das", null};
    }
```