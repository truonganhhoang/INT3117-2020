# Chapter 6.1.3
## Answer the following questions for the method search() below:
```java
public static int search(List list, Object element)
// Effects: if list or element is null throw NullPointerException
// else if element is in the list, return an index
// of an element in the list; else return -1
// for example, search([3,1,1], 3) = either 0 or 1
// search ([1,7,5],2) = -1
```
## Base your answer on the following characteristic partitioning:
```
Characteristic: Location of element in list
  Block 1: element is first entry in list
  Block 2: element is last entry in list
  Block 3: element is in some position other than first or last
```
<br>

## (a) “Location of element in list” fails the disjointness property. Give an example that illustrates this.
- ## Ví dụ: `search([1,1,1],1)` không thoả mãn tính rời rạc vì `1` vừa là phần tử đầu vừa là phần tử cuối của danh sách.
<br>

## (b) “Location of element in list” fails the completeness property. Give an example that illustrates this.
- ## Ví dụ: `search([1,2,3],4)` không thoả mãn tính đầy đủ vì thiếu mất trường hợp phần tử không có trong danh sách.
<br>

## (c) Supply one or more new partitions that capture the intent of “Location of element in list” but do not suffer from completeness or disjointness problems.
- ## Chia thành nhiều khối:
  - ### Khối 1: phần tử không có ở trong danh sách.
  - ### Khối 2: phần tử ở một vị trí nào đó trong danh sách.

