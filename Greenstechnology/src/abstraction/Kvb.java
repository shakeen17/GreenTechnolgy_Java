package abstraction;

public class Kvb implements Banks {
   public void savings() {
	   System.out.println("Saving Account");
   }
   public void current() {
	   System.out.println("Current Account");
   }
   
   public static void main(String[] args) {
	Kvb k = new Kvb();
	k.savings();
	k.current();
}
}
