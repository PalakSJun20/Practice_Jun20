
public class StringComprare {

	static void m1() {
		String s1 = "Globant";
		String s2 = "globant";
		
		String s3 = new String("Globant");
		//String s4 = s3.toLowerCase();
		s3 = s3.toLowerCase();
		String s5 = new String("globant");
		

		if (s5 == s3) {
			System.out.println(1);
		}
		if (s5.equals(s3)) {
			System.out.println(2);
		}

	}
	
	public static void main(String[] args) {
		m1();	
	}
}
