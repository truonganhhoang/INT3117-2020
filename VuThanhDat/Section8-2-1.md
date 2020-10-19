# Chapter 8 - Section 2 - Exercise 1

*The negation of a is reprensentad as (-a)*

## i) f = ab(-c) + (-a)b(-c)  

### (a) Draw the Karnaugh maps for f and -f.
*ab is represented on the horizontal axis and c is represented on the vertical axis*

- Karnaugh map for f:

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| 0      |    | 1  | 1  |    |
| 1      |    |    |    |    |

- Karnaugh map for (-f):

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| 0      | 1  |    |    | 1  |
| 1      | 1  | 1  | 1  | 1  |

### (b) Find the nonredundant prime implicant representation for f and (-f).

- The nonredundant prime implicant representation for f : 
b(-c)

- The nonredundant prime implicant representation for (-f):
(-b) + c

### (c) Give a test set that satisfies Implicant Coverage (IC) for f.

There are 3 implicant {(-b), c, b(-c)}. Test set {-FT, -TF} would satisfy IC.

### (d) Give a test set that satisfies Multiple Unique True Points (MUTP) for f.

Test set {-TF,-FF,-TT} would satisfy MUTP.

### (e) Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for f.

UTPs: {-TF}
NFPs: {-TT, -FF}

Test set {-TF, -TT, -FF} would also satisfy CUTPNFP.

## ii) f = (-a)(-b)(-c)(-d) + abcd 

### (a) Draw the Karnaugh maps for f and -f.
*ab is represented on the horizontal axis and cd is represented on the vertical axis*

- Karnaugh map for f:

| cd \ ab | 00 | 01 | 11 | 10 |
|---------|----|----|----|----|
| 00      | 1  |    |    |    |
| 01      |    |    |    |    |
| 11      |    |    | 1  |    |
| 10      |    |    |    |    |

- Karnaugh map for (-f):

| cd \ ab | 00 | 01 | 11 | 10 |
|---------|----|----|----|----|
| 00      |    | 1  | 1  | 1  |
| 01      | 1  | 1  | 1  | 1  |
| 11      | 1  | 1  |    | 1  |
| 10      | 1  | 1  | 1  | 1  |

### (b) Find the nonredundant prime implicant representation for f and (-f).
- The nonredundant prime implicant representation for f : 
(-a)(-b)(-c)(-d) + abcd 

- The nonredundant prime implicant representation for (-f):
(-a)d + c(-d) + b(-c) + a(-b)

### (c) Give a test set that satisfies Implicant Coverage (IC) for f.
There are 6 implicants {(-a)(-b)(-c)(-d), abcd, (-a)d, c(-d), b(-c), a(-b)}. Test set {FFFF,TTTT,FTFT,TFTF} would satisfy IC.

### (d) Give a test set that satisfies Multiple Unique True Points (MUTP) for f.
Test set {FFFF, TTTT, FFTT, FTTF, FTFT, TFFT}

### (e) Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for f.
UTPs: FFFF, TTTT, FFTT, FTTF, FTFT, TFFT
*I don't know*

## iii) f = ab + a(-b)c + (-a)(-b)c

### (a) Draw the Karnaugh maps for f and -f.
*ab is represented on the horizontal axis and c is represented on the vertical axis*

- Karnaugh map for f:

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| 0      |    |    | 1  |    |
| 1      | 1  |    | 1  | 1  |

- Karnaugh map for (-f):

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| 0      | 1  | 1  |    | 1  |
| 1      |    | 1  |    |    |

### (b) Find the nonredundant prime implicant representation for f and (-f).
- The nonredundant prime implicant representation for f : 
ab + (-b)c
- The nonredundant prime implicant representation for (-f):
(-a)b + (-b)(-c)

### (c) Give a test set that satisfies Implicant Coverage (IC) for f.
There are 4 implicants {ab, (-b)c, (-a)b, (-b)(-c)}. Test set {TT-, -FT, FT-, -FF } would satisfy IC.

### (d) Give a test set that satisfies Multiple Unique True Points (MUTP) for f.
Test set {TT-, -FT, FT-, -FF} would also satisfy MUTP

### (e) Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for f.
UTPs: {TTF, FFT}
NFPs: {FTF,TFF}, {FFF,FTT} (In respect to implicants)

{TTF, FTF, TFF} and {FFT, FFF, FTT} would satisfy CUTPNFP.

## iv) f = (-a)(-c)(-d) + (-c)d + bcd 

### (a) Draw the Karnaugh maps for f and -f.
*ab is represented on the horizontal axis and cd is represented on the vertical axis*

- Karnaugh map for f:

|    | 00 | 01 | 11 | 10 |
|----|----|----|----|----|
| 00 | 1  | 1  |    |    |
| 01 | 1  | 1  | 1  | 1  |
| 11 |    | 1  | 1  |    |
| 10 |    |    |    |    |

- Karnaugh map for (-f):

|    | 00 | 01 | 11 | 10 |
|----|----|----|----|----|
| 00 |    |    | 1  | 1  |
| 01 |    |    |    |    |
| 11 | 1  |    |    | 1  |
| 10 | 1  | 1  | 1  | 1  |

### (b) Find the nonredundant prime implicant representation for f and (-f).
- The nonredundant prime implicant representation for f : 
(-a)(-c) + bd + (-c)d

- The nonredundant prime implicant representation for (-f) :
a(-d) + c(-d) + (-b)c 

### (c) Give a test set that satisfies Implicant Coverage (IC) for f.
There 6 implicants {(-a)(-c), bd, (-c)d, a(-d), c(-d), (-b)c}

|          | a | b | c | d |
|----------|---|---|---|---|
| (-a)(-c) | F |   | F |   |
| bd       |   | T |   | T |
| (-c)d    |   |   | F | T |
| a(-d)    | T |   |   | F |
| c(-d)    |   |   | T | F |
| (-b)c    |   | F | T |   |

As we can see we only need the test set {FTFT, TFTF} to satisfy IC.

### (d) Give a test set that satisfies Multiple Unique True Points (MUTP) for f.
Test set {F-FF, -TTT, TFFT, T-FF, FTTF, -FTT} would satisfy MUTP

### (e)
UTPs: {FFFF, TTTT, TFFT}
NFPs: {TFFF,FFTF}, {TFTT,TTTF}, {TFTT,TFFF}
{FFF,TFFF,FFTF}, {TTTT,TFTT,TTTF} and {TFFT,TFTT,TFFF} would satisfy CUTPNFP