package JavabasicConcept;

public class Variables {

	
	//Class Level Variable Or Static Variable.
		static int i = 10;
		
		//Static Variables are declared with the Keyword Static in a Class
		//But Outside a Method, Constructor or a Block.
		//We can access Static Variables or Methods using its Class Name Itself.
		//Static variables will be created at the time of class loading under destroyed at the class unloading 
		//hence scope of static variable is exactly same as scope of .class file
		
		
		//Non-Static Variables:
		//Non-Static Variables are declared without Keyword Static in a Class
		//But Outside a Method, Constructor or a Block.
		//To Access Non-Static Variables Or Methods we must create an Object.
		//Non-Static variables will be created at the time of object creation under destroyed at the time of object distraction
		//hence scope of Non-static variable is exactly same as scope of object.
		
		//Static and Non-Static Variables or Methods can be accessed within defined Class
		//Or Outside the Class.
		
		//Non-Static Variable Or Instance Variable.
		int j = 20;
		
		public static void main(String[] args) 
		{
			//Local Variables are always declared within Main Method
			//Whose scope is limited within Main Method.
			//local variable will be stored inside in stack memory
			int k = 30;
			
			//To Print Static Variable.
			System.out.println("The Static Variable Value of I is == " +i);
			
			//Creating an Object to access Non-Static Variable.
			Variables variable = new Variables();
			System.out.println("The Non-Static Variable Value of J is == " +variable.j);
					
			//To Print Local Variable.
			System.out.println("The Local Variable Value of K is == " +k);
		
		
	
		

	}

}
