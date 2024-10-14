package abstraction;

public class Hdfc extends Bank {
	static int a = 10;
  public void savings() {
	  System.out.println("Saving");
	  int a = 20;
	  System.out.println(a);
  }
  public void current() {
	  System.out.println("Current");
  }
  public static void main(String[] args) {
	Hdfc h = new Hdfc();
	h.savings();
	h.current();
	h.salary();
	System.out.println(a);
	a = a+ 15;
	System.out.println(a);
}
}
