package JavaBasicProgrammsPartTwo;

import java.util.Scanner;

//Java Program to check whether input character is vowel or consonant

public class CheckCharacter {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input");
		
		char ch =s.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch== 'i' || ch== 'o' || ch=='u' ) {
			
			System.out.println(ch +" is vowel");
		}
		else {
			System.out.println(ch +" is constant");
		}
		
		
	}
}
