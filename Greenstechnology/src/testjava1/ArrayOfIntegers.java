package testjava1;

import java.util.*;

public class ArrayOfIntegers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	System.out.print("Enter the Size of Array:");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.print("Enter the Element of Array:");
	for(int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	for(int i: arr) {
		sum += i;
	}
	System.out.println("The Total Sum is: " + sum);
	sc.close();
}
}
