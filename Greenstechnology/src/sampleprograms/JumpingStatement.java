package sampleprograms;

public class JumpingStatement {
public static void main(String[] args) {
	for(int i = 0; i <=10; i++) {
		if(i==4) {
			continue;
		}
		System.out.print(i + " ");
	}
	System.out.println();
	for(int i = 11; i <=20; i++) {
		if(i==18) {
			break;
		}
		System.out.print(i + " ");
	}
}
}
