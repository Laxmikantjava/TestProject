package JavaBasicProgrammsPartTwo;

import java.util.Random;

public class PrintRandomNumber {

	
	
	public static void main(String[] args) {
	
		Random rand = new Random();
	 	
	for(int loop=1;loop<=4;loop++) {
		
		System.out.println(rand.nextInt(100));
	}

	}

}
