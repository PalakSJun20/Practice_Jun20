package blankfinalvariable;

public class BlankFinalVariable {
	
	final int VARIABLE1; // can access from NS block  
	final int VARIABLE2; // can access from either
	final static int VARIABLE3; // can access only from static block

	{
		VARIABLE1 = 10;
		System.out.println(VARIABLE1);
	}
	
	public BlankFinalVariable() {
		VARIABLE2 = 20 ;
		System.out.println(VARIABLE2);
	}
	
	static {
		VARIABLE3 = 30;
	}
	
	public static void main(String[] args) {
		new BlankFinalVariable();
	}
}
