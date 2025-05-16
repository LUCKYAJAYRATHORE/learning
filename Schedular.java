import java.util.LinkedList;
import java.util.Queue;

public class Schedular {
  private Queue<Customer> vipQueue;
  private Queue<Customer> regularQueue;

  private int vipRatio;
  private int vipServed;

  public Schedular(int vipRatio) {
    this.vipRatio = vipRatio;
    this.vipServed = 0;
    this.vipQueue = new LinkedList<>();
    this.regularQueue = new LinkedList<>();
  }

  public void checkin(Customer customer) {
    if (customer.isVIP()) {
      vipQueue.offer(customer);
    } else {
      regularQueue.offer(customer);
    }
    System.out.println("Checked in: " + customer);
  }

  public Customer getNextCustomer() {
    if (!vipQueue.isEmpty() && vipServed < vipRatio || regularQueue.isEmpty()) {
      vipServed++;
      return vipQueue.poll();
    } else if (!regularQueue.isEmpty()) {
      vipServed = 0;
      return regularQueue.poll();
    }
    return null;
  }
}
