//Output : "Hi Techno Hello Techno Hi Maulik GM Techno Hello"
package assignment;

import java.util.Arrays;

public class ReplaceLastSecondStringInArray {

	// Iterating from last
	void replaceString(String input) {
		int count = 0;
		String[] temp = input.split(" ");
		for (int index = temp.length - 1; index > 0; index--) {
			if (temp[index].equals("Techno")) {
				count++;
				if (count == 2) {
					temp[index] = "Maulik";
					break;
				}
			}
		}
		System.out.println("Input : " + Arrays.toString(input.split(" ")));
		System.out.println("Output: " + Arrays.toString(temp));
	}

	//Iterating from first 
	void replaceString1(String input) {
		int count = 0;
		String tempInput = input.replace("Techno", "*");
		int totalCount = (input.length() - tempInput.length()) / 5; // 48 - 28 = 20/5 = 4
		String[] temp = input.split(" ");
		for (int index = 0; index < temp.length; index++) {
			if (temp[index].equals("Techno")) {
				count++;
				if (count == (totalCount - 1)) {
					temp[index] = "Maulik";
					break;
				}
			}
		}
		System.out.println("Output :"+Arrays.toString(temp));

	}

	public static void main(String[] args) {
		ReplaceLastSecondStringInArray replaceLastSecondStringInArray = new ReplaceLastSecondStringInArray();
		String input = "Hi Techno Hello Techno Hi Techno GM Techno Hello";
		// replaceLastSecondStringInArray.replaceString(input);
		replaceLastSecondStringInArray.replaceString1(input);

	}

}
