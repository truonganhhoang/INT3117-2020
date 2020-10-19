# Tất cả các đoạn code dưới đây đều có trong file Check.java mục Assets
# Answer the following questions for the method ```checkIt()``` below:
```
  public static void checkIt (boolean a, boolean b, boolean c) {
    if (a && (b || c)) {
      System.out.println ("P is true");
    } else {
      System.out.println ("P isn’t true");
    }
  }
```
### (a) Transform ```checkIt()``` to ```checkItExpand()```, a method where each if statement tests exactly one boolean variable. Instrument ```checkItExpand()``` to record which edges are traversed. (“print” statements are fine for this.)
Đoạn code ```checkIt()``` đã được mở rộng: 
```
  public static void ```checkItExpand (```boolean a, boolean b, boolean c) {
    if (a) {
      if (b) {
        System.out.println("P is true");
      } else if (c) {
        System.out.println("P is true");
      } else {
        System.out.println("P isn’t true");
      }
    } else {
      System.out.println ("P isn’t true");
    }
  }
```

### (b) Derive a GACC test set T1 for ```checkIt()```. Derive an Edge Coverage test set T2 for ```checkItExpand()```. Build T2 so that it does not satisfy GACC on the predicate in ```checkIt()```
### (c) Run both T1 and T2 on both ```checkIt()``` and ```checkItExpand()```.

Cả 2 câu b và c:

Đoạn code:
```
package Assets;

public class Check {
  public static void checkIt (boolean a, boolean b, boolean c) {
    if (a && (b || c)) {
      System.out.println ("P is true");
    } else {
      System.out.println ("P isn’t true");
    }
  }
  public static void checkItExpand (boolean a, boolean b, boolean c) {
    if (a) {
      if (b) {
        System.out.println("P is true");
      } else if (c) {
        System.out.println("P is true");
      } else {
        System.out.println("P isn’t true");
      }
    } else {
      System.out.println("P isn’t true");
    }
  }
  public static void main (String[] args) {
    boolean a = true, b = true, c = true;
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        for (int k = 1; k <= 3; k++) {
          System.out.println("a: " + a + " b: " + b + " c: " + c);
          System.out.print ("Result of checkIt():" );
          checkIt (a, b, c);
          System.out.print ("Result of checkItExpand():" );
          checkItExpand (a, b, c);
          c = !c;
        }
        b = !b;
      }
      a = !a;
    }
  }
}
```

Kết quả in ra: 
```
a: true b: true c: true
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: true c: false
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: true c: true
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: false c: false
Result of checkIt():P isn’t true
Result of checkItExpand():P isn’t true
a: true b: false c: true
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: false c: false
Result of checkIt():P isn’t true
Result of checkItExpand():P isn’t true
a: true b: true c: true
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: true c: false
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: true c: true
Result of checkIt():P is true
Result of checkItExpand():P is true
a: false b: false c: false
Result of checkIt():P isn’t true
Result of checkItExpand():P isn’t true
a: false b: false c: true
Result of checkIt():P isn’t true
Result of checkItExpand():P isn’t true
a: false b: false c: false
Result of checkIt():P isn’t true
Result of checkItExpand():P isn’t true
a: false b: true c: true
Result of checkItExpand():P isn’t true
a: false b: true c: false
Result of checkIt():P isn’t true
Result of checkItExpand():P isn’t true
Result of checkItExpand():P isn’t true
a: false b: false c: false
Result of checkIt():P isn’t true
Result of checkItExpand():P isn’t true
a: false b: false c: true
Result of checkIt():P isn’t true
Result of checkItExpand():P isn’t true
a: false b: false c: false
Result of checkIt():P isn’t true
Result of checkItExpand():P isn’t true
a: true b: true c: true
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: true c: false
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: true c: true
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: false c: false
Result of checkIt():P isn’t true
Result of checkItExpand():P isn’t true
a: true b: false c: true
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: false c: false
Result of checkIt():P isn’t true
Result of checkItExpand():P isn’t true
a: true b: true c: true
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: true c: false
Result of checkIt():P is true
Result of checkItExpand():P is true
a: true b: true c: true
Result of checkIt():P is true
Result of checkItExpand():P is true
```