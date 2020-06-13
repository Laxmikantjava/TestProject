package JavaProgramms;

public class FibonacciSeries {
//a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
	//The simplest is the series 1, 1, 2, 3, 5, 8, etc.
	public static void main(String[] args) {
		
  int a=0,b=1;
    System.out.println(a+""+b);
    
  int c;
  
  for(int i=1;i<=10;i++) {
	  c=a+b;
	  System.out.println(""+c);
	  a=b;
	  b=c;
  }
  
	}

}
