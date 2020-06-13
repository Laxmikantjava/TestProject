package Array;

public class SecondHalfReverse {

	public static void main(String[] args) {
		
		int arr[] = {2,4,3,5,4,6,7,9};
		
		int len = arr.length;
		int halflen = len/2;
		
 for(int i=0;i<=halflen-1;i++) {
	 System.out.print(arr[i]);
 }
	
	for(int i=len-1; i >= halflen;i--) {
	System.out.print(arr[i]);
	}

}
}