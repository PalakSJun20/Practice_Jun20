package exception;

public class A {
	void m1() {
		System.out.println("1");
		B.m2();
		System.out.println("A catch");
	}

	public static void main(String[] args) {
		A a1 = new A();	
		a1.m1();
		System.out.println("End");
		
	}
}
