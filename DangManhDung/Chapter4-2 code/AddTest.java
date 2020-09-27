///java///
import org.junit.*;
import static org.junit.Assert.*;
public class CalcTest {
	@Test public void testAdd()
	{
		assertEquals (5,Calc.add(2, 3));
	}
}