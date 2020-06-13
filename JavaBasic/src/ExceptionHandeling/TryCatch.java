package ExceptionHandeling;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			int a =10/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(10/2);
			}
		System.out.println("rest of the app...");
	}

}
