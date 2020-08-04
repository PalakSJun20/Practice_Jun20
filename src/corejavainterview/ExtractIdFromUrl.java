/*Extract ItemId from below input
	String input = https://www.facebook.com/technocredits/itemId=12345/
	String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
	String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
	String input = https://www.facebook.com/technocredits/empid=123/
	Output : 
	item id is 12345 
	        OR
	no item id present */
package corejavainterview;


public class ExtractIdFromUrl {
	void findItemIdFromUrl(String input) {
	
			if (input.contains("itemId=")) {
				String str = input.split("itemId=")[1];
				System.out.println(str);
				String output ="";
				for (int index = 0; index < str.length(); index++) {
					if (Character.isDigit(str.charAt(index))) {
						output += str.charAt(index); 
					}else
						break;
				}
				System.out.println("Item id : " +output);
			}
			else
				System.out.println("Item id is not present ");
		
	}
	
	void findItemIdFromUrl1(String input) {
		try {
			String str = input.split("itemId=")[1].replace("/", "").split("&")[0];
			System.out.println("Item id is present : "+str);
		} catch (Exception e) {
			System.out.println("Item id is not present");
		}
	}
	
	public static void main(String[] args) {
		ExtractIdFromUrl extractIdFromUrl = new ExtractIdFromUrl();
		String input1 = "https://www.facebook.com/technocredits/itemId=12345/";
		System.out.println(input1);
		extractIdFromUrl.findItemIdFromUrl(input1);
		
		String input2 ="https://www.facebook.com/technocredits/itemId=12345&empid=123/";
		System.out.println(input2);
		extractIdFromUrl.findItemIdFromUrl(input2);
		
		extractIdFromUrl.findItemIdFromUrl1(input2);

	}

}
