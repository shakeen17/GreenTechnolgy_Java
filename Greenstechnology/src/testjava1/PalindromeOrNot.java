package testjava1;

import java.util.*;

public class PalindromeOrNot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter String:");
	String str = sc.nextLine();
	StringBuilder sb = new StringBuilder(str);
	String rev = sb.reverse().toString();
	if(str.equals(rev)) {
		System.out.println(str + " is Palindrome");
	}
	else {
		System.out.println(str + " is not a Palindrome");
	}
	sc.close();
}
}
