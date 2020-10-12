# Chapter 7.3-1

> (a) Draw a control flow graph for this program fragment. Use the node numbers given above.\
> (b) Which nodes have defs for variable w?\
> (c) Which nodes have uses for variable w?\
> (d) Are there any du-paths with respect to variable w from node 1 to node 7? If not, explain why not. If any exist, show one.\
> (e) List all of the du-paths for variables w and x.

(a)

- Node 1: w=x
- Node 2: w++ (với m>0)
- Node 3: w=2*w (với m<=0)
- Node 4: y
- Node 5: x = 6*y (với y <=10)
- Node 6: x=3*y+5 (với y >10)
- Node 7: z = w+x

Đường đi ```1 -> {2,3} -> 4 -> {5,6} -> 7```

(b)
Các node 1, 2, 3 có defs là w.

(c)
Các node 2, 3, 7 có uses là w

(d)
Không có đường dẫn du-paths với w từ 1 đến 7. Các def trên các nút 2 và 3 chặn các def trong nút 1.

(e)

- ```[1, 2]```: w
- ```[1, 3]```: w
- ```[2, 4, 5, 7]```: w
- ```[2, 4, 6, 7]```: w
- ```[3, 4, 5, 7]```: w
- ```[3, 4, 6, 7]```: w
- ```[5, 7]```: x
- ```[6, 7]```: x
