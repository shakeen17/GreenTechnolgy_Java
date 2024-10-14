package testjava1;

import java.util.*;

public class MultiplicationTable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a No:");
	int n = sc.nextInt();
	System.out.print("Enter a Limit:");
	int limit = sc.nextInt();
	for(int i = 1; i <= limit; i++) {
		int mul = n * i;
		System.out.println(n + " * " + i + " = " + mul);
	}
	sc.close();
}
}
