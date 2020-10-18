# Section 8.3-5

# Answer the following questions for the method checkIt() below:

a, Transform checkIt() to checkItExpand(), a method
where each if statement tests exactly one boolean variable.
Instrument checkItExpand() to record which edges are
traversed. (“print” statements are fine for this.)

```
public static void checkItExpand (boolean a, boolean b, boolean c){
    if (a) {
        if (b) {
            System.out.println ("1: P is true");
        }
        else if(c) {
            System.out.println ("2: P is true");
        }
        else {
            System.out.println ("3: P isn’t true");
        }
    }
    else {
        System.out.println ("4: P isn’t true");
    }
}
```

b, Derive a GACC test set T1 for checkIt(). Derive an Edge Coverage test set T2 for checkItExpand(). Build T2 so that it does not satisfy GACC on the predicate in checkIt().

- Nếu số liệu chúng ta tin tưởng ở trong bảng là cách thông thường thì chúng ta có:

    + cặp GACC cho a: {1, 2, 3} x {5, 6, 7}
    + cặp GACC cho b: {2, 4}
    + cặp GACC cho c: {3, 4}

- Vậy, 1 bài kiểm tra GACC T1 cho checkIt() cần có những bài kiểm tra {2, 3, 4} và  {5, 6, 7}
- Với mỗi đỉnh bao phủ cho checkItExpand(), chúng ta cần Txx và Fxx cho mệnh đề a, TFx và TTx cho mệnh đề b và TFT và TFF cho mệnh đề c. 2 cột cuối cùng 3 và 4 từ bảng chân trị, cho nên mọi đỉnh đều có nó. Thông thường chúng ta cần 1 hoặc 2 cho TTx. Chú ý rằng TFx đã được lấy. Cuối cùng chúng ta cần 5, 6, 7, 8 cho Fxx. Lại lần nữa Txx đã bị lấy

c, Run both T1 and T2 on both checkIt() and checkItExpand()

```
public class check{
    public static void checkIt(boolean a, boolean b, boolean c) {
        if(a && (b||c)) {
            System.out.println("1: P is true")
        }
        else {
            System.out.println("3: P isn't True")
        }
    }

    public static void checkItExpand (boolean a, boolean b, boolean c) {
        if (a) {
            if (b){
                System.out.println ("1: P is true");
            }
            else if (c) {
                System.out.println ("2: P is true");
            }
            else {
                System.out.println ("3: P isn’t true");
            }
        }
        else {
            System.out.println ("4: P isn’t true");
        }
    }
}

public static void main(String[] args) {
    boolean a = true;
    boolean b = true;
    boolean c = true;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 2; k++) {
                System.out.println (a + " " + b + " " + c);
                System.out.print ("checkIt(): ");
                checkIt (a, b, c);
                System.out.print ("checkItExpand(): ");
                checkItExpand (a, b, c);
                c = !c;
            }
            b = !b;
        }
        a = !a;
    }
}