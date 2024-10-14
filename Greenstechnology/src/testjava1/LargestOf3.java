package testjava1;
import java.util.*;

public class LargestOf3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Three Nos:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	if(a > b && a > c) {
		System.out.println(a + " = a is Largerest");
	}
	else if(b > c) {
		System.out.println(b + " = b is Largerest");
	}
	else {
		System.out.println(c + " = c is Largerest");
	}
	
	sc.close();
}
}
