# Section 7.2-4

```
Answer questions a{d for the graph defined by the following sets: 
• N = f1; 2; 3; 4g 
• N0 = f1g • Nf = f4g 
• E = f(1; 2); (2; 3); (3; 2); (2; 4)
```

a, Draw Graph

/Assets/Graph 7.2-4.png

b, If possible, list test paths that achieve Node Coverage, but not Edge Coverage. If not possible, explain why not.

- Trong đồ thị này thì điều đó là không thể. Tất cả các đường đi đều phải bắt đầu ở node 1, gặp node 2 và kết thúc ở node 4. Bất kỳ đường kiểm tra nào mà gặp node 3 đều phải đi qua đỉnh 2 và 3.

c, If possible, list test paths that achieve Edge Coverage, but not Edge Pair Coverage. If not possible, explain why not.

- chu trinh đi qua mọi đỉnh là T={1,2,3,2,4}

d, List test paths that achieve Edge Pair Coverage.

- chu trình bao phủ đi qua cặp đỉnh đôi là T={1,2,4}, T2={1,2,3,2,3,2,4}
