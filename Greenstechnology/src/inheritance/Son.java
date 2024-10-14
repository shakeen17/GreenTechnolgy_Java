package inheritance;

public class Son extends Father {
 public void Education() {
	 System.out.println("B.E");
 }
 public static void main(String[] args) {
	Son s = new Son();
	s.Education();
	s.Business();
	s.Money();
	s.Property();
}
}
