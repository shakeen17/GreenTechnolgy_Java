package tasks;

public class OddOrEven {
  public static void main(String[] args) {
	  int[] odd = new int[25];
	  int[] even = new int[25];
	  int j = 0;
	  int k = 0;
	  int oddCount = 0;
	  int evenCount = 0;
	  int oddSum = 0;
	  int evenSum = 0;
	for(int i = 1; i <= 50; i++) {
		if(i % 2 == 0) {
			even[j++] = i;
		}
		else {
			odd[k++] = i;
		}
	}
	System.out.println("Display Nos.....");
	
	System.out.println("Odd Nos.....");
	for(int a : odd) {
		System.out.print(a + " ");
		oddCount ++;
	}
	System.out.print("\t" + "=");
	for(int a : odd) {
		oddSum += a;
	}
	System.out.print("\t" + oddSum + " Odd Count:" + oddCount);
	System.out.println("\n");
	System.out.println("Even Nos.....");
	for(int a: even) {
		System.out.print(a + " ");
		evenCount ++;
	}
	System.out.print("\t" + "=");
	for(int a : even) {
		evenSum += a;
	}
	System.out.print("\t" + evenSum + " Even Count:" + evenCount);
	
}
}
