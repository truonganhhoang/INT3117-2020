## Bài 5:
- Để tìm thương của 2 số nguyên a & b, ta có mã nguồn JAVA sau:
```
static public double divide(int a, int b) {

        return ((double) a) / b;
    }
```

- Mã nguồn này sẽ phát sinh lỗi nếu b = 0:
![Fail](https://i.imgur.com/bVS4Ufr.png)

- Để sửa lỗi này, ta thêm vào điều kiện: nếu như b = 0, hàm sẽ trả về lỗi:
```
static public double divide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Invalid Divisor");
        else
            return ((double) a) / b;
    }
```

- Kết quả sau khi đã sửa:
![Success](https://i.imgur.com/mhNNW9w.png)
