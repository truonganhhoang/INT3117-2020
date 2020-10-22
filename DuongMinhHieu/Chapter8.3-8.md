# For the `patternIndex()` program in Chapter 7, complete the test sets for the following coverage criteria by filling in the “don’t care” values. Make sure to ensure reachability. Then derive the expected output. Download the program, compile it, and run it with your resulting test cases to verify correct outputs.

* (a) Predicate Coverage (PC).

* (b) Clause Coverage (CC).

* (c) Combinatorial Coverage (CoC).

* (d) Correlated Active Clause Coverage (CACC).

# Trả lời:
* Ta có
	* Mệnh đề b: iSub + patternLen - 1 < subjectLen: true.
	* Mệnh đề c: subject.charAt (iSub) == pattern.charAt (0): true.
	* Mệnh đề d: subject.charAt (iSub + iPat) != pattern.charAt (iPat): true.
	* Vị từ: b & c & d.
* (a) Bao phủ vị từ: {TTT, FTT}.
```java
// Test 1
subject = "aaa";
pattern = "a";

// Test 2
subject = "a";
pattern = "aaa";
```

* (b) Bao phủ mệnh đề: {TFT, TTF, TTT, FTT}.
```java
// Test 1
