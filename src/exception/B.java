package exception;

public class B {
		 static void m2()  {
			System.out.println("2");
			try {
				C.m3();	
				System.out.println("3");
			} catch (Throwable e) {
				System.out.println("B catch");
			}
			
		}
}
