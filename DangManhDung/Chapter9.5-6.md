Cho ngữ pháp sau:

phoneNumber   ::= exhangePart dash numberPart
exchangePart  ::= special zeroOrSpecial other
numberPart    ::= ordinary ^4
ordinary      ::= zero | special | other
zeroOrSpecial ::= zero | special
zero          ::= "0"
special       ::= "1" | "2"
other         ::= "3" | "4" | "5" | "6" | "7" | "8" | "9"
dash          ::= "-"

(a) Xác định các số sau có phải phoneNumber hay không.

* 123-4567 là phoneNumber.
* 012-3456 không là phoneNumber vì số thứ ba không là "other".
* 109-1212 là phoneNumber.
* 346-9900 không là phoneNumber vì số thứ hai không là "zeroOrSpecial".
* 113-1111 là phoneNumber.

(b) Cho đột biến của ngữ pháp sau:

        exchangePart ::= special ordinary other

Tìm một xâu xuất hiện trong ngữ pháp đột biến nhưng không trong ngữ pháp ban đầu, một sâu trong ngữ pháp ban đầu nhưng không trong đột biến, một sâu trong cả hai

* M!O: 246-9900
* !MO: không tồn tại
* MO: 123-4567