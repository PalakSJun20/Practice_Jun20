package assignment;

public class ReturnType {
	int add(int x , int y){
		return x+y;
	}
	int sub(int x , int y){
		return x-y;
	}
	int multi(int x , int y){
		return x*y;
	}
	int div(int x , int y){
		return x/y;
	}
	public static void main(String[] args) {
		ReturnType returnType = new ReturnType();
		int totalSum = returnType.add(10, 20)+returnType.sub(20, 10)+returnType.multi(5, 2)+returnType.div(20, 10);
		System.out.println(returnType.add(10, 20));
		System.out.println(returnType.sub(20, 10));
		System.out.println(returnType.multi(5, 2));
		System.out.println(returnType.div(20, 10));
		System.out.println("Addition of all 4 Methods "+
		(returnType.add(10, 20)+returnType.sub(20, 10)+returnType.multi(5, 2)+returnType.div(20, 10)));
		System.out.println(totalSum);
	}

}
