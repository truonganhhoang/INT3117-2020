///java///
import org.junit.*;
import static org.junit.Assert.*;
public class CalcTest {
	@Test public void testMultiply()
	{
		assertEquals (7,Calc.multiply(1, 7));
	}
}