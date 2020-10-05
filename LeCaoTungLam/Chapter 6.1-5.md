5.	Consider the problem of searching for a pattern string in a subject string. One possible implementation with a specification is on the book website; PatternIndex.java. This particular version has an incomplete specification–and a decent interface-based input domain model singles out the problematic input! Assignment: find the problematic input, complete the specification, and revise the implementation to match the revised specification.

-	The problem is what to do with empty patterns - an easy case for interface-based input domain models, since the empty string is a standard special case for string types. As written, the specification doesn’t address empty patterns at all – are they everywhere or nowhere? Note that empty subjects are a different matter - the specification has a natural interpretation for empty subjects in that patterns are never found in empty subjects. The JUnit tests in PatternIndexTest.java address the case of the empty subject.

-	The implementation is not satisfactory as written, since the result is an exception complaining about an out-of-bounds index, yet the caller isn’t supplying any indices.

-	One satisfactory solution is to amend the specification to explicitly reject empty patterns with the exception mechanism:
	@throws IllegalArgumentException if pattern is empty

-	For the implementation to match, it needs an explicit check for an empty pattern, along with an explicit throws clause:
	if (patternLen == 0) throw new IllegalArgumentException("PatternIndex.patternIndex");

-	Finally, a test case should be added to PatternIndexTest.java that calls patternIndex() with an empty pattern and looks for this exception.

-	As a forward pointer, the patternIndex() method is subject to significant scrutiny in the graph testing chapter. Yet the resulting tests do not uncover this anomaly.
