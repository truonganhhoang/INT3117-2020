## Câu 4: Trả lời câu hỏi dựa trên hàm `intersection()`:

a, Mảng "Validation of s1" có thỏa mãn tính đầy đủ không?
- s1 has invalid input -> chưa thỏa mãn tính đầy đủ.

b, Mảng "Validation of s1" có thỏa mãn tính không giao nhau không?
- đã thỏa mãn tính không giao nhau.

c, Mảng "Relation between s1 and s2" có thỏa mãn tính đầy đủ không?
- không. vd: s1 = [1, 2, 3], s2 = [1, 4, 5] có 1 phần tử chung nhưng s1 không là tập con của s2 và ngược lại

d, Mảng "Relation between s1 and s2" có thỏa mãn tính không giao nhau không?
- không. vì nếu s1 = s2 thì s1 là tập con của s2 và ngược lại

f, 

|Characteristic|b1|b2|b3|b4|b5
|-|-|-|-|-|-|
|Validity of s1|s1 = null|s1 = {}|s1 has >= 1 elements|s1 is invalid|
|Relation between s1 and s2|s1 = s2| (s1 ⊂ s2) && (s1 < s2) | (s2 ⊂ s1) && (s2 <s 1>)| s1 ⋂ s2| s1 ⋂ s2 = ∅ |