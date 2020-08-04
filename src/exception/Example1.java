package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example1 {

	public static void m1() throws FileNotFoundException {
		m2();
	}
	public static void m2() throws FileNotFoundException{
		try {
			File file = new File("AA.txt");
			FileInputStream input = new FileInputStream(file);
			System.out.println(input);
		} catch (FileNotFoundException e) {
			System.out.println("Catch");
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		m1();

	}

}
