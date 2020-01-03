package JavabasicConcept;

public class Variablecalling1 {

	int a=5;
	int b=9;

	public static void main(String[] args) {
		//1- declare inside a method & inside a block & inside a constructor 
		//2- scope of local Variable within the method
		//3- method invocked memory allocated when method is completed memory released
		//4- Local variable are stored  in stack memory
		
		int a=10; // Local variables
		int b=20;
		System.out.println(a+b);
		
		//to access instance variable we need to create object
		Variablecalling1 j = new Variablecalling1();
			
	    System.out.println(j.a);
		System.out.println(j.b);
		
	}
	//jvm responsible to execute only the statement present in method 
	
//	User defined method - we must call user defined method in main method 
	void m() {//memory allocated when  method starts
		
		int a= 3;//Local variables
		int b=4;
		//Logics here
		System.out.println(a+b);
		}//Memory released when method is completed
	
	void m1() {
		//instance area
		System.out.println(a);
	System.out.println(b);
	}
	
}

