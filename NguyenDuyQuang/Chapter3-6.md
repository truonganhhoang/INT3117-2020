### Exercise 6: 
__a, A test that does not reach the fault:__
```


@Test
	 void testA() {
	     PrimeNumbers priNum = new PrimeNumbers();
	     priNum.computePrimes(0);
	 
	     assertEquals("[]", priNum.toString());
       // Nó không nhảy vào vòng while
    
	 }
```



__b, A test that reaches the fault, but does not infect:__
```
@Test
	 void testB() {
	     PrimeNumbers priNum = new PrimeNumbers();
	     priNum.computePrimes(7);
	 
	     assertEquals("[ 2, 3, 5, 7, 11, 13, 17]",  priNum.toString());
	     
	}
```


__c, A test that infects the state, but does not propagate:__
```
@Test
	 void testC() {
	     PrimeNumbers priNum = new PrimeNumbers();
	     priNum.computePrimes(8);
	 
	     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19,  priNum.toString());
	     // bắt đầu có lỗi từ số 19
	         
      
	 }
```



__d, A test that propagates, but does not reveal:__
- Không thể thực hiện vì số 19 bắt đầu sẽ có lỗi không tính số 9 vì ko phải nguyên tố tất cả các số kết thúc bằng 9 sau sẽ không có trong giá trị kết quả.





__e, A test that reveals the fault:__
```
@Test
	 void testE() {
	     PrimeNumbers priNum = new PrimeNumbers();
	     priNum.computePrimes(8);
	 
	     assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", priNum.toString());
	 }
```