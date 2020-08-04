package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T1P {

	public static void main(String[] args) {
		T1P t1p = new T1P();	
		t1p.m1("");
		
	}
	
	void m1(String filepath) {
		File file = new File(filepath);
		try {
			FileInputStream fileInputStream = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
