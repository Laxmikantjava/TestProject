package JavaProgramms;

public class ReverseString {

	public static void main(String[] args) {
		
		//reverse a string 
		//difference in string and string buffer    string buffer is muttable
		//do we have reverse function in string   No because string is immutable object
		
		String name = "deepak";
		int length = name.length();
		String rev ="";
		for(int i=length-1;i>=0;i--) {
			
			rev= rev+name.charAt(i); //return the char value at specified index
		}
		System.out.println("Reverse name is: "+rev);
	}

}
