# Section 7.4-3

# Use the following program fragment for questions a{e below.
Use the following test inputs:
• t1 = f1 (0, 0)
• t2 = f1 (1, 1)
• t3 = f1 (0, 1)
• t4 = f1 (3, 2)
• t5 = f1 (3, 4)

a, Draw the call graph for this program fragment

b, Give the path in the graph followed by each test.

- t1: [f1, f3, f5, f6]
- t2: [f1, f3, f4, f5]
- t3: [f1, f2]
- t4: [f1, f3, f4, f6]
- t5: [f1, f2, f3, f4, f6]

c, Find a minimal test set that achieves Node Coverage.

- có 3 khả năng {t1, t2, t3}, {t1, t3, t4} hoặc {t1, t5}

d, Find a minimal test set that achieves Edge Coverage.

- {t1, t5}

e, Give the prime paths in the graph. Which prime path is not
covered by any of the tests above?

- có 4 đường dẫn chính: {[f1, f2, f3, f4, f6], [f1, f2, f3, f5, f6], [f1,
f3, f4, f6], [f1, f3, f5, f6]}