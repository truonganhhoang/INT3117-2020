# Chapter6.2-4

>Answer the following questions for the method intersection() below:
>
>(a) Does the partition “Validity of s1” satisfy the completeness property? If not, give a value for s1 that does not fit in any block.\
> (b) Does the partition “Validity of s1” satisfy the disjointness property? If not, give a value for s1 that fits in more than one block.\
> (c) Does the partition “Relation between s1 and s2” satisfy the completeness property? If not, give a pair of values for s1 and s2 that does not fit in any block.\
> (d) Does the partition “Relation between s1 and s2” satisfy the disjointness property? If not, give a pair of values for s1 and s2 that fits in more than one block.\
> (e) If the “Base Choice” criterion were applied to the two partitions (exactly as written), how many test requirements would result?\
> (f) Revise the characteristics to eliminate any problems you found.

(a) Thỏa mãn tính toàn vẹn. \
(b) Thỏa mãn tính rời rạc \
(c) Sai. \
Xét 2 tập là: ```s1: {1, 2}``` và ```s2: {1, 3, 4}```, ta thấy trường hợp này không thuộc các tính chất đã cho. \
(d) Sai. \
Xét 2 tập là: ```s1: {1, 2}``` và ```s2: {1, 2}```, ta thấy trường hợp này thuộc 3 block 1, 2, 3. \
(e) Số test sẽ là 6 (1 ca kiểm thử cơ sở, 2 ca kiểm thử cho tính chất 1 và 3 ca kiểm thử cho tính chất 2).
