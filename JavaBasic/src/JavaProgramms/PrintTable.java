package JavaProgramms;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		//int no =;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no to print table");
		  int no = s.nextInt();
		for(int i=1;i<=10;i++) {
			
			System.out.println(no+"*"+i+"="+no*i);
	}
	}
}
