```Java
public static void checkIt (boolean a, boolean b, boolean c)
{
	if (a && (b || c))
	{
		System.out.println ("P is true");
	}
	else
	{
	System.out.println ("P isn’t true");
	}
}
```

a) 
```Instrument checkItExpand() ```
```Java
public static boolean checkItExpand(boolean a, boolean b, boolean c)
{
	if (a){
		if (b){
			return true;
		}
		else if (c)
		{
			return true;
		}
		else{
			return false;
		}
	}
	else{
		return false;
	}
}
```

b,
T1 = {FTT, TFF, TTF, TFT} sẽ đủ để đáp ứng GACC cho checkIt ()
T2 = {TTT, TFT, TFF, FFF} sẽ đáp ứng Edge Coverage cho checkItExpand ()

c,
```Test checkIT()```
```Java
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_CheckIt {
    public static boolean checkIt (boolean a, boolean b, boolean c)
    {
        if (a && (b || c))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Test
    public void test_checkIt()
    {
        assertFalse(checkIt(false, true, true));
        assertTrue(checkIt(true, false, true));
        assertFalse(checkIt(true, false, false));
        assertTrue(checkIt(true, true, false));
    }
}
```

```Test checkItExpand()```
```Java
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_CheckItExpand {
    public static boolean checkItExpand(boolean a, boolean b, boolean c)
    {
        if (a){
            if (b){
                return true;
            }
            else if (c)
            {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    @Test
    public void test_checkItExpand()
    {
       assertTrue(checkItExpand(true, true, true));
       assertTrue(checkItExpand(true, false, true));
       assertFalse(checkItExpand(true, false, false));
       assertFalse(checkItExpand(false, false, false));
    }
}
```