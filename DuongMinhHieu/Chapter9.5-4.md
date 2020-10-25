#  Provide a BNF description of the inputs to the `cal()` method in the homework set for Section 9.2.2. Succinctly describe any requirements or constraints on the inputs that are hard to model with the BNF.

# Trả lời:
* Các điều kiện trong vòng lặp khó có thể mô hình hóa được bằng BNF.
numDays ::= day2'-'day1 | day2'+'daysIn^*'-'day1
daysIn ::= '28' | '29' | '30' | '31' | '0' |