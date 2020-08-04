package loopExample;

public class LoopEx2 {

	
	int sum = 0;
	void processedData(){
		int index = 0;
		while(sum != 55){
			index++;
			sum = sum + index;
			
		}
		System.out.println("Total numbers required for sum 55 is " +index);
		System.out.println("sum " +sum);
	}
	
	void processedData1(){
	  int sum = 0;
	  int number = 0;
	  int sum1 = 0;
	  while(sum != 55){
		  number++;
		  sum = sum+number;
		  if(number %3 ==0) {
			  System.out.print(number + ",");
			  sum1 = sum1 + number;
		  }
	}
	  System.out.println("and answer is " + sum1 );
	}
	
	void evenNumberSum(){
		int sum = 0;
		int number = 0;
		int count = 0;
		while (sum != 20){
			number++;
			if(number % 2 == 0 ){
				sum = sum +number;
				count++;
			}
			  
		}
		System.out.println("Total number required for sum 20 is " + count);
		System.out.println("Sum is " + sum);
	}
	public static void main(String[] args) {
		LoopEx2 loopEx2 = new LoopEx2();
		loopEx2.processedData();
        loopEx2.processedData1();
        loopEx2.evenNumberSum();
	}

}
