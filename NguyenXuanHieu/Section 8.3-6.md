# Section 8.3-6

# Answer the following questions for the method twoPred() below:

a, Identify test inputs for twoPred() that achieve Restricted Active Clause Coverage
(RACC)

- Chúng ta cần 3 bài kiểm tra
    
    + x < y là đúng; x + y == 10 là đúng; 
    + x < y là sai; x + y == 10 là đúng
    + x < y là đúng; x + y == 10 là sai

b, Identify test inputs for twoPred() that achieve Restricted Inactive Clause Coverage
(RICC).

- RICC không có cặp nào cho P = đúng. Cho P = sai, chúng ta tin tưởng TF và FF cho mệnh đề đầu tiên, và FT và FF cho mệnh đề thứ 2. Đó là kết quả cho 3 bài kiểm dưới đây

    + x < y là sai; x + y == 10 là sai
    + x < y là đúng; x + y == 10 là sai
    + x < y là sai; x + y == 10 là đúng