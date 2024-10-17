package recursions;

public class sumOfDigits {
	static int digits(int n) {
		if(n == 0) {
			return 0;
		}
//		
		return (n % 10) + digits(n / 10);
	}
	static int prod(int n) {
		if(n % 10 == n) {
			return n;
		}
		return (n % 10) * prod(n / 10);
	}
	
	static int reverseHelper(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + n % 10;
        return reverseHelper(n / 10, rev);
    }
	 static int rev(int n) {
	        return reverseHelper(n, 0); 
	    }
	 
	 static boolean palindrome(int n) {
		 return n == rev(n);
	 }
public static void main(String[] args) {
	System.out.println(digits(1342));
	System.out.println(digits(0));
	
	System.out.println(prod(67));
	System.out.println(prod(1342));
	
	System.out.println(rev(1342)); 
	
	System.out.println(palindrome(123321));
}
}
