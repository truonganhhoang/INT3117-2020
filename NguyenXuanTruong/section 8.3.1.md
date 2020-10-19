Chúng ta có 4 mệnh đề:
- a: curTemp <dTemp - ngưỡngDiff
- b: Ghi đè
- c: curTemp <overTemp - ngưỡngDiff
- d: timeSinceLastRun> minLag

Và 2 vị từ:
- p1: (a || (b && c) && (d)
- p2: b

```java
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;
public class Test_Thermostat
{
	@Before
	public void init(){
		Thermostat ts = new Thermostat();
		ProgrammedSettings s = ProgrammedSettings();
	}

	@Test
	public void test_PC_true(){
		s.setSetting(Period.MORNING, DayType.WEEKDAY, 69);
    	ts.setPeriod(Period.MORNING);
    	ts.setDay(DayType.WEEKDAY);

    	//clause a
    	ts.setCurrentTemp(63);
    	ts.setThresholdDiff(5);

    	//clause b
    	ts.setOverride(true);

    	//clause c
	    ts.setOverTemp(70);

	    //clause d
    	ts.setMinLag(10);
    	ts.setTimeSinceLastRun(12);

    	assertTrue(ts.turnHeaterOn(s));
	}

	// Test each predicate to false to satisfy PC.
	public void test_PC_false(){
		s.setSetting(Period.MORNING, DayType.WEEKDAY, 69);
    	ts.setPeriod(Period.MORNING);
    	ts.setDay(DayType.WEEKDAY);

    	//clause a: false
    	ts.setCurrentTemp(63);
    	ts.setThresholdDiff(15);

    	//clause b: false
    	ts.setOverride(false);

    	//clause c: false
	    ts.setOverTemp(55);

	    //clause d: false
    	ts.setMinLag(20);
    	ts.setTimeSinceLastRun(15);

    	assertFalse(ts.turnHeaterOn(s));
	}
}
```