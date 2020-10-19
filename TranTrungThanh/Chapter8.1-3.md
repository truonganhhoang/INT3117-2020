> Write the predicate (only the predicate) to represent the requirement:\
  “List all the wireless mice that either retail for more than $100 or for
  which the store has more than 20 items. Also list non-wireless mice
  that retail for more than $50.”
>

Vị từ mô tả các con chuột máy tính được liệt kê theo yêu cầu là:
((mouseType = wireless) ∧ ((retail > 100) ∨ (stock > 20)))∨ (¬(mouseType = wireless) ∧ (retail > 50))
