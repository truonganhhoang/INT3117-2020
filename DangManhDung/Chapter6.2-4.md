Cho phương thức **intersection()** sau:

![image](https://user-images.githubusercontent.com/48431650/95005617-55532100-0625-11eb-8920-a8f92c581e87.png)

(a) Sự phân miền "Validity of s1" có thỏa mãn tính đầy đủ không?
* Có, phân miền "Validity of s1" thỏa mãn thuộc tính tính đầy đủ vì "s1" có thể rỗng hoặc trống hoặc có ít nhất 1 phần tử trong đó. Bất kỳ giá trị nào được cung cấp cho s1 sẽ phù hợp với một trong ba điều kiện và không thể có giá trị nào cho s1 mà không thỏa mãn bất kỳ ba điều kiện.

(b) Sự phân miền "Validity of s1" có thỏa mãn tính rời rạc không?
* Có, phân miền "Validity of s1" thỏa mãn thuộc tính rời rạc, tức là không có giá trị nào trong s1 có thể phù hợp cho nhiều hơn một điều kiện. Các giá trị sẽ cho một tập hợp rỗng, một tập hợp rỗng hoặc một tập hợp có ít nhất một phần tử trong đó. Giá trị không thể phù hợp với nhiều hơn một phân miền.

(c) Sự phân miền "Relation between s1 and s2" có thỏa mãn tính đầy đủ không?
* Có, nó thể hiện tính đầy đủ, nếu s1, s2 không phải là tập hợp rỗng thì không thể có bất kỳ điều kiện nào ngoài bốn bộ đã cho.

(d) Sự phân miền "Relation between s1 and s2" có thỏa mãn tính rời rạc không?
* Không, nó không thể hiện thuộc tính rời rạc như khi s1 = {} và s2 = {} tức là cả hai tập hợp đều trống, người ta sẽ coi điều kiện s1 & s2 đại diện cho cùng một tập hợp hoặc điều kiện s1 & s2 không có phần tử nào chung.