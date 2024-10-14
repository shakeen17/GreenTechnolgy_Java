package pattern;

public class PraticePattern {
public static void main(String[] args) {
	System.out.println("Square Pattern...");
	for(int i = 1; i <= 5; i++) {
		for(int j = 1; j <= 5; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println("Increasing Triangle Pattern...");
	for(int i = 1; i <= 5; i++) {
		for(int j = 1; j <= i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println("Decreasing Triangle Pattern...");
	for(int i = 1; i <= 5; i++) {
		for(int j = i; j <= 5; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println("Right Sided Increasing Triangle...");
	for(int i = 1; i <= 5; i++) {
		for(int j = i; j <= 5; j++) {
			System.out.print("  ");
		}
		for(int k = 1; k <= i; k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println("Right Sided Decreasing Triangle...");
	for(int i = 1; i <= 5; i++) {
		for(int j = 1; j <= i; j++) {
			System.out.print("  ");
		}
		for(int k = i; k <= 5; k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("Hill Pattern...");
}
}
