# 8.1.6.

p = (a v b) ^ c

```
type(x) = type(y) = 'int'
type(done) = 'bool'
type(list) = 'list of strings'
type(str) = 'string'

p = (x < y v done) ^ list.contain(str)
```

TR bao phủ mệnh đề:
- x < y = true
- x < y = false
- done = true
- done = false
- list.contain(str) = true
- list.contain(str) = false

Giá trị:
- x = 3, y = 4
- x = 4, y = 3
- done = true
- done = false
- ['a', 'b', 'c'].contain('a')
- ['a', 'b', 'c'].contain('d')

