# 8.2.1.
## a. Draw the Karnaugh maps for f and -f
### i. f = ab(-c) + (-a)b(-c)

Sơ đồ Karnaugh cho f:  

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| **0** | | 1 | 1 | |
| **1** | | | | |

Karnaugh map for -f: 

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| **0** | 1 | | | 1 |
| **1** | 1 | 1 | 1 | 1 |

### ii. f = (-a)(-b)(-c)(-d) + abcd 

Sơ đồ Karnaugh cho f:  

| cd \ ab | 00 | 01 | 11 | 10 |
|---------|----|----|----|----|
| **00** | 1 | | | |
| **01** | | | | |
| **11** | | | 1 | |
| **10** | | | | |

Sơ đồ Karnaugh cho -f: 

| cd \ ab | 00 | 01 | 11 | 10 |
|---------|----|----|----|----|
| **00** | | 1 | 1 | 1 |
| **01** | 1 | 1 | 1 | 1 |
| **11** | 1 | 1 | | 1 |
| **10** | 1 | 1 | 1 | 1 |

### iii. f = ab + a(-b)c + (-a)(-b)c   

Sơ đồ Karnaugh cho f:  

|  c\ab | 00 | 01 | 11 | 10 |
|-------|----|----|----|----|
| **0** |    |    | 1  |   	|
| **1** | 1  |    | 1  | 1  |    

Sơ đồ Karnaugh cho (-f):

|  c\ab | 00 | 01 | 11 | 10 |
|-------|----|----|----|----|
| **0** | 1  | 1  |    | 1  |
| **1** |    | 1  |    |    |

### iv. f = (-a)(-c)(-d) + (-c)d + bcd  

Sơ đồ Karnaugh cho f:

|    | 00 | 01 | 11 | 10 |
|----|----|----|----|----|
| 00 | 1  | 1  |    |    |
| 01 | 1  | 1  | 1  | 1  |
| 11 |    | 1  | 1  |    |
| 10 |    |    |    |    |  

Sơ đồ Karnaugh cho (-f):

|    | 00 | 01 | 11 | 10 |
|----|----|----|----|----|
| 00 |    |    | 1  | 1  |
| 01 |    |    |    |    |
| 11 | 1  |    |    | 1  |
| 10 | 1  | 1  | 1  | 1  |

## b.
### i. f = ab(-c) + (-a)b(-c)
- f: f = b(-c)  
- (-f): -f = (-b) + c  

### ii. f = (-a)(-b)(-c)(-d) + abcd 
- (f): f = (-a)(-b)(-c)(-d) + abcd  
- (-f): -f = (-a)d + c(-d) + b(-c) + a(-b)

### iii. f = ab + a(-b)c + (-a)(-b)c 
- f : ab + (-b)c
- (-f): (-a)b + (-b)(-c)

### iv. f = (-a)(-c)(-d) + (-c)d + bcd 
- f : (-a)(-c) + bd + (-c)d
- (-f) : a(-d) + c(-d) + (-b)c 

## c. 
### i. f = ab(-c) + (-a)b(-c)
Implicants: {(-b), c, b(-c)}  
T = { xTF, xFT }

### ii. f = (-a)(-b)(-c)(-d) + abcd 
Implicants: {(-a)(-b)(-c)(-d), abcd, (-a)d, c(-d), b(-c), a(-b)}  
T = {FFFF, TTTT, FTFT, TFTF}

### iii. f = ab + a(-b)c + (-a)(-b)c 
Implicants: (-b)c, (-a)b, (-b)(-c)}  
T = {TT-, -FT, FT-, -FF }

### iv. f = (-a)(-c)(-d) + (-c)d + bcd 
Implicants: {(-a)(-c), bd, (-c)d, a(-d), c(-d), (-b)c}  
T = {FTFT, TFTF}


## d.
### i. f = ab(-c) + (-a)b(-c)
T = {-TF,-FF,-TT}

### ii. f = (-a)(-b)(-c)(-d) + abcd  
T = {FFFF, TTTT, FFTT, FTTF, FTFT, TFFT}

### iii. f = ab + a(-b)c + (-a)(-b)c 
T = {TT-, -FT, FT-, -FF}

### iv. f = (-a)(-c)(-d) + (-c)d + bcd 
T = {F-FF, -TTT, TFFT, T-FF, FTTF, -FTT}

## e.
### i. f = ab(-c) + (-a)b(-c)

UTPs: {-TF}  
NFPs: {-TT, -FF}  
Test set {-TF, -TT, -FF} cũng có thể thỏa mãn CUTPNFP.

### ii. f = (-a)(-b)(-c)(-d) + abcd 
UTPs: {FFFF, TTTT, FFTT, FTTF, FTFT, TFFT}

### iii. f = ab + a(-b)c + (-a)(-b)c 
UTPs: {TTF, FFT}  
NFPs: {FTF,TFF}, {FFF,FTT}   
{TTF, FTF, TFF} and {FFT, FFF, FTT} có thể thỏa mãn CUTPNFP.  

### iv. f = (-a)(-c)(-d) + (-c)d + bcd 
UTPs: {FFFF, TTTT, TFFT}  
NFPs: {TFFF,FFTF}, {TFTT,TTTF}, {TFTT,TFFF}  
{FFF,TFFF,FFTF}, {TTTT,TFTT,TTTF} and {TFFT,TFTT,TFFF} thỏa mãn CUTPNFP 