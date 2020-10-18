# Section 8.2-1

# Use predicates (i) through (iv) to answer the following questions.

(a) Draw the Karnaugh maps for f and phủ f.

(b) Find the nonredundant prime implicant representation for f and phủ f.

(c) Give a test set that satisfies Implicant Coverage (IC) for f.

(d) Give a test set that satisfies Multiple Unique True Points (MUTP) for f.

(e) Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for f.

(f) Give a test set that satisfies Multiple Near False Points (MNFP) for f.

(g) Give a test set that is guaranteed to detect all faults in figure 8.2.

i. f = ab phủ c  + phủ a b phủ c

a, Biểu đồ Karnaugh cho f: 

| | | | | |
|-|-|-|-|-|
||00|01|11|10|
|0||1|1|||
|1||||

Biểu đồ Karnaugh cho phủ f:

| | | | | |
|-|-|-|-|-|
||00|01|11|10|
|0|1|||1|
|1|1|1|1|1|

b, vị từ chính du thừa biểu diễn cho f:

f = b phủ c
vị từ chính dư thừa biểu diễn cho phủ f:

phủ f = phủ b + c

c, Với mỗi IC ta chọn vị từ chính dư thừa biểu diễn. Những sự lựa chọn là có thể xảy ra. 

ii. f = phủ(abcd) + abcd

a, Biểu đồ Karnaugh cho f:

| | | | | |
|-|-|-|-|-|
||00|01|11|10|
|00|1|||||
|01||||
|11|||1||
|10|||||

Biểu đồ Karnaugh cho phủ f:

| | | | | |
|-|-|-|-|-|
||00|01|11|10|
|00||1|1|1|
|01|1|1|1|1|
|11|1|1||1|
|10|1|1|1|1|

b, Vị từ chính dư thừa biểu diễn cho f:

f = phủ(abcd) + abcd

Vị từ chính biểu diễn cho phủ f:

phủ f = a phủ (b) + b phủ(c) + c phủ(d) + phủ(a)d.

c, Với mỗi IC ta chọn vị từ chính dư thừa biểu diễn. Những sự lựa chọn khác đều có thể xảy ra.

