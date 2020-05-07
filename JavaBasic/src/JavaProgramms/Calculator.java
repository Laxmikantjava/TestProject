package JavaProgramms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		String yn;
		do {
		
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter First no");
	    int no1 = s.nextInt();
	    
	   System.out.println("Enter Second nO");
	   int no2 = s.nextInt();
	   
	   System.out.println("Select Symbol(+,-,*/)");
	   String sym = s.next();
	   int res;
	   switch(sym){
	   case"+":res = no1+no2;
	   System.out.println("addition: "+res);
		  break;
	   case"-":res = no1-no2;
	   System.out.println("substrsction: "+res);
	   break;
	   case"*":res = no1*no2;
	   System.out.println("multiplication: "+res);
	   break;
	   case"/":res = no1/no2;
	   System.out.println("devide: "+res);
	   break;
	 default:  System.out.println("invalid");
	   break;
	   }
	   System.out.println("Do you want to continiue(press y for Yes and n for No)");
	   yn = s.next();
	   
	}while(yn.equals("y"))
		;
	}
}
