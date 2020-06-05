package stringConcepts;

public class StringMethods {

	public static void main(String[] args) {
	
		String name=  "abc";
		
		int i = name.length(); // 1. its count no of character including space
	                           //2 boolean b = name.isEmpty(); if (b) {} it returns boolean value
		                       //if(name.trim().length()==0)//3. name.trim  it will remove spaces from front and back of the string	 
		 
	 if(name.trim().length() ==0) {
		 
		 System.out.println("name is empty");
	 }	
	 else {
		 System.out.println("valid name");
	 }
	}

}
