package exception;

public class SuperClass {
	public int doIt(String str , Integer... data) throws Exception {
		String signature = "String Signatue SuperClass";
		System.out.println(str +" "+signature);
		return 1;
	}
}
