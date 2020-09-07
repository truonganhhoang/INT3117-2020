(a) Viết một thuật toán Java với cú pháp
**public static Vector union (Vector a, Vector b)**
Thuật toán trở về một vector mang phần tử có trong cả hai vector

        public static Vector union (Vector a, Vector b){
          int i=0;
          Vector c= b.clone();
          Enumeration aEnum = a.elements();
          while(aEnum.hasMoreElements()){
            if(!c.contains(aEnum.nextElement())
              c.removeAll(a.elementAt(i);
            i++;
          }
          return c;
        }

(b) Phát hiện càng nhiều lỗi càng tốt

- thuật toán sử dụng một bản sao của b và một enumrate của a nên có thể dẫn đến sai lệch
- i có thể bị lệch trong quá trình sử dụng
- không thể tái sử dụng thuật toán ngay lập tức
