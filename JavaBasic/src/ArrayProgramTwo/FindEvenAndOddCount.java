package ArrayProgramTwo;

public class FindEvenAndOddCount {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,7,9};
		
		int len =arr.length;
		
		int count =0;
		int count1 =0;
		for(int i=0;i<=len-1;i++) {
		if(arr[i] % 2==0) {
			count = count+1;
			
		}
		
		else {
			count1++;
			
		}
		
		}
		System.out.println("count of even no is "+ count);
		System.out.println("count of odd no is "+ count1);
	}

}
