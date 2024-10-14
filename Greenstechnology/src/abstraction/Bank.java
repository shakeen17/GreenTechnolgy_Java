package abstraction;

public abstract class Bank {
 public void salary() {
	 System.out.println("Salary");
 }
 abstract void savings();
 abstract void current();  //Abstract method does not have body 
}
