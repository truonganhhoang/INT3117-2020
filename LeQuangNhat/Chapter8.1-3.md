# Write the predicate (only the predicate) to represent the requirement:
## “List all the wireless mice that either retail for more than $100 or for which the store has more than 20 items. Also list non-wireless mice that retail for more than $50.”

Ta có danh sách các mệnh đề sau đây: 
- M: Chuột
- W: Không dây
- NW: Không dây
- S: Số lượng hàng có trong cửa hàng
- P: Giá của món hàng tương ứng

Từ danh sách các mệnh đề, với miêu tả trên, ta lập ra được vị từ phù hợp:
```
((M = W) ∧ ((P >= $100) ∨ (S >= 20))) ∨ (-(M = W) ∧ (P > $50))
```