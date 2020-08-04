/* Ascii value of G - 71 , 
 l - 108 , o - 111 , b - 098 , a - 097 , n - 110 , t - 116 = 711 
 O/P = 711 
*/
package corejavainterview;

public class ToCharArray {

	public static void main(String[] args) {
		String s ="Globant";
		char c[] = s.toCharArray();
		int sum =0;
		
		for(char ch : c)
		{
			sum = sum + ch;
		}
		System.out.println(sum);
	}

}
