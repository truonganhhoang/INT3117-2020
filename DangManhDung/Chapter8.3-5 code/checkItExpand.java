///java///

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