package tasks;
import java.util.*;
public class ReverseNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number:"); 
	int n = sc.nextInt();
	int d = n;
	int rev = 0;
	while(n != 0) {
		int rem = n % 10; 
		rev = rev * 10 + rem; 
		n /= 10;
	}
	System.out.println("Revesed no:" + rev);
	if(rev == d) {
		System.out.println(d + " is a Palindrome......");
	}
	else {
		System.out.println(d + " is not a Palindrome......");
	}
	sc.close();
}
}
