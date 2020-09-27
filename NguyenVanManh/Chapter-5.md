# Exercises

## 1. Suppose that coverage criterion C1 subsumes coverage criterion C2. Further suppose that test set T1 satisfies C1 on program P, and test set T2 satisfies C2, also on P.

### (a) Does T1 necessarily satisfy C2? Explain.
### (b) Does T2 necessarily satisfy C1? Explain.
### (c) If P contains a fault, and T2 reveals the fault, T1 does not necessarily also reveal the fault. Explain.

* (a) T1 has to satisfy C2 based on subsumption.
* (b) T2 is not guaranteed to satisfy testing requirement created by C1.
* (c) Subsumption concept is about criteria, meaning C1's criteria contains C2's criteria. That doesn't mean testing set of T1 contains testing set of T2. Therefore, there may be a testing case of T2 failure which does not happens in T1.

## 2. How else could we compare test criteria besides subsumption?

We can compare the criteria of testing by:
* Check if the testing set cover all the graph's edge, if yes means they cover all the graph's points. Then, the testing set satisfy all the branch criteria of the program P, as well as the completeness of the commands. The reverse is not true. However, sometimes all of the edge is covered but the conditions are still in short.
* Given condition: Cover all scenario with more details/
* Multi-condition: Calculated by Cc/(Ce-Ci) with Cc as combined covered number, Ci combined imposibility number
* MC/DC (Modified condition/decision): Change the covered condition/decision.
