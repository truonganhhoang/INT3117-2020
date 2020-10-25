# Generate tests to satisfy PDC for the bank example grammar.

# Trả lời:
stream  -> action^*
	-> action action^*
* Test 1:
	-> dep action^*
	-> deposit account amount action^*
	-> deposit digit^3 amount action^*

	-> deposit 123 $ digit+ "." digit^2 action^*
	-> deposit 123 $ 4.56 action^*
* Test 2:
	-> deb action^*
	-> debit account amount action^*
	-> debit 123 $ 4.56 action^* 