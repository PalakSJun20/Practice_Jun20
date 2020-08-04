package inheritance;

public class C {
	protected void m1() {
		System.out.println("C m1");
	}
	public static void main(String[] args) {
		B b = new B();
		A a = b;
		a.m1();

	}

}
