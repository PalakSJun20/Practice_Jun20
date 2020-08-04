package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example5 {

	public static void main(String[] args) {
		m1();
	}
	
	private static void m1() throws ArithmeticException {
		try {
			int a = Integer.parseInt("wd22");
			
		} finally {
		//	m2();  // CE
		}
	}
	
	private static void m2() throws FileNotFoundException {
		File file = new File("");
		FileInputStream fileInputStream = new FileInputStream(file);
		
	}

}
