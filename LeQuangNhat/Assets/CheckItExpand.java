package Assets;

public class CheckItExpand {
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
      System.out.println ("P isn’t true");
    }
  }
}
