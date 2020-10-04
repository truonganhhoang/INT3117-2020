3.	Write down all 16 tests to satisfy Multiple Base Choice coverage (MBCC) for the second categorization of triang()’s inputs in Table 6.2. Use the values in Table 6.3.

		{(2, 2, 2), //First base test

		(0, 2, 2),(−1, 2, 2), //V ary f irst characteristic
		(2, 1, 2),(2, 0, 2),(2, −1, 2), //V ary second characteristic
		(2, 2, 1),(2, 2, 0),(2, 2, −1), //V ary third characteristic

		{(1, 2, 2), //Second base test
		(0, 2, 2),(−1, 2, 2), //V ary f irst characteristic
		(1, 1, 2),(1, 0, 2),(1, −1, 2), //V ary second characteristic
		(1, 2, 1),(1, 2, 0),(1, 2, −1), //V ary third characteristic
		}

	Here are the 16 nonredundant tests:
	{
		(2, 2, 2),
		(0, 2, 2),(−1, 2, 2),
		(2, 1, 2),(2, 0, 2),(2, −1, 2),
		(2, 2, 1),(2, 2, 0),(2, 2, −1),
		(1, 2, 2),
		(1, 1, 2),(1, 0, 2),(1, −1, 2),
		(1, 2, 1),(1, 2, 0),(1, 2, −1)
	} 