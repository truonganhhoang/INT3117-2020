# Chapter 8.1-3

**Write the predicate (only the predicate) to represent the requirement:
 
“List all the wireless mice that either retail for more than $100 or for which the store has more than 20 items. Also list non-wireless mice that retail for more than $50.”**
<hr/>

Khẳng định biểu diễn điều kiện trên là

`((type = wireless) ∧ ((retail > 100$) ∨ (stock > 20))) ∨ (¬(type = wireless) ∧ (retail > 50))`