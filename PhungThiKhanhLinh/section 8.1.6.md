p = (x < y ∨ done) ∧ list.contains(str)

+ x < y true: x = 1, y = 2
+ x < y false: x = 2, y = 1
+ done: true
+ done: false
+ list.contains(str) true: list = ["Nguyen", "Xuan", "Truong"], str = "Truong"
+ list.contains(str) false: list = ["Nguyen", "Xuan", "Truong"], str = "Gray"