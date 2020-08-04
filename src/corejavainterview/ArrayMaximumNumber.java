package corejavainterview;

public class ArrayMaximumNumber {

	void findMaximumNumber(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Maximum Number is " + max);
	}

	public static void main(String[] args) {
		ArrayMaximumNumber arrayMaximumNumber = new ArrayMaximumNumber();
		int[] array = { 22, 2, 1, 99, 6, 3, 1, 56, 64, 10 };
		arrayMaximumNumber.findMaximumNumber(array);

	}

}
