package sampleprograms;

import java.util.*;
public class Exception {
public static void main(String[] args) {
//	int a = 10 / 0;
//	String name = null;
//	System.out.println(a + name.length());
	//INPUT MISMATCH ERROR
//	Scanner sc = new Scanner(System.in);
//	int b = sc.nextInt();
//	System.out.print(b);
//	sc.close();
//	int[] arr = {1,2,3,4,5};
//	System.out.println(arr[7]);
	List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
	System.out.println(list.get(7));
	
}
}
