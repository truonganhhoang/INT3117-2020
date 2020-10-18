Cho các thuộc tính sau:

    i. f = ab!c + !ab!c
    ii. f = !a!b!c!d+ abcd
    iii. f = ab + a!bc + !a!bc
    iv. f = !a!c!d+ !cd + bcd

(a) Vẽ bản đồ Karnaugh

* i.
 * f

![image](https://user-images.githubusercontent.com/48431650/95801043-4a824580-0d23-11eb-8429-d9e759d95172.png)

 * !f

![image](https://user-images.githubusercontent.com/48431650/95801135-98974900-0d23-11eb-9b81-5ca1fbe04e69.png)

* ii.
 * f

![image](https://user-images.githubusercontent.com/48431650/95801177-b9f83500-0d23-11eb-9061-e7a4a295836c.png)

 * !f

![image](https://user-images.githubusercontent.com/48431650/95801219-da27f400-0d23-11eb-9fd2-7890be0317cd.png)

* iii.
 * f

![image](https://user-images.githubusercontent.com/48431650/95801268-06dc0b80-0d24-11eb-8561-f043d7141e30.png)

 * !f

![image](https://user-images.githubusercontent.com/48431650/95801290-18251800-0d24-11eb-9adb-d362e58fa6c2.png)

* iv.
 * f

![image](https://user-images.githubusercontent.com/48431650/95801312-26733400-0d24-11eb-8f74-7f01387d0ca8.png)

 * !f

![image](https://user-images.githubusercontent.com/48431650/95801351-430f6c00-0d24-11eb-9dbe-4af3fb2327fe.png)

(b) Tìm hàm ý nguyên tố không thừa thãi

* i.
 * f: b!c
 * !f: !b + c
* ii.
 * f: !a!b!c!d +abcd
 * !f: a!b + b!c + c!d + !ad
* iii.
 * f: ab + !bc
 * !f: !ab + !b!c
* iv.
 * f: !a!c + !cd + bd
 * !f: a!d + !bc + c!d

(c) Tạo một bộ kiểm thử để thỏa mãn IC cho f

* i. {xTF,xFT}
* ii. {FFFF,TTTT,TFTF,FTFT}
* iii. {TTx,xFT,FTx,xFF}
* iv. {FTFT,TFTF}

(d) Tạo một bộ kiểm thử để thỏa mãn UTPC cho f

* i. {xTF,xFF,xTT}
* ii. {FFFF,TTTT,TTFF,TFFF,FFTT,FFTF}
* iii. {TTx,xFT,FTx,xFF}
* iv. {FxFF,TFFT,xTTT,FTTF,TxFF,xFTT}

(e) Tạo một bộ kiểm thử để thỏa mãn CUTPNFP cho f

* i. {xTF,xFF,xTT}
* ii. {TTTT,FTTT,TFTT,TTFT,TTTF,FFFF,TFFF,FTFF,FFTF,FFFT}
* iii. {TTF,FTF,TFF,FFT,FFF,FTT}
* iv. {FFFF,TFFF,FFTF,TFFT,TFFF,TFTT,TTTT,TFTT,TTTF}