package tasks;
import java.util.*;
public class ReverseString {
public static void main(String[] args) {
	String str = "Welcome to class of Programming";
	String[] strArr = str.split("\\s");
	System.out.println(Arrays.toString(strArr));
	String rev = "";
	for(int i = 0; i < strArr.length; i++) {
		String str1 = " ";
//		String str1 = strArr[i];
		for(int j = strArr[i].length() - 1; j >= 0;j--) {
			str1 = str1 + strArr[i].charAt(j);
		}
		rev = rev + str1;
		
	}
	System.out.println(rev);
	String[] reverse = rev.split(" ");
	
	StringBuilder originalStr = new StringBuilder();
	
	for(String word: reverse) {
	  Stack<Character> stack = new Stack<>();
	  
	  for(char ch: word.toCharArray()) {
		  stack.push(ch);
	  }
	  
	  while(!stack.isEmpty()) {
		  originalStr.append(stack.pop());
	  }
	  originalStr.append(" ");
	}
	System.out.println(originalStr.toString());
}
}
