Dùng thuộc tính i tới x sau:

        i. p = a ^ (notb v c)
        ii. p = a v (b ^ c)
        iii. p = a ^ b
        iv. p = a -> (b -> c)
        v. p = a ⊕ b
        vi. p = a <-> (b ^ c)
        vii. p = (a v b) ^ (c v d)
        viii. p = (nota ^ notb) v (a ^ notc) v (nota ^ c)
        ix. p = a v b v (c ^ d)
        x. p = (a ^ b) v (b ^ c) v (a ^ c)

(a) Liệt kê mệnh đề đi với p

* i. ii. iv vi. viii x. : a,b,c
* iii. v. : a,b
* vii. ix. : a,b,c,d

(b) Tính ra và đơn giản hóa điều kiện để mỗi mệnh đề xác định thuộc tính p

Predicate|pa|pb|pc|pd
-|-|-|-|-
i.|notb v c|a ^ notc|a ^ b| 
ii.|notb v notc|nota ^ c|nota ^ b| 
iii.|b|a| | 
iv.|b ^ notc|a ^ notc|a ^ b| 
v.|T|T| | 
vi.|T|c|b| 
vii.|notb ^ (c v d)|nota ^ (c v d)|notd ^ (a v b)|notc ^ (a v b) 
viii.|b v c|nota ^ notc|a v b| 
ix.|notb ^ (notc v notd)|nota ^ (notc v notd)|nota ^ notb ^ d|nota ^ notb ^ d
x.|b ^ notc v notb ^ c|a ^ notc v nota ^ c|a ^ notb v nota ^b| 

(c) Viết bảng đầy đủ cho thuộc tính

* i.

.|a|b|c|p|pa|pb|pc
-|-|-|-|-|-|-|-
1|T|T|T|T|T| |T
2|T|T|F| | |T|T
3|T|F|T|T|T| | 
4|T|F|F|T|T|T| 
5|F|T|T| |T| | 
6|F|T|F| | | | 
7|F|F|T| |T| | 
8|F|F|F| |T| | 

* ii.

.|a|b|c|p|pa|pb|pc
-|-|-|-|-|-|-|-
1|T|T|T|T| | | 
2|T|T|F|T|T| | 
3|T|F|T|T|T| | 
4|T|F|F|T|T| | 
5|F|T|T|T| |T|T
6|F|T|F| |T| |T
7|F|F|T| |T|T| 
8|F|F|F| |T| | 

* iii.

.|a|b|p|pa|pb
-|-|-|-|-|-
1|T|T|T|T|T
2|T|F| | |T
3|F|F| |T| 
4|F|F| | | 

* iv.

.|a|b|c|p|pa|pb|pc
-|-|-|-|-|-|-|-
1|T|T|T|T| | |T
2|T|T|F| |T|T|T
3|T|F|T|T| | | 
4|T|F|F|T| |T| 
5|F|T|T|T| | | 
6|F|T|F|T|T| | 
7|F|F|T|T| | | 
8|F|F|F|T| | | 

* v.

.|a|b|p|pa|pb
-|-|-|-|-|-
1|T|T| |T|T 
2|T|F|T|T|T
3|F|T|T|T|T
4|F|F| |T|T

* vi.

.|a|b|c|p|pa|pb|pc
-|-|-|-|-|-|-|-
1|T|T|T|T|T|T|T
2|T|T|F| |T| |T
3|T|F|T| |T|T| 
4|T|F|F| |T| | 
5|F|T|T| |T|T|T
6|F|T|F|T|T| |T
7|F|F|T|T|T|T| 
8|F|F|F|T|T| | 

* vii.

.|a|b|c|d|p|pa|pb|pc|pd
-|-|-|-|-|-|-|-|-|-
1|T|T|T|T|T| | | | 
2|T|T|T|F|T| | |T| 
3|T|T|F|T|T| | | |T
4|T|T|F|F| | | |T|T
5|T|F|T|T|T|T| | | 
6|T|F|T|F|T|T| |T| 
7|T|F|F|T|T|T| | |T
8|T|F|F|F| | | |T|T 
9|F|T|T|T|T| |T| | 
10|F|T|T|F|T| |T|T| 
11|F|T|F|T|T| |T| |T
12|F|T|F|F| | | |T|T
13|F|F|T|T| |T|T| | 
14|F|F|T|F| |T|T| | 
15|F|F|F|T| |T|T| | 
16|F|F|F|F| | | | | 

* viii.

.|a|b|c|p|pa|pb|pc
-|-|-|-|-|-|-|-
1|T|T|T| |T| |T
2|T|T|F|T|T| |T
3|T|F|T| |T| |T
4|T|F|F|T| | |T
5|F|T|T|T|T| |T
6|F|T|F| |T|T|T
7|F|F|T|T|T| | 
8|F|F|F|T| |T| 

* ix.

.|a|b|c|d|p|pa|pb|pc|pd
-|-|-|-|-|-|-|-|-|-
1|T|T|T|T|T| | | | 
2|T|T|T|F|T| | | | 
3|T|T|F|T|T| | | | 
4|T|T|F|F|T| | | | 
5|T|F|T|T|T| | | | 
6|T|F|T|F|T|T| | | 
7|T|F|F|T|T|T| | | 
8|T|F|F|F|T|T| | |  
9|F|T|T|T|T| | | | 
10|F|T|T|F|T| |T| | 
11|F|T|F|T|T| |T| | 
12|F|T|F|F|T| |T| | 
13|F|F|T|T|T| | |T|T
14|F|F|T|F| |T|T| |T
15|F|F|F|T| |T|T|T| 
16|F|F|F|F| |T|T| | 

* x.

.|a|b|c|p|pa|pb|pc
-|-|-|-|-|-|-|-
1|T|T|T|T| | | 
2|T|T|F|T|T|T| 
3|T|F|T|T|T| |T
4|T|F|F| | |T|T
5|F|T|T|T| |T|T
6|F|T|F| |T| |T
7|F|F|T| |T|T| 
8|F|F|F| | | | 

(d) Liệt kê mọi cặp hàng trong bảng thỏa mãn GACC liên quan đến mỗi mệnh đề

Predicate|a|b|c|d
-|-|-|-|-
i.|{1,3,4}x{5,7,8}|(2,4)|(1,2)| 
ii.|{2,3,4}x{6,7,8}|(5,7)|(5,6)| 
iii.|(1,3)|(1,2)| | 
iv.|(2,6)|(2,4)|(1,2)| 
v.|{1,2}x{3,4}|{1,3}x{2,4}| | 
vi.|{1,2,3,4}x{5,6,7,8}|{1,5}x{3,7}|{1,5}x{2,6}| 
vii.|{5,6,7}x{13,14,15}|{9,10,11}x{13,14,15}|{2,6,10}x{4,8,12}|{3,7,11}x{4,8,12} 
viii.|{1,2,3}x{5,6,7}|(6,8)|{1,3,5}x{2,4,6}| 
ix.|{6,7,8}x{14,15,16}|{10,11,12}x{14,15,16}|(13,15)|(13,14)
x.|{2,3}x{6,7}|{2,5}x{4,7}|{3,5}x{4,6}| 

(e) Liệt kê mọi cặp hàng trong bảng thỏa mãn CACC liên quan đến mỗi mệnh đề

Predicate|a|b|c|d
-|-|-|-|-
i.|{1,3,4}x{5,7,8}|(2,4)|(1,2)| 
ii.|{2,3,4}x{6,7,8}|(5,7)|(5,6)| 
iii.|(1,3)|(1,2)| | 
iv.|(2,6)|(2,4)|(1,2)| 
v.|(1,2},(2,4)|(1,2),(3,4)| | 
vi.|(1,5)U{2,3,4}x{6,7,8}|(1,3),(5,7)|(1,2),(5,6)| 
vii.|{5,6,7}x{13,14,15}|{9,10,11}x{13,14,15}|{2,6,10}x{4,8,12}|{3,7,11}x{4,8,12} 
viii.|(1,5), (1,7), (2,6), (3,5), (3,7)|(6,8)|(1,2), (1,4), (3,2), (3,4), (5,6)| 
ix.|{6,7,8}x{14,15,16}|{10,11,12}x{14,15,16}|(13,15)|(13,14)
x.|{2,3}x{6,7}|{2,5}x{4,7}|{3,5}x{4,6}| 

(f) Liệt kê mọi cặp hàng trong bảng thỏa mãn RACC liên quan đến mỗi mệnh đề

Predicate|a|b|c|d
-|-|-|-|-
i.|(1,5),(3,7)(4,8)|(2,4)|(1,2)| 
ii.|(2,6),(3,7),(4,8)|(5,7)|(5,6)| 
iii.|(1,3)|(1,2)| | 
iv.|(2,6)|(2,4)|(1,2)| 
v.|(1,2},(2,4)|(1,2),(3,4)| | 
vi.|(1,5),(2,6),(3,7),(4,8)|(1,3),(5,7)|(1,2),(5,6)| 
vii.|(5,13),(6,14),(7,15)|(9,13),(10,14),(11,15)|(2,4),(6,8),(10,12)|(3,4),(7,8),(11,12) 
viii.|(3,4),(7,8),(11,12)|(6,8)|(1,2),(3,4),(5,6)| 
ix.|(6,14),(7,15),(8,16)|(10,14),(11,15),(12,16)|(13,15)|(13,14)
x.|(2,6),(3,7)|(2,4),(5,7)|(3,4),(5,6)| 

(g) Liệt kê mọi bộ 4 hàng trong bảng thỏa mãn GICC liên quan đến mỗi mệnh đề

* i.
 * a: (2,6) cho p=F; không có cặp cho p=T.
 * b: {5,6}x{7,8} cho p=F; (1,3) cho p=T.
 * c: {5,7}x{6,8} cho p=F; (3,4) cho p=T.
* ii.
 * a: không có cặp cho p=F; (1,5) cho p=T.
 * b: (6,8) cho p=F; {1,2}x{3,4} cho p=T.
 * c: (7,8) cho p=F; {1,3}x{2,4} cho p=T.
* iii.
 * a: (2,4) cho p=F; không có cặp cho p=T.
 * b: (3,4) cho p=F; không có cặp cho p=T.
* iv.
 * a: không có cặp cho p=F; {1,3,4}x{5,7,8} cho p=T.
 * b: không có cặp cho p=F; {1,5,6}x{3,7,8} cho p=T.
 * c: không có cặp cho p=F; {3,5,7}x{4,6,8} cho p=T.
* v.
 * Không có bộ GICC cho a và b
* vi.
 * a: Không có bộ GICC cho a
 * b: (2,4) cho p=F; (6,8) cho p=T.
 * c: (3,4) cho p=F; (7,8) cho p=T.
* vii.
 * a: {4,8}x{12,16} cho p=F; {1,2,3}x{9,10,11} p=T.
 * b: {4,12}x{8,16} cho p=F; {1,2,3}x{5,6,7} cho p=T.
 * c: {13,14}x{15,16} cho p=F; {1,5,9}x{3,7,11} cho p=T.
 * d: {13,15}x{14,16} cho p=F; {1,5,9}x{2,6,10} cho p=F.
* viii.
 * a: không có cặp cho p=F; (4,8) cho p=T.
 * b: (1,3) cho p=F; (2,4),(2,7),(5,4),(5,7) cho p=T.
 * c: không có cặp cho p=F; (7,8) cho p=T.
* ix.
 * a: không có cặp cho p=F; {1,2,3,4,5}x{9,10,11,12,13} cho p=T.
 * b: không có cặp cho p=F; {1,2,3,4,9}x{5,6,7,8,13} cho p=T.
 * c: (14,16) cho p=F; {1,2,5,6,9,10}x{3,4,7,8,11,12} cho p=T.
 * d: (15,16) cho p=F; {1,3,5,7,9,11}x{2,4,6,8,10,12} cho p=T.
* x.
 * a: (4,8) cho p=F; (1,5) cho p=T.
 * b: (6,8) cho p=F; (1,3) cho p=T.
 * a: (7,8) cho p=F; (1,2) cho p=T.

(h) Liệt kê mọi bộ 4 hàng trong bảng thỏa mãn RICC liên quan đến mỗi mệnh đề

* i.
 * a: (2,6) cho p=F; không có cặp cho p=T.
 * b: (5,7),(6,8) cho p=F; (1,3) cho p=T.
 * c: (5,6),(7,8) cho p=F; (3,4) cho p=T.
* ii.
 * a: không có cặp cho p=F; (1,5) cho p=T.
 * b: (7,8) cho p=F; (1,3),(2,4) cho p=T.
 * c: (6,8) cho p=F; (1,2),(3,4) cho p=T.
* iii.
 * a: (2,4) cho p=F; không có cặp cho p=T.
 * b: (3,4) cho p=F; không có cặp cho p=T.
* iv.
 * a: không có cặp cho p=F; (1,5),(3,7),(4,8) cho p=T.
 * b: không có cặp cho p=F; (1,3),(5,7),(6,8) cho p=T.
 * c: không có cặp cho p=F; (3,4),(5,6),(7,8) cho p=T.
* v.
 * Không có bộ RICC cho a và b
* vi.
 * a: Không có bộ RICC cho a
 * b: (2,4) cho p=F; (6,8) cho p=T.
 * c: (3,4) cho p=F; (7,8) cho p=T.
* vii.
 * a: (4,12),(8,16) cho p=F; (1,9),(2,10),(3,11) p=T.
 * b: (4,8),(12,16) cho p=F; (1,5),(2,6),(3,7) cho p=T.
 * c: (13,15),(14,16) cho p=F; (1,3),(5,7),(9,11) cho p=T.
 * d: (13,14),(15,16) cho p=F; (1,2),(5,6),(9,10) cho p=F.
* viii.
 * a: không có cặp cho p=F; (4,8) cho p=T.
 * b: (1,3) cho p=F; (2,4),(5,7) cho p=T.
 * c: không có cặp cho p=F; (7,8) cho p=T.
* ix.
 * a: không có cặp cho p=F; (1,9),(2,10),(3,11),(4,12),(5,13) cho p=T.
 * b: không có cặp cho p=F; (1,5),(2,6),(3,7),(4,8),(9,13) cho p=T.
 * c: (14,16) cho p=F; (1,3),(2,4),(5,7),(6,8),(9,11),(10,12) cho p=T.
 * d: (14,16) cho p=F; (1,2),(3,4),(5,6),(7,8),(9,10),(11,12) cho p=T.
* x.
 * a: (4,8) cho p=F; (1,5) cho p=T.
 * b: (6,8) cho p=F; (1,3) cho p=T.
 * a: (7,8) cho p=F; (1,2) cho p=T.