package Array;

public class SumOfEvenNo {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,4,3};
		int arr2[] = {3,6,8,15};
		
		for(int i=0; i<arr1.length;i++) {
		 if(arr1[i] %2 == 0 && arr2[i]%2==0) {
			 System.out.println(arr1[i]+arr2[i]);
					 }
		 else {
			 System.out.println("both arry have not even");
		 }
		
		 
		}
		
		
	}

}
