package Array;

public class SumOfHalfArray {

	public static void main(String[] args) {
		 int arr[] = {2,46,8,5,8,5,3,4};
		 
		 int len=arr.length;
		 int halflen = len/2;
		 
		 int res=0;
		 
		 for(int i=halflen; i<len;i++) {
			 res = res+arr[i];
			 
			
		 }
		 System.out.println(res);
	}

}
