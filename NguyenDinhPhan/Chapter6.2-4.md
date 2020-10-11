# Chapter 6.2.4
## Answer the following questions for the method ```intersection()``` below:
```
public Set intersection (Set s1, Set s2) 
// Effects: If s1 or s2 is null throw NullPointerException 
// else return a (non null) Set equal to the intersection 
// of Sets sl and s2 
  Characteristic: Validity of s1
    - sl = null 
    - sl = {} 
    - s1 has at least one element 
  Characteristic: Relation between s1 and s2 
    - s1 and s2 represent the same set 
    - s1 is a subset of s2 
    - s2 is a subset of s1
    - s1 and s2 do not have any elements in common 

```
<br>

## (a) Does the partition “Validity of s1” satisfy the completeness property? If not, give a value for s1 that does not fit in any block.
- ## Có.
<br>

## (b) Does the partition “Validity of s1” satisfy the disjointness property? If not, give a value for s1 that fits in more than one block.
- ## Có. Các trường hợp rỗng, không có phần tử, có nhiều hơn 1 phần tử không bao gồm hay giao nhau.
<br>

## (c) Does the partition “Relation between s1 and s2” satisfy the completeness property? If not, give a pair of values for s1 and s2 that does not fit in any block.
- ## Không. Vì thiếu mất trường hợp s1 giao với s2. 
- ## VD: ``` s1=(1,2,3); s2=(2,3,4)```
<br>

## (d) Does the partition “Relation between s1 and s2” satisfy the disjointness property? If not, give a pair of values for s1 and s2 that fits in more than one block.
- ## Không, vì nếu s1 và s2 cùng là một tập thì sẽ thoả mãn cả điều kiện (s1 là tập con của s2) và (s2 là tập con của s1).
<br>

## (e) If the “Base Choice” criterion were applied to the two partitions(exactly as written), how many test requirements would result?
- ## Sẽ có 1 lựa chọn làm cơ sở, sau đó thuộc tính đầu còn lại 2 trường hợp và thuộc tính thứ hai còn lại 3 trường hợp chưa xét. Do đó tổng cộng sẽ có 6 test.
<br>


## (f) Revise the characteristics to eliminate any problems you found.
- ## Thuộc tính thứ 2 không thoả mãn tính đầy đủ và rời rạc.
- ## Sửa lại:
  ```
    Characteristic: Relation between s1 and s2 
    - s1 and s2 have at least one element in common
    - s1 and s2 do not have any elements in common 
  ```