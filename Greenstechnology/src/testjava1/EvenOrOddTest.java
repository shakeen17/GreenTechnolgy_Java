package testjava1;

import java.util.*;

public class EvenOrOddTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a No:");
	int n = sc.nextInt();

	if(n % 2 == 0) {
		System.out.println(n + " is EVEN");
	}
	else {
		System.out.println(n + " is ODD");
	}
	sc.close();
}
}
