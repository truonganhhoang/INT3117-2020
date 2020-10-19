# Câu 6 

Ta có: p = (a ∨ b) ∧ c tương đương p = ( (x < y) ∨ done ) ∧ ```list.contains(str)```.<br/>
Các values đó là:<br/>
- (a:{x=3, y=5}, b và c có các giá trị bất kỳ)
- (a:{x=5, y=3}, b và c có các giá trị bất kỳ)
- (a có giá trị bất kỳ, b:{done = true}, c có giá trị bất kỳ)
- (a có giá trị bất kỳ, b:{done = false}, c có giá trị bất kỳ)
- (a và b có giá trị bất kỳ, c:list={"Rat", "Cat", "Dog"} str="Cat") 
- (a và b có giá trị bất kỳ, c:list={"Rat", "Cat", "Dog"} str="Smth")