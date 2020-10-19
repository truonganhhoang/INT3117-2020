# Chapter 8.1-6

**In Section 8.1.6, we introduced the example `p = (a ∨ b) ∧ c`, and provided expanded versions of the clauses using program variables. We then gave specific values to satisfy PC. We also gave truth values to satisfy CC. Find values for the program variables given to satisfy CC; that is, refine the abstract tests into concrete test values.**

<hr/>

Khẳng định (predicate) là:
<br/>`p = (a ∨ b) ∧ c`
Được chuyển thành:
<br/>`p = ((x < y) v `*`done`*`) ^ list.contain(str)`
<br/> Trong đó:

-   `a: x < y`, `a` là một biểu thức quan hệ cho các biến `x` và `y`
-   `b: done`, một giá trị boolean
-   `c: list.contains (str)`, dành cho các đối tượng là danh sách (list) và chuỗi (string)
