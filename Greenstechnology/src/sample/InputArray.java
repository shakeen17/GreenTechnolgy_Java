package sample;

import java.util.*;
public class InputArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of element: ");
    int n = sc.nextInt();
    int sum = 0;
    int[] arr = new int[n];
    System.out.println();
    for(int i = 0; i < n; i++) {
    	arr[i] = sc.nextInt();
    	sum += arr[i];
    }
//    int sum = 0;
    System.out.println("Enter the Elements:");
    for(int i : arr) {
    	System.out.print(i + " ");
//    	sum += i;
    }
    System.out.println();
    System.out.println("Total = " + sum);
    sc.close();
    }
}
