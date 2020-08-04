package exception;

public class Example3 {
	
	static void m1() {
		m2();
	}
	static void m2() throws ArithmeticException {
		int x = 5 /0;
	}
	public static void main(String[] args) {
		m1();

	}

}
