```
public void SieveOfEratosthenes (int n)
        {
            boolean prime[] = new boolean[n+1];
            for (int i = 2; i < n; i++)
            {
                prime[i] = true;
            }

            for (int j = 2; j * j <= n; j++)
            {
                if(prime[j] == true)
                {
                    for (int i = j * j; i <= n; i += j)
                    {
                        prime[i] = false;
                    }
                }
            }

            for (int i = 2; i <= n; i++)
            {
                if(prime[i] == true)
                    System.out.print(i + " ");
            }
        }
 ```
 
 - False positive đầu tiên là 19, ca kiểm thử sẽ phải sinh ra 7 số nguyên tố trước khi gặp số 19.
 - Mô hình RIPR được sử dụng để tìm xem có lỗi trong hệ thống không bởi chúng ta sẽ nghĩ rằng đoạn mã chạy tốt là không có lỗi
