# **Question:** 
Below are four faulty programs. Each includes test inputs that result in failure. Answer the following questions about each program.

**Dịch**
> Dưới đây là 4 chương trình có lỗi. Trong mỗi cái bao gồm nhiều đầu vào test mà khiến kết quả bị sai. Trả lời những câu hỏi đưới về mỗi chương trình.

# **Program 1:**
```java
/**
     * Find last index of element
     *
     * @param x array to search
     * @param y value to look for
     * @return last index of y in x, -1 if absent
     * @throws NullPointerException if x is null
     */
    public int findLast(int[] x, int y)
    {
        for(int i=x.length-1; i>0; i--)
        {
            if(x[i]==y)
            {
                return i;
            }
        }
        return -1;
    }
    //test x=[2, 3, 5]; y=2. Expected=0
    //Book website FindLast.java
    //Book website FindLastTest.java
```

**(a)** Đoạn code trên có lỗi fault do ở trong vòng for lại gán index bằng độ dài của mảng x nhưng điều kiện dừng lại là i>0 tức là i=1. Vậy có thể hiểu mảng chạy từ 1 đến x.length-1.
Mảng chạy từ 1 tức là đã bỏ qua phần tử đầu của mảng với chỉ số index=0

**(b)**
Test case có thể by test là: x=[1, 2, 3]; y=2; Expected=1
> Result = 1;

**(c)**
Test case chạy sai nhưng không thể hiên lỗi ra ngoài là:
x=[2]; y=2; Expected=0
> Result = NullPointerException;

**(d)**
Test case gây lỗi error nhưng không phải failure:
x=[2, 3, 5]; y=2; Expected=0;
> Result = -1;

**(e)**
Test case đã cho gây lỗi bởi vì y=2, mà 2 ở mảng x có index = 0. Mà trong method findLast lại cho chạy mảng với index = 1, bỏ qua phần tử đầu nên dẫn đến việc giá trị trả về là -1 do các phần tử sau không xuất hiện giá trị 2 trong mảng.

**(f)**
```java
/**
     * Find last index of element
     *
     * @param x array to search
     * @param y value to look for
     * @return last index of y in x, -1 if absent
     * @throws NullPointerException if x is null
     */
    public static int findLast(int[] x, int y)
    {
        for(int i=x.length-1; i>=0; i--)
        {
            if(x[i]==y)
            {
                return i;
            }
        }
        return -1;
    }
    //test x=[2, 3, 5]; y=2. Expected=0
    //Book website FindLast.java
    //Book website FindLastTest.java
```

# **Program 2:**
```java
/**
     * Find last index of zero
     *
     * @param x array to search
     *
     * @return last index of y in x, -1 if absent
     * @throws NullPointerException if x is null
     */
    public static int lastZero(int[] x)
    {
        for(int i=0; i<x.length; i++)
        {
            if(x[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
    //test x=[0, 1, 0]. Expected=2
    //Book website LastZero.java
    //Book website LastZeroTest.java
```

**(a)** Đoạn code trên có lỗi, bởi vì tìm chỉ số cuối cùng của số 0 trong mảng mà lại cho vòng for chạy từ đầu tới cuối (tức chạy xuôi). Điều này dẫn đến việc tìm chỉ số đầu tiên của phần tử 0 trong mảng chứ không phải chỉ số cuối cùng.

**(b)**
Test case có thể by test là: x=[1, 2, 0]; Expected=2
> Result = 2;

**(c)**
Test case chạy vào fault mà không gây lỗi error:
test x=[0, 1, 0]. Expected=2
> Result = 0
