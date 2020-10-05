# 5. Sử dụng các đặc điểm và khối sau cho các câu hỏi bên dưới.
  | Characteristics | Block 1 | Block 2 | Block 3 | Block 4 |
  |-----------------|---------|---------|---------|---------|
  | Value 1 | < 0 | 0 | > 0 |  |
  | Value 2 | < 0 | 0 | > 0 |  |
  | Operation | + | - | x | / |
  
  a. Đưa ra các bài kiểm thử để đáp ứng tiêu chuẩn chọn lẻ Each Choice.
  - Cần 4 ca kiểm thử
  - Bảng ca
    
    | V1 | V2 | Op |
      |-----------------|---------|---------|
      | -2 | -2 | + | 
      | 0 | 0 | - | 
      | 2 | 2 | * | 
      | 2 | 2 | / | 
      
      
  b. Đưa ra các ca kiểm thử đáp ứng tiêu chuẩn chịn theo giá trị quan trọng Base Choice. Giả sử base choice là: giá trị 1 = > 0, giá trị 2 = > 0, và toán tử = +.
  - Cần 2 * 2 * 2 = 8 ca kiểm thử
  - Bảng ca
    
    | V1 | V2 | Op |
      |-----------------|---------|---------|
      | 2 | 2 | + | 
      | -2 | -2 | + | 
      | 0 | 2 | + | 
      | 2 | -2 | + | 
      | 2 | 0 | + | 
      | 2 | 2 | - | 
      | 0 | 0 | - | 
      | 2 | 2 | * | 
      | 2 | 2 | / | 
      
  c. Có bao nhiêu ca kiểm thử cần thiết để thảo mãn tiêu chuẩn Tất cả các tổ hợp All Combinations
- Cần 3 * 3 * 4 = 36 ca kiểm thử

d.  Đưa ra một số ca kiểm thử thỏa mãn tiêu chuẩn kết cặp Pair-Wise  
- Các cặp tổ hợp: 7 + 7 + 7 + 4 + 4 + 4 = 33
- Mỗi ca kiểm thử có thể chia làm 3 đôi nên cần ít nhất 11 ca kiểm thử. Như vậy, giải pháp tốt nhất là thêm 1 ca kiểm thử, tổng cộng 12 ca
- Các ca kiểm thử

    | V1 | V2 | Op |
      |-----------------|---------|---------|
      | -2 | -2 | + | 
      | -2 | 0 | - | 
      | -2 | 2 | * | 
      | 2 | -2 | / | 
      | 2 | 0 | - | 
      | 0 | -2 | * | 
      | 0 | 0 | / | 
      | -2 | 2 | / | 
      | 0 | 0 | * | 
      | 2 | -2 | - | 
