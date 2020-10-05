# Chapter 6-1.3

> Answer the following questions for the method search() below:
>
> Base your answer on the following characteristic partitioning:
>
> (a) “Location of element in list” fails the disjointness property. Give an example that illustrates this.
>
> (b) “Location of element in list” fails the completeness property. Give an example that illustrates this.
>
> (c) Supply one or more new partitions that capture the intent of “Location of element in list” but do not suffer from completeness or disjointness problems.

(a) Phân hoạch không đảm bảo sự không trùng lặp:
```list: ({1,0,0,1},1)```
>
Phần tử ```1``` vừa thuộc Block 1 và Block 2.

(b) Phân hoạch không đảm bảo sự đầy đủ:
```list: ({1,2,3,4},0)```
>
Phần tử ```0``` không thuộc 1 trong 3 Block.

(c)

+ Block 1: Phần tử nằm ở hai đầu của danh sách
+ Block 2: Phần tử nằm ở giữa danh sách
+ Block 3: Phần từ không nằm trong danh sách
