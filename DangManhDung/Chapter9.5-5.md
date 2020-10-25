Cho ngữ pháp sau:

val    ::= number | val pair
number ::= digit+
pair   ::= number op | number pair op
op     ::= "+" | "-" | "*" | "/"
digit  ::= "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"

(a) Xâu nào có thể được phát sinh từ ngữ pháp

        42 // In grammar
        4 2 // Not in grammar
        4 + 2 // Not in grammar
        4 2 + // In grammar
        4 2 7 - * // In grammar
        4 2 - 7 * // In grammar
        4 2 - 7 * + // Not in grammar

(b) Tìm một xâu phát sinh được từ ngữ pháp đột biến nhưng không từ ngữ pháp ban đầu
* 4 + 2

(c) Tìm một xâu mà phát sinh của nó dùng một luật mới trong ngữ pháp đột biến và ngữ pháp ban đầu

* 4 2 - 7 *

* original
        
        val -> val pair
            -> val pair number op
            -> number pair number op
            -> number number op number op
            -> 4 2 - 7 *

* mutated

        val -> val pair
            -> number pair
            -> number number pair op
            -> number number op number op
            -> 4 2 - 7 *