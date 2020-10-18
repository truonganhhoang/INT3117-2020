# Chapter 8.2-1
## 1. Use predicates (i) through (iv) to answer the following questions.
## i. f = ab(-c) + (-a)b(-c)
## ii. f = -(abcd) + abcd
## iii. f = ab + a(-b)c + -(ab)c
## iv. f = -(acd) + (-c)d + bcd

<br>

## (a) Draw the Karnaugh maps for f and f.
## (b) Find the nonredundant prime implicant representation for f and f.
## (c) Give a test set that satisfies Implicant Coverage (IC) for f.
## (d) Give a test set that satisfies Multiple Unique True Points (MUTP) for f.
## (e) Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for f.
## (f) Give a test set that satisfies Multiple Near False Points (MNFP) for f.
## (g) Give a test set that is guaranteed to detect all faults in Figure 8.2.

<br>

## i. f = ab(-c) + (-a)b(-c)
### (a):
### Karnaugh của f:

| c\ab 	| 00 	| 01 	| 11 	| 10 	|
|------	|----	|----	|----	|----	|
| 0    	|    	| 1  	| 1  	|    	|
| 1    	|    	|    	|    	|    	|


### Karnaugh của -f:

| c\ab 	| 00 	| 01 	| 11 	| 10 	|
|------	|----	|----	|----	|----	|
| 0    	|  1  	|   	|   	|  1  	|
| 1    	|  1  	|  1  	|   1 	| 1   	|

## (b):
### f = b(-c)
### -f = -b + c

## (c):IC: {xTF,xFT}

## (d):MUTP: {xTF,xFF,xTT}

## (e): CUTPNFP: {xTF,xFF,xTT}
## (f): MNFP: {xFF, xTT}

<br>

## ii. f = -(abcd) + abcd
### (a): 
### Karnaugh của f:
| cd\ab 	| 00 	| 01 	| 11 	| 10 	|
|------	|----	|----	|----	|----	|
| 00   	| 1  	|    	|    	|    	|
| 01   	|    	|    	|    	|    	|
| 10   	|    	|    	| 1  	|    	|
| 11   	|    	|    	|    	|    	|


### Karnaugh của -f:

| cd\ab 	| 00 	| 01 	| 11 	| 10 	|
|------	|----	|----	|----	|----	|
| 00   	|   	| 1   	| 1   	| 1   	|
| 01   	|  1  	|    1	|  1  	|  1  	|
| 10   	|  1  	|  1  	| 	| 1   	|
| 11   	|    1	|   1 	|    1	|   1 	|

## (b):
### f = -(abcd) + (abcd) 
### -f = a(-b) + b(-c) + c(-d) + (-a)d

## (c):IC: {FFFF; TTTT; TFTF; FTFT}


## (d):MUTP: {FFFF; TTTT}

## (e): CUTPNFP: {FFFF} x {TFFF; FTFF; FFTF; FFFT}, {TTTT} x {FTTT; TFTT; TTFT; TTTF.}
## (f): MNFP: {TFFT, FTTT, FTFF, TFTT, TFFF, FTTT, FTFF, TTTF}