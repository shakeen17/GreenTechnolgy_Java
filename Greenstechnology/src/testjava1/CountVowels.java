package testjava1;
import java.util.*;

public class CountVowels {
	public static boolean isVowels(char ch) {
		ch = Character.toLowerCase(ch);
		char[] vowels = {'a','e','i','o','u'};
		for(int i = 0; i < vowels.length; i++) {
			if(vowels[i] == ch) {
				return true;
			}
		}
		return false;
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int vowelCount = 0;
	int consoent = 0;
	System.out.print("Enter the String:");
	String str = sc.next();
	char[] ch = str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
        if (Character.isLetter(ch[i])) { 
            if (isVowels(ch[i])) {
                vowelCount++;
            } else {
                consoent++;
            }
        }
    }
	System.out.println("The String Contains " + vowelCount + " vowels and " + consoent + " consoents");
	sc.close();
	}
}
