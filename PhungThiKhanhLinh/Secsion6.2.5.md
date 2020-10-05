#### Exercise 5: 
__a, 4 bộ kiểm thử cần thiết là:__
| V1  | V2  |Op |
|:----:|:----:| :----: |
| -2  | -2  | + |
| 0   | 0   | − |
| 2   | 2   | × |
| 2   | 2   | ÷ |
__b, 8 bộ kiểm thử cần thiết là:__
| V1  | V2  |Op |
|:----:|:----:| :----: |
| 2   | 2   | + |
| -2  | 2   | + |
| 0   | 2   | + |
| 2   | -2  | + |
| 2   | 0   | + |
| 2   | 2   | - |
| 2   | 2   | × |
| 2   | 2   | ÷ |
__c,__ Có tất cả `3×3×4=36` thử nghiệm để đáp ứng tất cả các tiêu chí kết hợp
__d,__ Có tất cả `7+7+7+4+4+4=33` thử nghiệm để đáp ứng tất cả tiêu chí theo từng cặp
Vì mỗi bộ thử có thể chứa 3 cặp, nên cần ít nhất 11 thử nghiệm. Giải pháp tốt nhất là bao gồm một lần kiểm tra bổ sung, với tổng số 12 lần kiểm tra:
| V1  | V2  |Op |
|:----:|:----:| :----: |
| -2  | -2  | + |
| -2  | 0   | - |
| -2  | 2   | × |
|  2  | -2  | ÷ |
|  2  | 0   | + |
| 0   | 2   | - |
| 0   | -2  | × |
| 0   | 0   | ÷ |
| 0   | 2   | + |
| 2   | -2  | - |
| 2   | 0   | × |
| -2  | 2   | ÷ |





