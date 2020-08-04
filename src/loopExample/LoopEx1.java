package loopExample;

public class LoopEx1 {

	void display(String name, int count){
		
		for(int index =1 ; index<=count;index++) {
			System.out.println(name +":"+ index);
		}
	}
	
	void displayUsingWhile(String name, int count){
		int index = 1;
		while(index <= count){
			System.out.println(name +":"+ index);
		}
	}
	public static void main(String[] args) {
		LoopEx1 loopEx1 = new LoopEx1();
		loopEx1.display("Palak", 5);
		loopEx1.display("Palak", 10);
		
	}

}
