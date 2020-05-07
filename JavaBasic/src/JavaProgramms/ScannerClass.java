package JavaProgramms;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// The Scanner class is used to get user input, and it is found in the java.util package.
		System.out.println("Enter name");
		String name= s.next();
		System.out.println("gender");
		char gender = s.next().charAt(0);
		System.out.println("Eneter age");
		int age = s.nextInt();
		System.out.println("Enter phoneno");
	    long phoneno = s.nextLong();
	    System.out.println("Name:"+name);
	    System.out.println("Gender:"+gender);
	    System.out.println("Age:"+age);
	    System.out.println("Phoneno:"+phoneno);
	    
	    
	    
	}
}
