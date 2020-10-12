# 4.

## (a)

- Ta chỉ có 1 callsite : trash() --> takeOut() (Line 12).

## (b)

  (trash(), m, 5) --> (takeOut(), a, 19)
  (trash(), m, 7) --> (takeOut(), a, 19)
  (trash(), n, 9) --> (takeOut(), b, 21)
  (trash(), n, 9) --> (takeOut(), b, 23)
  (trash(), n, 11) --> (takeOut(), b, 21)
  (trash(), n, 11) --> (takeOut(), b, 23)
  (takeOut(), e, 21) --> (trash(), o, 13)
  (takeOut(), e, 23) --> (trash(), o, 13)

## (c)

- x = 0: thỏa mãn 1, 6, 8
- x = 1: thỏa mãn 2, 5, 7
- x = 6: thỏa mãn 2, 3, 7
-  4 không thể thỏa mãn vì nếu trash :: x > 5, m = 4, thì takeout :: x sẽ lớn hơn 0.