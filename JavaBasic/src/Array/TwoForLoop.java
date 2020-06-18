package Array;

public class TwoForLoop {

	public static void main(String[] args) {
		
		int arr1[] = {2,4,5,6};

	int arr2[] = {3,8,10,1};
	
	int[] arr3 = new int[arr1.length];
	int[] arr4 = new int[arr2.length];
	for(int i=0; i<arr1.length;i++) {
		
		arr1[i] = arr1[i]+arr2[i];
		
		System.out.println(arr1[i]);
	}
	
	//for(int j=0; j<arr2.length; j++) {
           // arr[ a] =arr3[i]+arr4[j];
		//System.out.println(arr2[j]);
	}
	
	}


