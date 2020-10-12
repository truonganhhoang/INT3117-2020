(a) Từ chương trình cho thấy (2) là node kết thúc, (6) cũng có thể là node kết thúc, còn các node (1), (3), (4), (5) thì không phải các node kết thúc. Các cạnh sẽ có đó là:

    (1) --> (2)
    (1) --> (3)
    (2) --> (3)
    (3) --> (4)
    (3) --> (5)
    (4) --> (6)
    (5) --> (6)

(b) Các đường đi thỏa mãn:

    t1 : [ f1, f3, f5, f6 ]
    t2 : [ f1, f3, f4, f6 ]
    t3 : [ f1, f2 ]
    t4 : [ f1, f3, f4, f6]
    t5 : [ f1, f2, f3, f4, f6]
    
(c)
Ba đường kiểm thử ngắn nhất thỏa mãn `Node Coverage` đó là :

    { t1, t2, t3 }
    
    { t1, t3, t4 }
    
    { t1, t5 }
    
(d) Chỉ có duy nhất một đường đi kiểm thử thỏa mãn `Node Coverage` đó là: 

    {t1,t5}

(e) Bốn đường đi chính thỏa mãnmãn đó là:

    1. [f1, f2, f3, f4, f6]
    2. [f1, f2, f3, f5, f6]
    3. [f1, f3, f4, f6]
    4. [f1, f3, f5, f6]}

