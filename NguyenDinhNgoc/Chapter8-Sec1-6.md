*p = (x < y ∨ done) ∧ list.contains(str)*

    1. x < y true: x = 1, y = 2
    2. x < y false: x = 2, y = 1
    3. done: true
    4. done: false
    5. list.contains(str) true: list = ["Nguyen", "Dinh", "Ngoc"], str = "Ngoc"
    6. list.contains(str) false: list = ["Nguyen", "Dinh", "Ngoc"], str = "HD7HD7"