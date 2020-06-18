package ArrayProgramTwo;

public class FindCountAndSquareOffArray {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,8,6,};
		
		int len =arr.length;
		int count =0;
		int res = 0;
		for(int i=0; i<len-1;i++) {
			if(arr[i] %2 !=0) {
				count = count+1;
				res = arr[i]*arr[i];
				System.out.println(res);
			
			}
			
				
		
	}
		System.out.println("total no of counts " + count);	
}}
