# Chapter 8 - Section 3 - Exercise 5

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

## (a) Transform checkIt() to checkItExpand(), a method where each if statement tests exactly one boolean variable. Instrument checkItExpand() to record which edges are traversed. (“print” statements are fine for this.)

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
## (b) Derive a GACC test set T1 for checkIt(). Derive an EdgeCoverage test set T2 for checkItExpand(). Build T2 so that it does not satisfy GACC on the predicate in checkIt()
T1 = {FTT,TFF,TTF,TFT} would be enough to satisfy GACC for checkIt()

### checkItExpand() graph
![image](./checkItExpand.png)

T2 = {TTT, TFT, TFF, FFF} would satisfy Edge Coverage for checkItExpand()

### (c) Run both T1 and T2 on both checkIt() and checkItExpand().

**Test checkIT()**

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
**Test checkItExpand()**
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