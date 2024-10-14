package tasks;

public class Swapping {
 public static void main(String[] args) {
	 int a = 10, b = 20;
	 System.out.println("Before Swapping:" + a + " " + b);
	 a = a + b;
	 b = a - b;
	 a = a - b;
	 System.out.println("Mid Swapping:" + a + " " + b);
	 int temp = a;
	 a = b;
	 b = temp;
	 System.out.println("Original:" + a + " " + b);
	 
}
 
}
