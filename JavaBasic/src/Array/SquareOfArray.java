package Array;

public class SquareOfArray {

	public static void main(String[] args) {
		
		int arr[] = {2,4,3,5,6,8,1,9};
		
		int len = arr.length;
		
		int res = 0;
		
		for(int i=0;i<len;i++) {
			
			if(arr[i] %2 !=0) {
			
			res = arr[i]*arr[i];
			System.out.println(res);
			}
		}
		
	}

}
