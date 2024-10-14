package tasks;

public class Palindrome {
    public static void main(String[] args) {
        int rangeStart = 100;
        int rangeEnd = 1000;
        int count = 0;
        for(int i = rangeStart; i < rangeEnd; i++) {
            int n = i, rev = 0, rem = 0;
            int original = n; 
            while(n > 0) {
                rem = n % 10;
                rev = rev * 10 + rem;
                n /= 10;
            }
            if(original == rev) {  
                System.out.print(original + " ");
                count++;
            }
           
        }
        System.out.println("\n" + "The count is:" + count);
    }
}
