Xét một chương trinh P cụ thể như sau:
```
float foo(int a, int b, int c, int d) {
1.	float e;
2.	if (a==0)
3.		return 0;
4.	int x = 0;
5.	if ((a==b || (c==d))
6.			x=1;
7.	e = 1/x;
8.	return e;
}
```
Tập thử nghiệm T1 cho độ bao phủ C1 là:
|ID|Test Path|Inputs|EO|RO|Note|
|---|---|---|---|---|---|
|tc1|1; 2(F); 4; 5(T); 6; 7; 8|0,1,2,3|0|   ||
|tc2|1; 2(T); 3|1,1,2,3|1|   ||
Tập thử nghiệm T2 cho độ bao phủ C2 là:
|ID|Test Path|Inputs|EO|RO|Note|
|---|---|---|---|---|---|
|tc1|1; 2(F); 4; 5(T); 6; 7; 8|0,1,2,3|0|   ||
|tc2|1; 2(T); 3|1,1,2,3|1|   ||
|tc2|1; 2(F); 4; 5(F); 7; 8|1,2,1,2|lỗi chia cho 0|   ||
Qua ví dụ trên, dễ dàng nhận thấy 
1.	T1 không đủ để thỏa mãn C2
2.	T2 thỏa mãn C1
3.	Nếu P chứa lỗi (cụ thể ở đây là lỗi chia cho 0), T2 phát hiện ra lỗi còn T1 thì không
