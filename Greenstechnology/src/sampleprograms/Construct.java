package sampleprograms;

public class Construct {
	public Construct() {
		System.out.println("hi construct");
	}
	public Construct(int a) {
		System.out.println("this is an pram const:"+a);
	}
	public void Construct(int a) {
		System.out.println("this is an method pram const:"+a);
	}
public static void main(String[] args) {
	Construct con=new Construct();
	con.Construct(10);
	Construct con1=new Construct(20);
}
}
