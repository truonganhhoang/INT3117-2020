# Chapter 6.1-4 
>Derive input space partitioning test inputs for the GenericStack class assuming the following method signatures:
```java
public GenericStack ();
public void push (Object X);
public Object pop ();
public boolean isEmpty ();
```
Assume the usual semantics for the GenericStack. Try to keep your partitioning simple and choose a small number of partitions and blocks.

`(a)` List all of the input variables, including the state variables. <br/>
`(b)` Define characteristics of the input variables. Make sure you cover all input variables. <br/>
`(c)` Define characteristics of inputs. <br/>
`(d)` Partition the characteristics into blocks. <br/>
`(e)` Define values for each block.

<hr/>

Với ngăn xếp, chúng ta có các tính chất như sau:
- Ngăn xếp rỗng:
    - Đúng: `{}`
    - Sai: `{1,2}, {1,2,3}`
- Kích thước của ngăn xếp:
    - 0: `{}`
    - 1: `{1}` 
    - lớn hơn 1: `{1,2}, {1,2,3}`
- Trong stack có phần tử giá trị `null` :
    - Đúng: `{1,null, 2}`
    - Sai: `{1,2}, {1,2,3}`

Với đối tượng X, chúng ta có tính chất sau:
- X là phần tử `null`
    - Đúng: `x = null`
    - Sai: `x = 1`
    
Ngoài ra, ta có tính chất kết hợp giữa đối tượng X và trạng thái của ngăn xếp:
- Đối tượng X nằm trong ngăn xếp:
    - Đúng: `({1,2,3}, 1)`
    - Sai: `({1,2,3}, 4)`