package Chapter4;

import static  org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


class CalcTest {

    @Test
    public void testAdd() {
        assertEquals(10, Calc.add(8, 2));
    }
    @Test
    public void testSubtract() {
        assertEquals(5, Calc.subtract(10, 5));
    }
    @Test
    public void testMultiply() {
        assertEquals(20, Calc.multiply(2, 10));
    }
    @Test
    public void testDivide() {
        assertEquals(10, Calc.divide(80, 8));
    }
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calc.divide(1, 0);
        });
    }
}