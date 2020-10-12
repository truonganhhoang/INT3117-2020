# Chapter 7.2.2-6

## (a)
### Node Coverage TR:
(1), (2), (3), (4), (5), (6), (7), (8), (9), (10)

### Edge Coverage TR:
(1,4), (1,5), (2,5), (3,6), (3,7), (4,8), (5,8), (5,9), (6,2), (6,10), (7,10), (9,6)

### Prime Path Coverage TR:
(2,5,9,6,10), (3,6,2,5,8), (2,5,9,6,2), (1,5,9,6,2), (1,5,9,6,10), (3,6,2,5,9), (9,6,2,5,8), (9,6,2,5,9), (6,2,5,9,6), (5,9,6,2,5), (1,4,8), (1,5,8), (3,6,10), (3,7,10)

## (b)
[1,4,8]
[3,6,2,5,9]
[3,7,10]

Các test path bao phủ tất cả các nút nhưng cạnh (9,6) bị thiếu nên không đáp ứng Edge Coverage.
## (c)
[1,4,8]
[1,5,9,6,2,5,8]
[3,6,10]
[3,7,10]

Các test path trên thỏa mãn Edge Coverage nhưng không thỏa mãn Prime Path Coverage vì thiếu nhiều đường dẫn.