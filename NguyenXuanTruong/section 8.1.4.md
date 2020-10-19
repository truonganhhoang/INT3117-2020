**(ii)** p = a ∨ (b ∧ c)
a,  
Các mệnh đề là a, b, c.
b,
pa = ¬b ∨ ¬c
pb = ¬a ∧ c
pc = ¬a ∧ b
c,
Chú ý: Các ô trống thể hiện các giá trị của ‘F'.

| |a|b|c|p|pa|pb|pc|
|-|-|-|-|-|--|--|--|
|1|T|T|T|T|  |  |  |
|2|T|T| |T| T|  |  |
|3|T| |T|T| T|  |  |
|4|T| | |T| T|  |  |
|5| |T|T|T|  | T| T|
|6| |T| | | T|  | T|
|7| | |T| | T| T|  |
|8| | | | | T|  |  | 

d,
Các cặp GACC cho mệnh đề a là: {2, 3, 4} × {6, 7, 8}.
Chỉ có một cặp GACC cho mệnh đề b: (5, 7).
Chỉ có một cặp GACC cho mệnh đề c: (5, 6).
e,
Các cặp CACC cho các mệnh đề a, b và c giống với các cặp GACC.
f,
Các cặp RACC cho mệnh đề a là: (2, 6), (3, 7), (4, 8).
Các cặp RACC đối với mệnh đề b và c giống như cặp CACC.
g,
Các bộ giá trị GICC cho a là: không có cặp nào khả thi cho p = F; (1,5) cho p = T.
Các bộ giá trị GICC cho b là: (6, 8) cho p = F; {1, 2} × {3, 4} cho p = T.
Các bộ giá trị GICC cho c là: (7, 8) cho p = F; {1, 3} × {2, 4} cho p = T.
h,
Các bộ giá trị RICC cho a giống như GICC.
Các bộ giá trị RICC cho b là: (6, 8) cho p = F; (1, 3), (2, 4) cho p = T.
Các bộ giá trị RICC cho c là: (7, 8) cho p = F; (1, 2), (3, 4) cho p = T.

**(iii)** p = a ∧ b
a,
Các mệnh đề là a, b.
b,
pa = b
pb = a
c,
Chú ý: Các ô trống thể hiện các giá trị của ‘F'.

| |a|b|p|pa|pb|
|-|-|-|-|--|--|
|1|T|T|T| T| T|
|2|T| | |  | T|
|3| |T| | T|  |
|4| | | |  |  |

d, 
Chỉ có một cặp GACC cho mệnh đề a: (1, 3).
Chỉ có một cặp GACC cho mệnh đề b: (1, 2).
e,
Các cặp CACC đối với mệnh đề a và b giống như các cặp GACC.
f, 
Các cặp RACC đối với mệnh đề a và b giống với các cặp CACC.
g,
Các bộ giá trị GICC cho a là: (2, 4) cho p = F; không có cặp khả thi nào cho p = T.
Các bộ giá trị GICC cho b là: (3, 4) cho p = F; không có cặp khả thi nào cho p = T.
h,
Các bộ giá trị RICC cho mệnh đề a và b giống như các bộ giá trị GICC.

**(iv)** p = a → (b → c)
a, 
Các mệnh đề là a, b, c.
b,
pa = b ∧ ¬c
pb = a ∧ ¬c
pc = a ∧ b
c, 
Chú ý: Các ô trống thể hiện các giá trị của ‘F'.

| |a|b|c|p|pa|pb|pc|
|-|-|-|-|-|--|--|--|
|1|T|T|T|T|  |  | T|
|2|T|T| | | T| T| T|
|3|T| |T|T|  |  |  |
|4|T| | |T|  | T|  |
|5| |T|T|T|  |  |  |
|6| |T| |T| T|  |  |
|7| | |T|T|  |  |  |
|8| | | |T|  |  |  | 

d, 
Chỉ có một cặp GACC cho mệnh đề a: (2, 6).
Chỉ có một cặp GACC cho mệnh đề b: (2, 4).
Chỉ có một cặp GACC cho mệnh đề c: (1, 2).
e,
Các cặp CACC cho các mệnh đề a, b và c giống với các cặp GACC.
f,
Các cặp RACC đối với các mệnh đề a, b và c giống với các cặp CACC.
g,
Các bộ giá trị GICC cho a là: không có cặp nào khả thi cho p = F; {1, 3, 4} × {5, 7, 8} cho p = T.
Bộ giá trị GICC cho b là: không có cặp khả thi nào cho p = F; {1, 5, 6} × {3, 7, 8} cho p = T.
Bộ giá trị GICC cho c là: không có cặp khả thi nào cho p = F; {3, 5, 7} × {4, 6, 8} cho p = T.
h,
Các bộ giá trị RICC cho a là: không có cặp nào khả thi cho p = F; (1, 5), (3, 7), (4, 8) cho p = T.
Các bộ giá trị RICC cho b là: không có cặp khả thi nào cho p = F; (1, 3), (5, 7), (6, 8) cho p = T.
Các bộ giá trị RICC cho c là: không có cặp nào khả thi cho p = F; (3, 4), (5, 6), (7, 8) cho p = T.

**(vi)** p = a ↔ (b ∧ c)
a,
Các mệnh đề là a, b, c.
b, 
pa = T
pb = c
pc = b
c,
Chú ý: Các ô trống thể hiện các giá trị của ‘F'.

| |a|b|c|p|pa|pb|pc|
|-|-|-|-|-|--|--|--|
|1|T|T|T|T| T| T| T|
|2|T|T| | | T|  | T|
|3|T| |T| | T| T|  |
|4|T| | |T|  |  |  |
|5| |T|T| | T| T| T|
|6| |T| |T| T|  | T|
|7| | |T|T| T| T|  |
|8| | | |T| T|  |  | 

d,
Các cặp GACC cho mệnh đề a là: {1, 2, 3, 4} × {5, 6, 7, 8}.
Các cặp GACC cho mệnh đề b là: {1, 5} × {3, 7}.
Các cặp GACC cho mệnh đề c là: {1, 5} × {2, 6}.
e,
Các cặp CACC cho mệnh đề a là: (1, 5) ∪ {2, 3, 4} × {6, 7, 8}.
Các cặp CACC cho mệnh đề b là: (1, 3), (5, 7) cho mệnh đề b.
Các cặp CACC cho mệnh đề c là: (1, 2), (5, 6) cho mệnh đề c.
f,
Các cặp RACC cho mệnh đề a là: (1, 5), (2, 6), (3, 7), (4, 8).
Các cặp RACC đối với mệnh đề b và c giống như cặp CACC.
g,
Không có bộ giá trị GICC nào cho điều khoản a.
Các bộ giá trị GICC cho b là: (2, 4) cho p = F; (6, 8) cho p = T.
Các bộ giá trị GICC cho c là: (3, 4) cho p = F; (7, 8) cho p = T.
h,
Các bộ giá trị RICC cho các mệnh đề a, b và c giống như các bộ giá trị GICC

**(viii)** p = (¬a ∧ ¬b) ∨ (a ∧ ¬c) ∨ (¬a ∧ c)
a, 
Các mệnh đề là a, b, c.
b, 
pa = b ∨ c
pb = ¬a ∧ ¬c
pc = a ∨ b
c, 
Chú ý: Các ô trống thể hiện các giá trị của ‘F'.

| |a|b|c|p|pa|pb|pc|
|-|-|-|-|-|--|--|--|
|1|T|T|T| | T|  | T|
|2|T|T| |T| T|  | T|
|3|T| |T| | T|  | T|
|4|T| | |T|  |  | T|
|5| |T|T|T| T|  | T|
|6| |T| | | T| T| T|
|7| | |T|T| T|  |  |
|8| | | |T|  | T|  | 

d,
Các cặp GACC cho mệnh đề a là: {1, 2, 3} × {5, 6, 7}.
Cặp GACC cho mệnh đề b là: (6, 8).
Các cặp GACC cho mệnh đề c là: {1, 3, 5} × {2, 4, 6}.
e,
Các cặp CACC cho mệnh đề a là:, (1, 5), (1, 7), (2, 6), (3, 5), (3, 7).
Cặp CACC cho mệnh đề b giống với cặp GACC.
Các cặp CACC cho mệnh đề c là: (1, 2), (1, 4), (3, 2), (3, 4), (5, 6).
f,
Cặp RACC cho mệnh đề a là: (1, 5), (2, 6), (3, 7).
Cặp RACC cho mệnh đề b giống với cặp CACC.
Các cặp RACC cho mệnh đề c là: (1, 2), (3, 4), (5, 6).
g,
Các bộ giá trị GICC cho mệnh đề a là: không có cặp nào khả thi đối với p = F; (4, 8) cho p = T.
Các bộ giá trị GICC cho mệnh đề b là: (1,3) cho p = F; (2, 4), (2, 7), (5, 4), (5, 7) cho p = T.
Các bộ giá trị GICC cho mệnh đề c là: không có cặp nào khả thi cho p = F; (7, 8) cho p = T.
h, 
Các bộ giá trị RICC cho mệnh đề a và c giống như các bộ giá trị GICC.
Các bộ giá trị RICC cho mệnh đề b là: (1, 3) cho p = F; (2, 4), (5, 7) cho p = T.
