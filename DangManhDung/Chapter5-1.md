Cho rằng tiêu chí bao hàm của *C1* bao gồm tiêu chí bao hàm của *C2*. Cho rằng bộ kiểm thử *T1* thỏa mãn *C1* trong chương trình *P* và bộ kiểm thử *T2* thỏa mãn *C2* cũng trong *P*.
* (a) *T1* có thỏa mãn *C2* không?
    * Có, vì *C1* bao gồm *C2* và *T1* thỏa mãn *C1* nên *T1* thỏa mãn *C2*.
* (b) *T2* có thỏa mãn *C1* không?
    * Không, vì *T2* chỉ thỏa mãn *C2* và *C2* được bao gồm ở một mức độ thấp hơn trong *C1* nên không có lý do nào để khẳng định yêu cầu kiểm thử được tạo ra bởi *C1* sẽ được thỏa mãn bởi *T2*.
* (c) Nếu *P* có một lỗi và *T2* phát hiện ra lỗi thì *T1* không nhất thiết cũng phải phát hiện ra lỗi. Tại sao?
    * Bởi vì *T2* có thể có những bộ kiểm thử khác không nằm trong *T1* nên *T2* có thể phát hiện những lỗi khác mà *T1* không lường trước được.
