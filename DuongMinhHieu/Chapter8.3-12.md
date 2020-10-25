# Consider the `GoodFastCheap` class, available on the book website. This class implements the old engineering joke: “Good, Fast, Cheap: Pick any two!”

* (a) Develop tests that achieve RACC for the predicate in the `isSatisfactory()` method. Implement these tests in JUnit.

* (b) Suppose we refactor the `isSatisfactory()` method as
shown below:
```java
public boolean isSatisfactory()
{
	if (good && fast) return true;
	if (good && cheap) return true;
	if (fast && cheap) return true;
	
	return false;
}
```
The RACC tests from the original method do not satisfy RACC on the refactored method. List what is missing, and add the missing tests to the JUnit from the prior exercise.

* (c) Develop tests that achieve MUMCUT for the predicate in the `isSatisfactory()` method of the GoodFastCheap class. Implement these tests in JUnit.

# Trả lời:
* (a) + (c) Link code: <https://github.com/duongminhhieu16/CodeKiemThu>.

* (b) Thiếu ca kiểm thử {FTT}:
```java
makeFast();
makeCheap();
assertTrue(isSatisfactory());
```