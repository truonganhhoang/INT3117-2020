# Chapter 7.4-3

**Use the following program fragment for questions a–e below.**

**Use the following test inputs:**

-   `t`<sub>`1`</sub>` = f1 (0, 0)`
-   `t`<sub>`2`</sub>` = f1 (1, 1)`
-   `t`<sub>`3`</sub>` = f1 (0, 1)`
-   `t`<sub>`4`</sub>` = f1 (3, 2)`
-   `t`<sub>`5`</sub>` = f1 (3, 4)`

`(a)` **Draw the call graph for this program fragment.**

`(b)` **Give the path in the graph followed by each test.**

-   `t`<sub>`1`</sub>`: [f1, f3, f5, f6]`
-   `t`<sub>`2`</sub>`: [f1, f3, f4, f6]`
-   `t`<sub>`3`</sub>`: [f1, f2]`
-   `t`<sub>`4`</sub>`: [f1, f3, f4, f6]`
-   `t`<sub>`5`</sub>`: [f1, f2, f3, f4, f6]`

`(c)` **Find a minimal test set that achieves Node Coverage.**

`{t`<sub>`1`</sub>`, t`<sub>`2`</sub>`, t`<sub>`3`</sub>`}, {t`<sub>`1`</sub>`, t`<sub>`3`</sub>`, t`<sub>`4`</sub>`}`
hoặc `{t`<sub>`1`</sub>`, t`<sub>`5`</sub>`}.`

`(d)` **Find a minimal test set that achieves Edge Coverage.**

`{t`<sub>`1`</sub>`, t`<sub>`5`</sub>`}.`

`(e)` **Give the prime paths in the graph. Which prime path is not covered by any of the tests above?**

Có 4 prime paths:<br/>
`[f1, f2, f3, f4, f6],`<br/>
`[f1, f2, f3, f5, f6],`<br/>
`[f1, f3, f4, f6],`<br/>
`[f1, f3, f5, f6]`

Đường thứ hai không được bao phủ bởi các đường dẫn thử nghiệm đã cho.
