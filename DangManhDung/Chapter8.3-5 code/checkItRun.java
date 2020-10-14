///java///

public class check
{
	public static void checkIt (boolean a, boolean b, boolean c)
	{
		if (a && (b || c))
		{
			System.out.println ("1: P is true");
		}
		else
		{
			System.out.println ("3: P isn’t true");
		}
	}
	
public static void checkItExpand (boolean a, boolean b, boolean c)
{
	if (a)
	{
		if (b)
		{
			System.out.println ("1: P is true");
		}
		else if (c)
		{
			System.out.println ("2: P is true");
		}
		else
		{
			System.out.println ("3: P isn’t true");
		}
	}
	else
	{
		System.out.println ("4: P isn’t true");
	}
}

public static void main (String[] args)
{
	boolean a = true;
	boolean b = true;
	boolean c = true;
	for (int i = 0; i < 2; i++)
	{
		for (int j = 0; j < 2; j++)
		{
			for (int k = 0; k < 2; k++)
			{
				System.out.println (a + " " + b + " " + c);
				System.out.print ("checkIt(): ");
				checkIt (a, b, c);
				System.out.print ("checkItExpand(): ");
				checkItExpand (a, b, c);
				c = !c;
			}
			b = !b;
		}
		a = !a;
	}
}
}