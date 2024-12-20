package sampleprograms;

import java.util.*;

public class LearnFuctions {

	public static int addNumbers(int a, int b) {
	    int sum = 0;
	    try {
	        sum = a + b;
	    } catch (Exception e) {
	        System.out.println("An error occurred");
	    }
	    return sum;
	}
    
    static void addNos(int a, int b) {
      try {  System.out.println("add: " + (a + b));}
      catch (Exception e) {
	        System.out.println("An error occurred");
	    }
    }

   
    static void subNos(int a, int b) {
        System.out.println("sub: " + (a - b));
    }

   
    static void mulNos(int a, int b) {
        System.out.println("mul: " + (a * b));
    }


    static void divNos(int a, int b) {
        try {
            System.out.println("div: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error for Division");
        }
    }

    
    static void modNos(int a, int b) {
        try {
            System.out.println("mod: " + (a % b));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error for Modulus");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;    
        try {
            System.out.println("Enter two integers: ");
            a = sc.nextInt(); 
            b = sc.nextInt(); 
            System.out.println(a + " " + b);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception....");
            
        }
        
       System.out.println( addNumbers(a,b));

        addNos(a, b);
        subNos(a, b);
        mulNos(a, b);
        divNos(a, b);
        modNos(a, b);
    }
}
