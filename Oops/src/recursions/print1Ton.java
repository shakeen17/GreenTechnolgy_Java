package recursions;

public class print1Ton {
	public static void fun(int n) {
		if(n == 0) {
			return;
		}
//		System.out.print(n + " ");
		fun(n - 1); // recursion order print
		System.out.print(n + " ");
//		fun(n - 1); // recursion reverse
	}
public static void main(String[] args) {
	fun(5);
}
}