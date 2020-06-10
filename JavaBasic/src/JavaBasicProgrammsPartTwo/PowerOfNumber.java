package JavaBasicProgrammsPartTwo;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {

		int number =2, p=5;
		
	
	long res = 1;
	
	for(int i=1;i<=p;i++) {
	res=res*number;
	}
	System.out.println(res);
	
	}

}
