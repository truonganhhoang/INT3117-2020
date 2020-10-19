#  Chapter 8 - Section 3 - Exercise 2 

Nhìn chung, bài tập này tương tự với bài tập 8.3-1. Tuy nhiên chúng ta cần phải đánh gía mỗi mệnh đề thành sai để bài test được hoàn thành, bởi vì vài mệnh đề có thể không được đánh giá nếu một mệnh đề khác được nhận giá trị false (nếu b false thì c sẽ không ảnh hưởng và không được đánh giá)

```
- CC: clause coverage;
- Test set for CC: (curTemp, dTemp, thresholdDiff, override) = {(20,27,2,"true");(20,27,2,"false";(20,20,2,"true");(20,20,2,"false"))
```