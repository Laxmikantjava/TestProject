package JavaBasicProgrammsPartTwo;

import java.util.Scanner;

public class LCMOfTwoNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no");
		
		int a = sc.nextInt();
		System.out.println("Enter the second no");
		int b = sc.nextInt();
		
		int max,lcm =0;
		
		if (a>b){
	max =a;
		}
		else {
			max =b;
		}
	for(int i =0;i<max;i++) {
		if(max%a==0 && max%b==0)
		{
			lcm=max;
			break;
		}
		max++;
	}
	System.out.println("The lcm of two no: "+ lcm);
	
	}
}
