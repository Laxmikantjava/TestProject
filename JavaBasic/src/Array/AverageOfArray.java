package Array;

public class AverageOfArray {

	public static void main(String[] args) {
		
		
		 int arr[] = {2,4,3,5,7,8,36,19};
		 
		 int sum =0;
		 for(int i=0;i<arr.length;i++)
		 {
			sum= sum+arr[i];
		
		 }
		 
		 System.out.println("Sum of arrray is=> "+sum);

		 int avg = sum/arr.length;
		 
		 System.out.println("average of no is => "+avg);
	}

}
