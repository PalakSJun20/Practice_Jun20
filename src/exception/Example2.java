package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example2 {
		static void m1() throws IOException {
			m2();
		}
		
		static void m2() throws FileNotFoundException {
			m3();
		}
		static void m3() throws FileNotFoundException {
			try {
				m4();
			} catch (IOException e) {
				System.out.println("check");
			}
		}
		
		static void m4() throws FileNotFoundException {
			File file = new File("ac.txt");
			FileInputStream  fileInputStream = new FileInputStream(file);
		}
		public static void main(String[] args) throws IOException {
			m1();
		}
}
