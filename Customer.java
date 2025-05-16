public class Customer {

  private int id;
  private String name;
  private boolean isVIP;

  public Customer(int id, String name, boolean isVIP) {
    this.id = id;
    this.name = name;
    this.isVIP = isVIP;
  }

  public boolean isVIP() {
    return isVIP;
}

  public String toString() {
      return name + (isVIP ? "(VIP)" : "(Regular)");
  }

}
