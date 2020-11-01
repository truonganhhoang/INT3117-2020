**6.1-5. Consider the problem of searching for a pattern string in a subject string. One possible implementation with a specification is on the book website; PatternIndex.java. This version has an incomplete specification–and a good interface-based input domain model should single out the problematic input! Assignment: find the problematic input, complete the specification, and revise the implementation to match the revised specification.**

- Vấn đề: xử lý đầu vào là chuỗi rỗng.
- Giải quyết bằng cách dùng ```@throws IllegalArgumentException``` nếu là chuỗi rỗng. Dùng ```if (patternLen == 0) throw new IllegalArgumentException("PatternIndex.patternIndex");```.
