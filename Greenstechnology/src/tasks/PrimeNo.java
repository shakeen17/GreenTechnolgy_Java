package tasks;

public class PrimeNo {
	public static boolean isPrime(int n) {
		int count = 0;
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count > 0) {
			return false;
		}
		return true;
	}
public static void main(String[] args) {
	int count = 0;
	for(int i = 2; i < 100; i++) {
		if(isPrime(i)) {
			System.out.println(i);
			count++;
		}
	}
	System.out.println("Count:" + count);
}
}
