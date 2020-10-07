Cho lớp **Shutter**

(a) Vẽ đồ thị phân luồng



(b) Liệt kê tất cả vị trí gọi

        i.      Line 46, main() -> stut()
        ii.     Line 64, stut() -> isDelimit()
        iii.    Line 66, stut() -> checkDupes()
        iv.     Line 74, stut() -> checkDupes()

(c) Liệt kê mọi du-path phân cặp cho mỗi vị trí gọi

        i.      (main(), curWord, 14)            -> 	(stut(), curWord, 71) 			- line 46
        ii.     (main(), inFile, 30)             -> 	(stut(), inFile, 57) 			- line 46
        iii.    (main(), inFile, 37)             -> 	(stut(), inFile, 57) 			- line 46
        iv.     (main(), inFile, 42)             -> 	(stut(), inFile, 57) 			- line 46
        v.      (stut(), c, 62)                  -> 	(isDelimit(), C, 102)	 		- line 64
        vi.     (stut(), linecnt, 55)            -> 	(checkDupes(), line, 88) 		- line 66
        vii.    (stut(), linecnt, 75)            -> 	(checkDupes(), line, 88) 		- line 66
        viii.   (stut(), curWord, 71)            -> 	(checkDupes(), curWord, 86) 		- line 66
        ix.     (stut(), lastdelimit, 70)        -> 	(checkDupes(), lastdelimit, 83) 	- line 66
        x.      (checkDupes(), curWord, 94)      -> 	(stut(), curWord, 71) 			- line 66
        xi.     (stut(), linecnt, 55)            -> 	(checkDupes(), line, 88) 		- line 74
        xii.    (stut(), linecnt, 75)            -> 	(checkDupes(), line, 88) 		- line 74
        xiii.   (stut(), curWord, 71)            -> 	(checkDupes(), curWord, 86) 		- line 74
        xiv.    (stut(), lastdelimit, 70)        -> 	(checkDupes(), lastdelimit, 83) 	- line 74
        xv.     (checkDupes(), curWord, 94)      -> 	(stut(), curWord, 71)		 	- line 74

(d) Tạo thông số kiểm thử để thỏa mãn bao hàm All-Coupling-Use cho **Shutter**
* t1: "word"
* t2: "word word"
* t3: "first line" -> "word word"

* i: t1
* ii: từ đầu vào thông thường
* iii: không thể được trong quá trình sử dụng
* iv: từ trong tập tin
* v: t1
* vi: t2
* vii: t3
* viii: t2
* ix: t2
* x: t2
* xi: t1
* xii: t3
* xii: t2
* xiv: t1
* xv: t1
