package stringConcepts;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String s1 ="Sdet";
		String s2 = "java";
		
		System.out.println(s1+s2);  //Sdetjava
		System.out.println(s1+10);  //Sdet10
		System.out.println(s1+10+20);  //Sdet1020
		System.out.println(10+s1+20);  //10Sdet20
		System.out.println(10+20+s1);  //30Sdet
		
		System.out.println(s1+20/10);  // Sdet200
		
		

		System.out.println(s1+20*10);    // Sdet2
	
		
		
		System.out.println(s1.concat(s2));   //Sdetjava
		System.out.println(String.join(";", s1, s2, s1));  //Sdet;java;Sdet
		
		
		
	}

}
