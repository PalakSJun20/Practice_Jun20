package inheritance;

public class B extends A  {
	public void m1() {
		System.out.println("Protect Y m1 ");
	}
	public static void main(String[] args) {
		A a = new B();
	}

}
