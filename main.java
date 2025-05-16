public class main {

  public static void main(String[] args) {
    Schedular schedular = new Schedular(3);

    Customer[] customers = {
        new Customer(1, "Amit", true),
        new Customer(2, "Ravi", true),
        new Customer(3, "Neha", false),
        new Customer(4, "Sara", true),
        new Customer(5, "Karan", false),
        new Customer(6, "Divya", false)
    };

    for (Customer c : customers) {
      schedular.checkin(c);
    }

    System.out.println("\n-- Serving Order --");

    for (int i = 0; i < 6; i++) {

      Customer next = schedular.getNextCustomer();

      if (next != null) {
        System.out.println("Serving: " + next);
      } else {
        System.out.println("No more customers.");
      }
    }

  }
}
