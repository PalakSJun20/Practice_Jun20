package exception;

public class Example4 {
	
	static int m1() {
		
		try {
			int i = 5/5;
			return i;
		} catch (Exception e) {
			System.out.println("Catch");
		}finally {
			System.out.println("FInally");
		}
		return 0;
	} 

	public static void main(String[] args) {
		System.out.println(m1());

	}

}
