package JavabasicConcept;

public class variableCalling2 {


	static int a =3000;
	static int b = 4000;
	
	
	public static void main(String[] args) {
		
		//Static Variable
		//1- declared inside the class but outside of the method with static modifier
		//2- scope is with in the class
		//3-.class loading memory allocates --> .class unloading memory destroyed
		//4- static variable stored in non heap memory
		
		
		System.out.println( variableCalling2.a);
		System.out.println( variableCalling2.b);  // 1- call by using class name (this method is prefered in java)
		
		System.out.println(a);//2- call directly
		
		 variableCalling2 t = new  variableCalling2(); // 3- call by object creation
		t.m1();
		
	}
   
	void m1() {
		
		}
}
// variable Vs Defaults value
//1. Default value are assigned for instance variable and static variable and local variable are not provide default value

