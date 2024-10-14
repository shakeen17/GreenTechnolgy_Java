package tasks;

public class ArmstrongNo {
	public static int Armstrong(int n) {
		int rem = 0, sum = 0;
		while(n > 0) {
			rem = n % 10;
			sum += (rem * rem * rem);
			n /= 10;
		}
		return sum;
	}
public static void main(String[] args) {
	int count = 0;
	for(int i = 0; i < 1000; i++) {
		int result = Armstrong(i);
		if(i == result) {
			System.out.println(i);
			count++;
		}
		
	}
	System.out.println("Count:" + count);
}
}
