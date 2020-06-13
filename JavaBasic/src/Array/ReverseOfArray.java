package Array;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		int arr[] = {2,4,3,5,4,6,7,9};
		
              int len = arr.length;
              int [] arr1= new int[len];
              
              for(int i=len-1;i>=0;i--) {
            	  arr1[i]=arr[i];
              }
              for(int i=len-1;i>0;i--) {
              System.out.print(arr1[i]+" , ");
	}}

}
