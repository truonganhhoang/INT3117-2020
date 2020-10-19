**(i)** f = ab(-c) + (-a)b(-c)  

a, Draw the Karnaugh maps for f and -f.
* Chú ý: ab được biểu diễn trên trục hoành và c được biểu diễn trên trục tung *
- Biểu đồ Karnaugh cho f:

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| 0      |    | 1  | 1  |    |
| 1      |    |    |    |    |

- Biểu đồ Karnaugh cho (-f):

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| 0      | 1  |    |    | 1  |
| 1      | 1  | 1  | 1  | 1  |

b, 
- Biểu diễn hàm ý nguyên tố không lũy thừa cho f: b (-c)
- Biểu diễn hàm ý nguyên tố không lũy thừa cho (-f): (-b) + c

c,
- Có 3 hàm ý {(-b), c, b (-c)}. Bộ kiểm thử {-FT, -TF} sẽ thỏa mãn IC.


d,
Bộ thử nghiệm {-TF, -FF, -TT} sẽ đáp ứng MUTP.

e,
UTPs: {-TF}
NFPs: {-TT, -FF}
Tập hợp kiểm tra {-TF, -TT, -FF} cũng sẽ đáp ứng CUTPNFP.

**(ii)** f = (-a)(-b)(-c)(-d) + abcd 
a, Draw the Karnaugh maps for f and -f.
*ab
*Chú ý: ab được biểu diễn trên trục hoành và c được biểu diễn trên trục tung*
- Biểu đồ Karnaugh cho f:

| cd \ ab | 00 | 01 | 11 | 10 |
|---------|----|----|----|----|
| 00      | 1  |    |    |    |
| 01      |    |    |    |    |
| 11      |    |    | 1  |    |
| 10      |    |    |    |    |

- Biểu đồ Karnaugh cho (-f):

| cd \ ab | 00 | 01 | 11 | 10 |
|---------|----|----|----|----|
| 00      |    | 1  | 1  | 1  |
| 01      | 1  | 1  | 1  | 1  |
| 11      | 1  | 1  |    | 1  |
| 10      | 1  | 1  | 1  | 1  |

b,
- Biểu diễn hàm ý nguyên tố không lũy thừa cho f: (-a)(-b)(-c)(-d) + abcd 
- Biểu diễn hàm ý nguyên tố không lũy thừa cho (-f): (-a)d + c(-d) + b(-c) + a(-b)

c,
- Có 6 hàm ý {(-a) (- b) (- c) (- d), abcd, (-a) d, c (-d), b (-c), a (-b)}. 
- Bộ kiểm tra {FFFF, TTTT, FTFT, TFTF} sẽ thỏa mãn IC.

d,
Bộ thử nghiệm {FFFF, TTTT, FFTT, FTTF, FTFT, TFFT}.

e,
UTPs: FFFF, TTTT, FFTT, FTTF, FTFT, TFFT

**(iii)** f = ab + a(-b)c + (-a)(-b)c

a,
*Chú ý: ab được biểu diễn trên trục hoành và c được biểu diễn trên trục tung*

- Biểu đồ Karnaugh cho f:

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| 0      |    |    | 1  |    |
| 1      | 1  |    | 1  | 1  |

- Biểu đồ Karnaugh cho (-f):

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| 0      | 1  | 1  |    | 1  |
| 1      |    | 1  |    |    |

b,
- Biểu diễn hàm ý nguyên tố không lũy thừa cho f: ab + (-b) c
- Biểu diễn hàm ý nguyên tố không lũy thừa cho (-f): (-a) b + (-b) (- c)

c,
Có 4 hàm ý {ab, (-b) c, (-a) b, (-b) (- c)}. Bộ kiểm tra {TT-, -FT, FT-, -FF} sẽ thỏa mãn IC.

d,
Bộ kiểm tra {TT-, -FT, FT-, -FF} cũng sẽ đáp ứng MUTP

e,
UTPs: {TTF, FFT}
NFPs: {FTF,TFF}, {FFF,FTT} 
{TTF, FTF, TFF} and {FFT, FFF, FTT} sẽ thỏa mãn CUTPNFP.

**(iv)** f = (-a)(-c)(-d) + (-c)d + bcd 

a,
*Chú ý: ab được biểu diễn trên trục hoành và c được biểu diễn trên trục tung*

- Biểu đồ Karnaugh cho f:

|    | 00 | 01 | 11 | 10 |
|----|----|----|----|----|
| 00 | 1  | 1  |    |    |
| 01 | 1  | 1  | 1  | 1  |
| 11 |    | 1  | 1  |    |
| 10 |    |    |    |    |

- Biểu đồ Karnaugh cho (-f):

|    | 00 | 01 | 11 | 10 |
|----|----|----|----|----|
| 00 |    |    | 1  | 1  |
| 01 |    |    |    |    |
| 11 | 1  |    |    | 1  |
| 10 | 1  | 1  | 1  | 1  |

b
- Biểu diễn hàm ý nguyên tố không lũy thừa cho f: (-a) (- c) + bd + (-c) d

- Biểu diễn hàm ý nguyên tố không lũy thừa cho (-f): a (-d) + c (-d) + (-b) c

c,
Có 6 hàm ý {(-a) (- c), bd, (-c) d, a (-d), c (-d), (-b) c}

|          | a | b | c | d |
|----------|---|---|---|---|
| (-a)(-c) | F |   | F |   |
| bd       |   | T |   | T |
| (-c)d    |   |   | F | T |
| a(-d)    | T |   |   | F |
| c(-d)    |   |   | T | F |
| (-b)c    |   | F | T |   |

chúng ta chỉ cần bộ kiểm tra {FTFT, TFTF} để thỏa mãn IC.

d,
Bộ thử nghiệm {F-FF, -TTT, TFFT, T-FF, FTTF, -FTT} sẽ đáp ứng MUTP

e,
UTPs: {FFFF, TTTT, TFFT}
NFPs: {TFFF,FFTF}, {TFTT,TTTF}, {TFTT,TFFF}
{FFF,TFFF,FFTF}, {TTTT,TFTT,TTTF} and {TFFT,TFTT,TFFF} sẽ thỏa mãn CUTPNFP