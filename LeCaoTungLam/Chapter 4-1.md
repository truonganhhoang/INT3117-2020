import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import static org.junit.Assert.*;
	





	public class testcalculator {
	    
	    private calculator calculator_test;
	

	    @Before
	    public void setUp() throws Exception {
	        this.calcalculator_test= new calculator();
	        
	    }
	

	    @After
	    public void tearDown() throws Exception {
	        calcalculator_test = null;
	    }
	

	    @Test
	    public void Testadd() throws Exception {
	        assertEquals(9,cal.add(2,7));
	

	    }
	

	    @Test
	    public void testSubtract() throws Exception {
	        assertEquals(15,cal.sub(18,3));
	    }
	

	    @Test
	    public void testMultiplyByZero() throws Exception {
	        assertEquals(0,cal.mul(3,0));
	    }
	

	    @Test
	    public void testDivideByZero() throws Exception {
	        assertEquals(0,cal.dividebyZero(3,0));
	    }
	

	    @Test
	    public void testMultiply() throws Exception {
	        assertEquals(20,cal.mul(4,5));
	    }
	

	    @Test
	    public void testDivide() throws Exception {
	        assertEquals(15,cal.testdevide(30,2));
	    }
	}

