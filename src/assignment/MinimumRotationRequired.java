package assignment;

public class MinimumRotationRequired {

	public static void main(String[] args) {
		String input1 = "adbcdef";
		String input2 = "defadbc";
		int count = 0;
		while (!input1.equals(input2)) {
			input1 = input1.substring(input1.length()-1) + input1.substring(0,input1.length()-1);
			count++;
			System.out.println(input1);
		}
		System.out.println(count);
	}

}
