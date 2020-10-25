Dùng phương thức **patternIndex()** trong Chapter 7. Cho hai đột biến sau

        while (isPat == false && isub + patternLen - 1 < subjectLen) // Original
        while (isPat == false && isub + patternLen - 0 < subjectLen) // Mutant A
        isPat = false; // Original
        isPat = true; // Mutant B

(a) Tìm đầu vào kiểm thử không tới được đột biến
* A: TestPat X
* B: TestPat X X

(b) Tìm đầu vào kiểm thử thỏa mãn tính tới được nhưng không lây nhiễm cho đột biến
* A: TestPat yet yes
* B: Không thể vừa tới vừa lây nhiễm

(c) Tìm đầu vào kiểm thử thỏa mãn tính tới được, có lây nhiễm nhưng không lan truyền cho đột biến
* A: TestPat yet yes
* B: TestPat yet yes

(d) Tìm đầu vào kiểm thử triệt tiêu được đột biến
* A: TestPat X X
* B: TestPat ohyeahyes yes