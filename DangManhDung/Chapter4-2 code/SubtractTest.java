///java///
import org.junit.*;
import static org.junit.Assert.*;
public class CalcTest {
	@Test public void testSubtract()
	{
		assertEquals (4,Calc.subtract(7, 3));
	}
}