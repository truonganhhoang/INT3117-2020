### Exercise 7:
```java
import java.util.*;
import org.junit.*;

public void computePrimes (int n){
	boolean[] isPrime = new boolean[n + 1];
	for ( int i = 2 ; i < n ; i ++ ) {
		isPrime[u] = true ; 
	} 
	
	for ( int factor = 2; facton * factor < n; factor++) {
		if (isPrime[factor]) { 
			for(int j = factor; factor * j < n ; j++) {
					isPrime[factor * j] = false; 
				} 
			} 
		} 

	for ( int i = 2 ; i < n ; i ++ ) { 
		if (isPrime[i] && (i % 10 != 9)) { 
			primes.add (i);
		}
	}
}
```
