Bài 5:
- Chương trình nhập một số bất kì và tính tổng các chữ số của số đã nhập 

import java.util.Scanner;
public class Main {
    public static int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }

    public static int tongChuSo(int n) {
        int T = 1;
        while (n > 0) {
            T += n % 10;
            n /= 10;
        }
        return (T);
    }
}

- Kiểm có lỗi :
public class test{
  @Test
  public static void test(){
    Main.nhap(123);
    assertEquals(6, Main.tongChuso(123));
    /// Error: Main.tongChuso(123) = 7 not 6
  }
}  

-Sau khi sửa lại code :

import java.util.Scanner;
public class Main {
    public static int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }

    public static int tongChuSo(int n) {
        int T = 0;
        while (n > 0) {
            T += n % 10;
            n /= 10;
        }
        return (T);
    }
}

-Kiểm không có lỗi :
public class test{
  @Test
  public static void test(){
    Main.nhap(123);
    assertEquals(6, Main.tongChuso(123));
    ///Main.tongChuso(123) = 6
  }
}  
