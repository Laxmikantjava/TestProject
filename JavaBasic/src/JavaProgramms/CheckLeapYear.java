package JavaProgramms;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		int year = 2100;
		
		if (year % 400==0){
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
