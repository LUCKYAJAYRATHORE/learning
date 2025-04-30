public class Foo{

  public static void main(String[] args) {
    MyOuter outerObj = new MyOuter();
    MyOuter.MyInner innerObj = outerObj.new MyInner();
  }
  public void go() {
    Laundry laundry  = new Laundry();
    try {
      laundry.doLaundry();
    }
    catch{
      throws PantException;
    }
    catch{
      throws LingerieException;
    }
  }
}