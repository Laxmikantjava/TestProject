package Array;

public class MergingOfTwoArray {

	public static void main(String[] args) {

		
			int arr1[] = {1,2,3,4};
			int arr2[] = {5,6,7};
		     
		int len1  = arr1.length;
		int len2 = arr2.length;
		
		int arr[] = new int[len1+len2];
		
		int pos =0;
		for(int i=0;i<arr1.length;i++)
		{
			arr[pos]=arr1[i];
			pos++;
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			arr[pos]=arr2[i];
			pos++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +",");
			
		}
		}
       //take two array with same size and add both them corresponding  as well add even no. of both
    //
       
	}


