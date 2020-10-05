# Chapter6.2-4

Answer the following questions for the method `intersection()` below:

`(a)` Does the partition *“Validity of s1”* satisfy the completeness property? If not, give a value for s1 that does not fit in any block. <br/>
`(b)` Does the partition *“Validity of s1”* satisfy the disjointness property? If not, give a value for s1 that fits in more than one lock. <br/>
`(c)` Does the partition *“Relation between s1 and s2”* satisfy the completeness property? If not, give a pair of values for s1 and s2 that does not fit in any block.<br/>
`(d)` Does the partition *“Relation between s1 and s2”* satisfy the disjointness property? If not, give a pair of values for s1 and s2 that fits in more than one block.<br/>
`(e)` If the *“Base Choice”* criterion were applied to the two partitions (exactly as written), how many test requirements would result?<br/>
`(f)` Revise the characteristics to eliminate any problems you found.

<hr/>

`(a)` Đúng. <br/>
`(b)` Đúng. <br/>
`(c)` Sai. <br/>
Xét 2 danh sách là: `{1, 2}` và `{1,3}`, ta thấy trường hợp này không thuộc các tính chất đã cho. <br/>
`(d)` Sai. <br/>
Nếu như 2 danh sách giống nhau thì cũng có nghĩa là danh sách 1 là tập con của danh sách 2 và ngược lại, danh sách 2 cũng là tập con của danh sách 1.<br/>
`(e)` Số test sẽ là 6 (1 ca kiểm thử cơ sở, 2 ca kiểm thử cho tính chất 1 và 3 ca kiểm thử cho tính chất 2).
