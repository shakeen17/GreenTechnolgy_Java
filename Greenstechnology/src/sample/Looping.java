package sample;

public class Looping {
public static void main(String[] args) {
	int i = 1;
	while(i <= 10) {
		System.out.print(i + " ");
		i++;
	}
	System.out.println("\n");
	for(int a = 11; a <= 20; a++) {
		System.out.print(a + " ");
	}
	System.out.println("\n");
	int j = 21;
	do{
		System.out.print(j + " ");
		j++;
	}while(j <= 20); 
}
}
