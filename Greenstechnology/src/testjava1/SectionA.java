package testjava1;

public class SectionA {
	public SectionA() {
		System.out.println("Sam");
	}
	public SectionA(String str) {
		System.out.println(str);
	}
public static void main(String[] args) {
	SectionA sec = new SectionA();
	SectionA sec1 = new SectionA("Sanjay");
}
}