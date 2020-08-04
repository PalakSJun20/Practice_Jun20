package exception;

public class Test extends SuperClass {
	public int doIt(String str , Integer... data) {
		String signature ="String signature Test class";
		System.out.println("Overidden : "+str + " " + signature);
		return 0;
	}
	public static void main(String[] args) {
		SuperClass superClass = new Test();
		try {
			superClass.doIt("hello", 3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
