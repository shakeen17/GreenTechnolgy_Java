package pattern;

import java.util.*;

public class RightAngleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();

        // Pattern 1: Right-Angle Triangle
        System.out.println("Right-Angle Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println(); 

        // Pattern 2: Inverted Right-Angle Triangle
        System.out.println("Inverted Right-Angle Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 3: Right-Aligned Triangle
        System.out.println("Right-Aligned Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); 
        // Pattern 4: Centered Pyramid
        System.out.println("Centered Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     // Pattern 5: Reversed Centered Pyramid
        System.out.println(" Reversed Centered Pyramid:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
     // Pattern 5: Diamond Pyramid
        System.out.println("Diamond");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
