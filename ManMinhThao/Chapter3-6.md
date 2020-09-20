## Viết 5 bộ test cho các trường hợp sau:

a, 1 test không với được đến hàm bị lỗi:

```java
    void testA(){
	     PrimeNumbers priNum = new PrimeNumbers();
	     priNum.computePrimes(0);
	 
	     assertEquals("[]", priNum.toString());
       // Test không nhảy vào vòng while (count <= n)  
	 }
```

b, 1 test đến được hàm bị lỗi nhưng không bị ảnh hưởng:

```java
    void testB(){
        PrimeNumbers priNum = new PrimeNumbers();
	        priNum.computePrimes(3);
	 
	        assertEquals("[2, 3, 5]", priNum.toString());
        //Test không báo lỗi dù chạy qua hàm lỗi vì không có số nguyên tố nào trong bộ test có hàm đơn vị là 9
    }
```

c, 1 test có ảnh hưởng đến chương trình nhưng không bị truyền ra ngoài:

```java
    void testB(){
        PrimeNumbers priNum = new PrimeNumbers();
	        priNum.computePrimes(3);
	 
	        assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]");
        //Test có lỗi nhưng vì không có hàm toString() nên tester không thể biết được
```

