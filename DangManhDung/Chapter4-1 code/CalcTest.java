///java///
import org.junit.*;
import static org.junit.Assert.*;
public class CalcTest {
	@Test public void testAdd()
	{
		assertEquals (5,Calc.add(2, 3));
	}
	@Test public void testSubtract()
	{
		assertEquals (4,Calc.subtract(7, 3));
	}
	@Test public void testMultiply()
	{
		assertEquals (7,Calc.multiply(1, 7));
	}
	@Test public void testDivide()
	{
		assertEquals (2.5,2.5,Calc.divide(5, 2));
	}
}