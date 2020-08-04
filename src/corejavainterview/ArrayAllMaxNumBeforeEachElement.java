package corejavainterview;

import java.util.Arrays;

public class ArrayAllMaxNumBeforeEachElement {
	
	void findArrayAllMaxNumBeforeEachElement(int[] array) {
		for (int index = 0; index < array.length; index++) {
			int count =0 ; 
			int[] tempArray = new int[5];
			for (int innerindex = 0; innerindex < index; innerindex++) {
				if (array[index] < array[innerindex]) {
					//System.out.println(index +" "+ array[innerindex]);
					count++;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		ArrayAllMaxNumBeforeEachElement arrayAllMaxNumBeforeEachElement = new ArrayAllMaxNumBeforeEachElement();
		int[] array = {10,99,56,48,11,101};
		arrayAllMaxNumBeforeEachElement.findArrayAllMaxNumBeforeEachElement(array);
	}

}
