Dùng lớp **GoodFastCheap**

(a) Thiết lập kiểm thử đạt được RACC cho thuộc tính trong **isSatisfactory()**

* Code nằm trong "Chapter8.3-12 code/GoodFastCheapRACC.java"

(b) Ta cải biến **isSatisfactory()** như sau:

		public boolean isSatisfactory()
		{
			if (good && fast) return true;
			if (good && cheap) return true;
			if (fast && cheap) return true;
			return false;
		}
Kiểm thử ở câu trên không còn thỏa mãn RACC, cải biến lại kiểm thử để thỏa mãn

* Code nằm trong "Chapter8.3-12 code/GoodFastCheapRACC - refractored.java"

(c) Thiết lập kiểm thử đạt được MUMCUT cho thuộc tính trong **isSatisfactory()**

* Code nằm trong "Chapter8.3-12 code/GoodFastCheapMUMCUT.java"