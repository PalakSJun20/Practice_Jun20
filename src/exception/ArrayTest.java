package exception;

public class ArrayTest {

	public static void main(String[] args) {
		try {
			String arr[] = new String[10];
			arr = null;
			arr[0] = "one";
			System.out.println(arr);
		} catch (Exception e) {
			System.out.println("Exception");
		}
		/*catch (NullPointerException ne) {
			System.out.println("Null pointer");
		}*/
		
	}

}
