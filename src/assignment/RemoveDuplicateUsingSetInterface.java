/*Remove duplicate names from given String Array, print names in given format with its length. Input Order has to be maintained.
String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"}

Output :  Aashtha -> 7
          Kartikey -> 8
          Piyush -> 6
	      Raj -> 3
	      Suparna -> 7
	      Barkha -> 6
Total unique elements are :- 6*/

package assignment;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateUsingSetInterface {
	
	void removeDuplicateString(String[] input) {
	Set<String> setArray = new LinkedHashSet<>(Arrays.asList(input));
	int count = 0;
	System.out.println(setArray);
	
	Iterator<String> it = setArray.iterator();
	
	while (it.hasNext()) {
		String string = it.next();
		System.out.print(string);
		System.out.println("-> "+string.length());
		count++;
	}
	System.out.println("Total Unique Elements are "+count);
	}

	public static void main(String[] args) {
	RemoveDuplicateUsingSetInterface duplicateUsingSetInterface = new RemoveDuplicateUsingSetInterface();
	String input[] = {"Aashtha","Kartikey","Piyush","Raj","Suparna","Piyush","Aashtha", "Barkha"};
	duplicateUsingSetInterface.removeDuplicateString(input);
	}

}
