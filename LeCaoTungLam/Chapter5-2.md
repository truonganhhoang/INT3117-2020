2.	How else could we compare test criteria besides subsumption?

-	It is not rare to compare test criteria in terms of fault detection. One approach is analytical; certain criteria are guaranteed to reveal certain fault classes, and the fault classes can be compared. The DNF criteria in chapter 3 are an example of this approach.

-	Another approach is experimental. Sample program included with faults and test criteria are applied in a statistically meaningful manner. In a few occasions, naturally occurring faults are used (if available), sometimes faults are randomly seeded, and the most common method for seeding faults is mutation analysis.

-	Comparing criteria in terms of the number of tests needed is a feasible option. The idea is that criteria that require more tests are possibly, but not necessarily, exercising the software more extensively. This approach seems less useful than either subsumption or fault detection ability.
