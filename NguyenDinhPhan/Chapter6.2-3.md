# Chapter 6.2.3
## Write down all 16 tests to satisfy Multiple Base Choice coverage (MBCC) for the second categorization of triang()’s inputs in Table 6.2. Use the values in Table 6.3.

<br>

## Các base choice được chọn là (lớn hơn 1) và (bằng 1) của cạnh đầu tiên:
```
{(2,2,2),(1,2,2)}
```


## Các test tương ứng với base choice ```(2,2,2)```:
```
{(2,2,2),
(0,2,2),(1,2,2),(-1,2,2),
(2,0,2),(2,1,2),(2,-1,2),
(2,2,1),(2,2,0),(2,2,-1)}
```

## Các test tương ứng với base choice ```(1,2,2)```:
```
(1,2,2) 
(0,2,2),(1,2,2),
(1,1,2),(1,0,2),(1;1,2),
(1,2,1),(1,2,0),(1,2;1)}
```

