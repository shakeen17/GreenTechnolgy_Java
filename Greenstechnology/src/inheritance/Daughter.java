package inheritance;

public class Daughter extends Father {
	public void education() {
		System.out.println("medical");

	}
public static void main(String[] args) {
	Daughter d = new Daughter();
	d.education();
	d.Business();
}
}