package JavaBasicProgrammsPartTwo;

public class AddComplexNumber {

	public static void main(String[] args) {
		
		String a ="2+3i"; 
		String b="4+4i";
		
		char c= a.charAt(0);
		int l=Integer.parseInt(String.valueOf(c));
		char d= a.charAt(2);
		int m= Integer.parseInt(String.valueOf(d));
		
		char e=b.charAt(0);
		int n=Integer.parseInt(String.valueOf(e));
		char f= b.charAt(2);
		int o=Integer.parseInt(String.valueOf(f));
		int sum1= l+n;
		int sum2= m+o;
		System.out.println(sum1+"+"+sum2+"i");
	}
}
