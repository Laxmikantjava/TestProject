package Array;

public class AddEvenOfTwoArray {

	public static void main(String[] args) {
	

		
				int arr1[] = {12,2,8,4};
				int arr2[] = {5,6,7,8};
			
			
				
			int arr3[] = new int[arr1.length];
			
			//int arr4[] = new int[arr2.length];
			
			for(int i=0; i<arr1.length;i++)
			{
				 arr3[i]= arr1[i]+arr2[i];
				
				if(arr3[i] % 2 ==0) {
					System.out.print(arr3[i]+",");
				
			}}
				
			}
			 
}
			
		


