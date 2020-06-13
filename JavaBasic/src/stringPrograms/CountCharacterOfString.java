package stringPrograms;

/**
 * @author Laxmikant
 *
 
public class CountCharacterOfString {

	public static void main(String[] args) {

		String a = "i like sdet";
		//int count=0;

		//int no = a.length();

		for(int i =0;i<=a.length()-1;i++) {
			if(i%2 != 0) {

				System.out.println("char at "+i+"is "+ a.charAt(i));
			}
		}
	}

}
*/

class CountCharacterOfString{
	public static void main(String[] args) {
		
		String b = "Selenium automation";
		
		int count = 0;
		
		for(int i=0;i<=b.length()-1;i++) {
			
		
				count++;
				
			
		}
		System.out.println("frequency of n is" +count);
				
				
				;
	}
}



