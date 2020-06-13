package Array;

public class ReverseHalfArrayAnaHalfSame {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,3,4,5};

		int len = arr.length;
		int halflen = len/2;
		
		
		for(int i=halflen;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
		for(int i =halflen;i<=len-1;i++) {
			System.out.print(arr[i]);
		}
	}

}
