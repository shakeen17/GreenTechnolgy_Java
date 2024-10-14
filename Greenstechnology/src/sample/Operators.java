package sample;

public class Operators {
 public static void main(String[] args) {
	int a = 5;
	int b = 9;

	System.out.println(a+b + " " + (a - b) + " " + a/b + " " + a*b + " " + a % b);
	int c = 2;
	c--;
	System.out.print(c + " ");
	int d = (c--) + 1;
	System.out.print(c + " ");
	System.out.print(d + " \n");
	
	int sum = 10;
	sum += 5;
	System.out.println(sum);
	
}
}
