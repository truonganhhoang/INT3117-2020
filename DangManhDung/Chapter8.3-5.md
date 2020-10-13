Cho phương thức **checkIt()** sau:

![image](https://user-images.githubusercontent.com/48431650/95806119-2594cf00-0d31-11eb-9ccd-1aac1e0a7c5b.png)

(a) Biến đổi **checkIt()** thành **checkItExpand** mà mỗi lệnh *if* kiểm thử chỉ một tham số boolean.
* Code nằm trong "Chapter8.3-5 code/checkItExpand.java"

(b) Tạo một bộ kiểm thử T1 cho checkIt(), một bộ kiểm thử bao hàm cạnh T2 cho checkItExpand()

* Gọi cặp GACC cho các mệnh đề như sau:
 * a: {1,2,3}x{5,6,7}
 * b: (2,4)
 * c: (3,4)
* T1: {2,3,4}x{5,6,7}
* T2: {1,3,4,8}

(c) Chạy T1 và T2
* Code nằm trong "Chapter8.3-5 code/checkItRun.java"
* Kết quả chạy chương trình:
true true true
checkIt(): 1: P is true
checkItExpand(): 1: P is true
true true false
checkIt(): 1: P is true
checkItExpand(): 1: P is true
true false true
checkIt(): 1: P is true
checkItExpand(): 2: P is true
true false false
checkIt(): 3: P isn’t true
checkItExpand(): 3: P isn’t true
false true true
checkIt(): 3: P isn’t true
checkItExpand(): 4: P isn’t true
false true false
checkIt(): 3: P isn’t true
checkItExpand(): 4: P isn’t true
false false true
checkIt(): 3: P isn’t true
checkItExpand(): 4: P isn’t true
false false false
checkIt(): 3: P isn’t true
checkItExpand(): 4: P isn’t true