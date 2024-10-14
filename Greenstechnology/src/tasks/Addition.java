package tasks;
import java.util.Scanner;
public class Addition {
public static void main(String[] args) {
	System.out.print("Enter a Number:");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i = 1; i <= n; i++) {
		System.out.print(i + " ");
	}
	
	int sum = 0;
	
	while(n > 0) {
		sum += n;
		n--;
	}
	
	System.out.println(" ");
	System.out.println(sum);
	sc.close();
}
}
