package tasks;
import java.util.Scanner;
public class FibonacciSeries {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		
//	  int sum = 0;
	  int[] arr = new int[11];
	  int n = 10;
	   arr[0] = 0;
	   arr[1] = 1;
	   for(int i = 2; i <= n; i++) {
		   arr[i] = arr[i - 1] + arr[i - 2];
	   }
//	   for(int a : arr) {
//		   System.out.print(a + " ");
//	   }
	   System.out.println();
//	   System.out.println( n + " = " + arr[n]);
	   System.out.println("Enter the number:");
	   int num = sc.nextInt();
	   num = num + 1;
	   System.out.println(arr[num]);
	   sc.close();
}
  
}
