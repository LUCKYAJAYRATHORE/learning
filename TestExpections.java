public class TestExpections {
  public static void main(String[] args) {
    String test = "no";
    try {
      System.out.println("start try");
      doRisky(test);
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

  static void doRisky(String test) {
    System.out.println("test");
  }
}
