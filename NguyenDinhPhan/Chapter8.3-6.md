# Chapter 8.3-6
## Answer the following questions for the method twoPred() below:

```java
  public String twoPred(int x, int y){
    boolean z;
    if (x<y) z = true;
    else z=false;
    if(z && x+y==10) return "A";
    else return "B";
  }
```
## (a) List test inputs for twoPred() that achieve Restricted Active Clause Coverage (RACC).
## (b) List test inputs for twoPred() that achieve Restricted Inactive Clause Coverage (RICC).

<br>

## (a): RACC
### - có 2 vị từ x<y và (x<y && x+y==10) nên ta cần 3 test cho 6 cặp:
### - x < y true; x + y == 10 true: twoPred(4; 6)
### - x < y false; x + y == 10 true:  twoPred(6; 4)
### - x < y true; x + y == 10 false:  twoPred(4; 5)

## (b): RICC: Không có cặp nào với P=true, với P=false, ta có:
### - x<y	P = F: (2,4)
### - x+y==10 = F: (3,4)

### Tức x<y phải nhận TF và FF; x+y==10 cần nhận FT và FF
### - x < y false; x + y == 10 false: twoPred(6; 5)
### - x < y true; x + y == 10 false: twoPred(4; 5)
### - x < y false; x + y == 10 true: twoPred(6; 4)



## Bảng chân trị:
| Row# 	|   	| a 	| b 	|   	| P 	|   	| Pa 	| Pb 	|
|:----:	|:-:	|:-:	|:-:	|:-:	|:-:	|:-:	|:--:	|:--:	|
| 1    	|   	| T 	| T 	|   	| T 	|   	| T  	| T  	|
| 2    	|   	| T 	|   	|   	|   	|   	|    	| T  	|
| 3    	|   	|   	| T 	|   	|   	|   	| T  	|    	|
| 4    	|   	|   	|   	|   	|   	|   	|    	|    	|

## với a là x<y và b là x+y==10