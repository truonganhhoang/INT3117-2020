package Assets;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class PrimeNumbersTest {
  @Test
  public void testComputePrimesA() {
    PrimeNumbers primeNums = new PrimeNumbers();
    primeNums.computePrimes(0);
    assertEquals("[]", primeNums.toString());
  }

  @Test
  public void testComputePrimesB() {
    PrimeNumbers primeNums = new PrimeNumbers();
    primeNums.computePrimes(5);
    assertEquals("[2, 3, 5, 7, 11]", primeNums.toString());
  }
  
  @Test
  public void testComputePrimesC() {
    PrimeNumbers primeNums = new PrimeNumbers();
    primeNums.computePrimes(8);
    assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", primeNums.toString());
  }

  @Test
  public void testComputePrimesD() {
    // None
  }

  @Test
  public void testComputePrimesE() {
    // Like testComputePrimesC()
  }
}
