Cho BNF sau với ký tự khởi đầu A:

        A ::= B"@"C"."B
        B ::= BL | L
        C ::= B | B"."B
        L ::= "a" | "b" | "c" | ... | "y" | "z"

Và các kiểm thử sau:

        t1 = a@a.a
        t2 = aa.bb@cc.dd
        t3 = mm@pp
        t4 = aaa@bb.cc.dd
        t5 = bill
        t6 = @x.y

Với mỗi kiểm thử, xác định thứ tự kiểm thử mà là "in" BNF, hoặc "out" BNF

        t1 ("in"): A -> B@C.B
                     -> L@B.L
                     -> a@L.a
                     -> a@a.a
			  
        t2 ("out"): A -> B@C.B
                      -> (mutant: B -> BL | L | B.B) B.B@B.BL
                      -> BL.BL@BL.Ld
                      -> La.Lb@Lc.dd
                      -> aa.bb@cc.dd
			
        t3 ("out"): A -> (mutant: A -> B@B) B@B
                      -> BL@BL
                      -> Lm@Lp
                      -> mm@pp
			  
        t4 ("in"): A -> B@C.B
                     -> BL@B.B.BL
                     -> BLa@BL.BL.Ld
                     -> Laa@Lb.Lc.dd
                     -> aaa@bb.cc.dd
			  
        t5 ("out"): A -> (mutant: A -> B) B
                      -> BL
                      -> BLl
                      -> BLll
                      -> Lill
                      -> bill
			
        t6 ("out"): A -> B@C.B
                      -> (mutant: B -> BL | L | ~) @B.L
                      -> @L.y
                      -> @x.y