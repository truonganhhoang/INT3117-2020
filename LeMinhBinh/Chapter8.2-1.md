# Chapter 8.2-1

<h1> i.ab(-c)+(-a)b(-c)</h1>

`(a)` **Draw the Karnaugh maps for `f` and `-f`.**

Karnaugh cho f:

| c \ ab | 00  | 01  | 11  | 10  |
| ------ | --- | --- | --- | --- |
| **0**  |     | 1   | 1   |     |
| **1**  |     |     |     |     |

Karnaugh cho -f:

| c \ ab | 00  | 01  | 11  | 10  |
| ------ | --- | --- | --- | --- |
| **0**  | 1   |     |     | 1   |
| **1**  | 1   | 1   | 1   | 1   |

`(b)` **Find the nonredundant prime implicant representation for `f` and `-f`.**

- `f: f = b(-c)`
- `-f: -f = (-b) + c`

`(c)` **Give a test set that satisfies Implicant Coverage (IC) for `f`.**

Implicants:
`{(-b), c, b(-c)}`
`T = { xTF, xFT }`

`(d)` **Give a test set that satisfies Multiple Unique True Points (MUTP) for `f`.**

`T = {-TF,-FF,-TT}`

`(e)` **Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for `f`.**

`UTPs: {-TF}`
`NFPs: {-TT, -FF}`
Bộ kiểm thử `{-TF, -TT, -FF}` thỏa mãn CUTPNFP.

<h1> ii. f = (-a)(-b)(-c)(-d) + abcd </h1>

`(a)` **Draw the Karnaugh maps for `f` and `-f`.**

Karnaugh cho f:

| cd \ ab | 00  | 01  | 11  | 10  |
| ------- | --- | --- | --- | --- |
| **00**  | 1   |     |     |     |
| **01**  |     |     |     |     |
| **11**  |     |     | 1   |     |
| **10**  |     |     |     |     |

Karnaugh for -f:

| cd \ ab | 00  | 01  | 11  | 10  |
| ------- | --- | --- | --- | --- |
| **00**  |     | 1   | 1   | 1   |
| **01**  | 1   | 1   | 1   | 1   |
| **11**  | 1   | 1   |     | 1   |
| **10**  | 1   | 1   | 1   | 1   |

`(b)` **Find the nonredundant prime implicant representation for `f` and `-f`.**

- `f: f = (-a)(-b)(-c)(-d) + abcd`
- `-f: -f = (-a)d + c(-d) + b(-c) + a(-b)`

`(c)` **Give a test set that satisfies Implicant Coverage (IC) for `f`.**

Implicants:
`{(-a)(-b)(-c)(-d), abcd, (-a)d, c(-d), b(-c), a(-b)}`
`T = {FFFF, TTTT, FTFT, TFTF}`

`(d)` **Give a test set that satisfies Multiple Unique True Points (MUTP) for `f`.**

`T = {FFFF, TTTT, FFTT, FTTF, FTFT, TFFT}`

`(e)` **Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for `f`.**

`UTPs: {FFFF, TTTT, FFTT, FTTF, FTFT, TFFT}`

<h1>iii. f = ab + a(-b)c + (-a)(-b)c</h1>

`(a)` **Draw the Karnaugh maps for `f` and `-f`.**

- Karnaugh cho f:

| c\ab  | 00  | 01  | 11  | 10  |
| ----- | --- | --- | --- | --- |
| **0** |     |     | 1   |     |
| **1** | 1   |     | 1   | 1   |

- Karnaugh cho (-f):

| c\ab  | 00  | 01  | 11  | 10  |
| ----- | --- | --- | --- | --- |
| **0** | 1   | 1   |     | 1   |
| **1** |     | 1   |     |     |

`(b)` **Find the nonredundant prime implicant representation for `f` and `-f`.**

- `f : ab + (-b)c`
- `(-f): (-a)b + (-b)(-c)`

`(c)` **Give a test set that satisfies Implicant Coverage (IC) for `f`.**

Implicants:
`{(-b)c, (-a)b, (-b)(-c)}`
`T = {TT-, -FT, FT-, -FF }`

`(d)` **Give a test set that satisfies Multiple Unique True Points (MUTP) for `f`.**

`T = {TT-, -FT, FT-, -FF}`

`(e)` **Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for `f`.**

- `UTPs: {TTF, FFT}`
- `NFPs: {FTF,TFF}, {FFF,FTT}`
- `{TTF, FTF, TFF} and {FFT, FFF, FTT}` thỏa mãn CUTPNFP.

<h1> iv. f = (-a)(-c)(-d) + (-c)d + bcd</h1>

`(a)` **Draw the Karnaugh maps for `f` and `-f`.**

- Karnaugh cho f:

|     | 00  | 01  | 11  | 10  |
| --- | --- | --- | --- | --- |
| 00  | 1   | 1   |     |     |
| 01  | 1   | 1   | 1   | 1   |
| 11  |     | 1   | 1   |     |
| 10  |     |     |     |     |

- Karnaugh cho (-f):

|     | 00  | 01  | 11  | 10  |
| --- | --- | --- | --- | --- |
| 00  |     |     | 1   | 1   |
| 01  |     |     |     |     |
| 11  | 1   |     |     | 1   |
| 10  | 1   | 1   | 1   | 1   |

`(b)` **Find the nonredundant prime implicant representation for `f` and `-f`.**

- `f : (-a)(-c) + bd + (-c)d`
- `(-f) : a(-d) + c(-d) + (-b)c`

`(c)` **Give a test set that satisfies Implicant Coverage (IC) for `f`.**

Implicants:
`{(-a)(-c), bd, (-c)d, a(-d), c(-d), (-b)c} `
`T = {FTFT, TFTF}`

`(d)` **Give a test set that satisfies Multiple Unique True Points (MUTP) for `f`.**

`T = {F-FF, -TTT, TFFT, T-FF, FTTF, -FTT}`

`(e)` **Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for `f`.**

- `UTPs: {FFFF, TTTT, TFFT} `
- `NFPs: {TFFF,FFTF}, {TFTT,TTTF}, {,TFFF} `
- `FFF,TFFF,FFTF}, {TTTT,TFTT,TTTF} and {TFFT,TFTT,TFFF}` thỏa mãn CUTPNFP
