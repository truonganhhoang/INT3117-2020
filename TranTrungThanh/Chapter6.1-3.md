>Answer the following questions for the method ```search()```\
>Base your answer on the following characteristic partitioning\
>(a) “Location of element in list” fails the disjointness property. Give
 an example that illustrates this.\
 (b) “Location of element in list” fails the completeness property.
 Give an example that illustrates this.\
 (c) Supply one or more new partitions that capture the intent of
 “Location of element in list” but do not suffer from
 completeness or disjointness problems.


(a) \
Tính chất của phân hoạch không đảm bảo sự không trùng lặp:
```list: ({1,2,3,1},1)```\
Ta thấy phần từ ```1``` vừa là phần từ đầu, vừa là phần tử cuối, vừa thuộc Block 1 và Block 2

(b) \
Tính chất của phần hoạch không đảm bảo sự đầy đủ:
```list: ({1,2,3,1},4)```\
Ta thấy phần tử ```4``` không nằm trong danh sách và không thuộc 1 trong 3 Block

(c) \
Ta chia tính chất thành 3 Block:
+ Block 1: Phần tử nằm ở hai đầu của danh sách
+ Block 2: Phần tử nằm ở giữa danh sách
+ Block 3: Phần từ không nằm trong danh sách

