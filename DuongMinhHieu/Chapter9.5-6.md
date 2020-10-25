#  Answer questions (a) and (b) for the following grammar.

phoneNumber	::= exchangePart dash numberPart
exchangePart	::= special zeroOrSpecial other
numberPart	::= ordinary^*
ordinary	::= zero | special | other
zeroOrSpecial	::= zero | special
zero		::= "0"
special		::= "1" | "2"
other		::= "3" | "4" | "5" | "6" | "7" | "8" | "9"
dash		::= "-"

* (a) Classify the following as either phoneNumbers (in the grammar). For numbers not in the grammar, state why not.
1. 123-4567
2. 012-3456
3. 109-1212
4. 246-9900
5. 113-1111

(b) Consider the following mutation of the grammar:
exchangePart ::= special ordinary other

If possible, give a string that appears in the mutated grammar but not in the original grammar, another string that is in the original but not the mutated, and a third string that is in both.

# Trả lời:
* (a): 2 và 4 không sinh ra từ ngữ pháp vì tại exchangePart, zeroOrSpecial chỉ dẫn xuất ra 0 | 1 | 2 chứ không có số 4 do đó 4 sai, ở other chỉ có 3 -> 9 ở đây là 2 nên 2 sai.

* (b)
	* Chuỗi ở trong ngữ pháp biến dị mà không trong ngữ pháp thường: 032-4567.
	* Chuỗi ở trong ngữ pháp thường mà không trong ngữ pháp biến dị: Không có vì ngữ pháp biến dị bao hàm ngữ pháp thường (ordinary bao hàm zeroOrSpecial).
	* Chuỗi ở cả hai: 123-4567.