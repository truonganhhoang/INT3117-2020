///java///
import org.junit.*;
import static org.junit.Assert.*;
public class CalcTest {
	@Test public void testExponent()
	{
		assertEquals (6561,Calc.exponent(3, 8));
	}
}