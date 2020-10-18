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
