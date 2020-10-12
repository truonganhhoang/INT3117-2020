# Chapter 7.2.2-7.

## (a)
- p2,p3 là các test paths
- p1 không phải là test path bởi vì nó không kết thúc tại nút cuối cùng.
- p2 không phải là test path bởi vì nó không bắt đầu tại nút đầu tiên.
- p5 không phải là test path vì [2,3,2,3] không phải một đường dẫn hợp lệ.

## (b)
#### Edge-Pair Coverage TR:
(1,2,1), (1,2,3), (1,3,1), (2,1,2), (2,1,3), (2,3,1), (3,1,2), (3,1,3)

## (c)
Các đường dẫn trong phần (a) không đáp ừng Edge-Pair Coverage vì chúng không bao gồm 2 đường dẫn con (2,1,2) và (3,1,3).
## (d)
P2 does not tour the prime path [3,1,3] directly. P2 tour the prime path with a detour through node (2). (Câu này em không biết trả lời tiếng việt thế nào ạ.)