package JavaProgramms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number here");
		
	int	 no =s.nextInt();  //1234
		
	// Using algorithm
	
	int rev =0;
		
		while (no !=0); 
		
		
		{
		
		rev = rev*10+no%10;  //   rem= no%10     >4    3
		no = no /10;      // 123
		                      
		
		} 
	
	
		System.out.println("Reverse number is:"+ rev);
	}

	
	}

