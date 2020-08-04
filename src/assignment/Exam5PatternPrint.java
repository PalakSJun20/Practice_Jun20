package assignment;

public class Exam5PatternPrint {

	public static void main(String[] args) {
		String input = "Globant";
		
		for (int index = 0; index < input.length(); index++) {
			System.out.println(input.substring(0 , input.length()-index));
		}
	}
}
