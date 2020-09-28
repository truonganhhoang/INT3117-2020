import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CalcTest {
    @Test public void testAdd(){
        assertTrue(Calc.add(1,2) == 3);
        assertEquals(9,Calc.add(3.5,5.5),0);
    }
    @Test public void testSubtract(){
        assertTrue(Calc.subtract(5,4) == 1);
        assertEquals(2, Calc.subtract(2.5,0.5),0);
    }
    @Test public void testMultiply(){
        assertTrue(Calc.multiply(5,2) == 10);
        assertEquals(19.25,Calc.multiply(3.5,5.5),0);
        assertEquals(7,Calc.multiply(3.5,2),0);
    }
    @Test public void testDivide(){
        assertTrue(Calc.divide(6,2) == 3);
        assertEquals(1.5,Calc.divide(3,2),0);
    }
}
