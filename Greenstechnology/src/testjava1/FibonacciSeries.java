package testjava1;


public class FibonacciSeries {
public static void main(String[] args) {
	int[] arr = new int[11];
	arr[0] = 0;
	arr[1] = 1;
	for(int i = 2; i < 11; i++) {
		arr[i] = arr[i - 1] + arr[i - 2];
	}
	System.out.println("Fibonacci Series From 1 to 10:");
	for(int i = 1; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	
}
}
