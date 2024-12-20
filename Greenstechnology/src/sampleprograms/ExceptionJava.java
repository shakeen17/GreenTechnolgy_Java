package sampleprograms;

import java.util.*;
public class ExceptionJava {
	public static void catchAll(int n) {
		try {
			System.out.println(10 / n);
		}catch(Exception e) {
			System.out.println("Should not divide by zero..");
		}
	}
	public static void nullPointer(String str) {
		try {
			System.out.println(str.length());
		}catch (NullPointerException e) {
            System.out.println("String is null, cannot get its length.");
        }
	}
	 public static void inputMismatched() {
	        Scanner scanner = new Scanner(System.in);
	        try {
	            System.out.println("Enter an integer: ");
	            int n = scanner.nextInt(); 
//	        	int n = str;
	            System.out.println(n);
	        } catch (InputMismatchException e) {
	            System.out.println("Input Mismatch Exception....");
	        }
	    }
	 public static void indexOut(int n) {
		 int[] arr = {1,2,3};
		 try {
			 System.out.println(arr[n]);
		 }catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("out of bound.....");
		 }
	 }
public static void main(String[] args) {
	
catchAll(0);
nullPointer(null);
inputMismatched();
indexOut(5);
System.out.println("Finished.....");
}
}
