>In Section 8.1.6, we introduced the example p = (a ∨ b) ∧ c, and
 provided expanded versions of the clauses using program variables.
 We then gave specific values to satisfy PC. We also gave truth values
 to satisfy CC. Find values for the program variables given to satisfy
 CC; that is, refine the abstract tests into concrete test values.


Ta có: p = (a ∨ b) ∧ c tương đương p = ( (x < y) ∨ done ) ∧ ```list.contains(str)```.
Các values đó là:
- (a:{x=3, y=5}, b và c có các giá trị bất kỳ)
- (a:{x=5, y=3}, b và c có các giá trị bất kỳ)
- (a có giá trị bất kỳ, b:{done = true}, c có giá trị bất kỳ)
- (a có giá trị bất kỳ, b:{done = false}, c có giá trị bất kỳ)
- (a và b có giá trị bất kỳ, c:list={"Rat", "Cat", "Dog"} str="Cat") 
- (a và b có giá trị bất kỳ, c:list={"Rat", "Cat", "Dog"} str="Smth")
