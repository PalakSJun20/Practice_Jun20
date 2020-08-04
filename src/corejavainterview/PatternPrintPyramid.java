/*
    * 
   * * 
  * * * 
 * * * * 
* * * * *
 */
package corejavainterview;

public class PatternPrintPyramid {

	void printingPatternMethod1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrintPyramid patternPrintPyramid = new PatternPrintPyramid();
		patternPrintPyramid.printingPatternMethod1();
	}
}
