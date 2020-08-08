/*Left Triangle Star pattern
 *       *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
*/
package patternprinting;

public class LeftTriangleStarPattern {

	static void printStars(int n) {
		for (int i = 1; i <= n ; i++) {
			/*for (int k = 1; k <= n-i; k++) {
				System.out.print(" ");
			}*/
			for (int k = n-i; k > 0 ; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n = 10;
		printStars(n);

	}

}
