package arraylistPractice;

import java.util.ArrayList;
import java.util.Collections;

public class OperationsOnArrayList {

	void addingOperation() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Red");
		arrayList.add("Yellow");
		arrayList.add("Orange");
		arrayList.add("Green");
		//System.out.println(arrayList);
		
		// Calling Method for Iterating Elements
		iteratingElement(arrayList);
		insertingElementAtFirstAndLastPostion(arrayList);
		retrieveAnElementAtSpecifiedIndex(arrayList);
		removeFromSpecifiedIndex(arrayList);
		searchAnElement(arrayList);
		sortingList(arrayList);
		copyOneListToAnother();
		shuffleTheElements(arrayList);
		reverseElements();
		joinTwoArrayList(arrayList);
		compareTwoArrayList(arrayList);
		increaseSizeOfArrayList(arrayList);
	}

	void iteratingElement(ArrayList<String> arrayListInput) {
		// Iterating Element
		for (String string : arrayListInput) {
			System.out.println(string);
		}
	}

	void insertingElementAtFirstAndLastPostion(ArrayList<String> arrayListInput) {
		// Inserting Element at first Position
		arrayListInput.add(0, "Blue");
		// Inserting Element at last position
		arrayListInput.add(5, "Black");
		System.out.println(arrayListInput);
	}
	
	void retrieveAnElementAtSpecifiedIndex(ArrayList<String> arrayListInput) {
		String temp = arrayListInput.get(4);
		System.out.println("4th Position Element : "+temp);
	}
	
	private void removeFromSpecifiedIndex(ArrayList<String> arrayList) {
		String removedElement = arrayList.remove(3);
		System.out.println("Remove 3rd Index Element : "+removedElement);
	}
	
	private void searchAnElement(ArrayList<String> arrayList) {
		if(arrayList.contains("Red"))
			System.out.println("Found the element at index "+arrayList.indexOf("Red"));
		else
			System.out.println("Element not found");
	}
	
	private void sortingList(ArrayList<String> arrayList) {
		Collections.sort(arrayList);
		System.out.println("--Sorted List--");
		iteratingElement(arrayList);
	}
	
	private void copyOneListToAnother() {
		ArrayList<String> copyList = new ArrayList<String>();
		ArrayList<String> arrayList = new ArrayList<>(copyList);
		
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		
		copyList.add("Red");
		copyList.add("Yellow");
		copyList.add("Orange");
		copyList.add("Green");
		//copyList = arrayList;
		Collections.copy(copyList, arrayList);
		System.out.println("Copy List "+copyList);
		
	}
	

	private void shuffleTheElements(ArrayList<String> arrayList) {
		Collections.shuffle(arrayList);
		System.out.println("Shuffle List -> " + arrayList);
	}
	
	private void reverseElements() {
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		Collections.reverse(integerList);
		System.out.print("Reverse List -> " + integerList);	
		System.out.println();
	}
	private void joinTwoArrayList(ArrayList<String> arrayList) {
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("Magneta");
		arrayList2.add("Purple");
		arrayList2.add("White");
		
		ArrayList<String> joinList = new ArrayList<>();
		joinList.addAll(arrayList);
		joinList.addAll(arrayList2);
		System.out.println("Join Two Array List ->"+joinList);
		
	}
	private void compareTwoArrayList(ArrayList<String> arrayList) {
		
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("Magneta");
		arrayList2.add("Purple");
		arrayList2.add("White");
		arrayList2.add("Black");
		
		ArrayList<String> resultList = new ArrayList<>();
		
		for (String string : arrayList) {
			resultList.add(arrayList2.contains(string) ? "Yes":"No");
		}
		System.out.println("Compare 2 Array List -> "+resultList);
	}
	
	private void increaseSizeOfArrayList(ArrayList<String> arrayList) {
		
		arrayList.ensureCapacity(5);
		arrayList.add("Magenta");
		arrayList.add("Purple");
		System.out.println(arrayList);
		arrayList.trimToSize(); // If we did trimtoSize and add one more element it wont show in output
		arrayList.add("White");
	}
	public static void main(String[] args) {
		new OperationsOnArrayList().addingOperation();
	
	}
}
