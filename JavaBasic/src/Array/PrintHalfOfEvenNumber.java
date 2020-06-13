package Array;

public class PrintHalfOfEvenNumber {

	public static void main(String[] args) {

		int arr[] = {2,46,8,5,8,5,3,4};

		int len=arr.length;
		int halflen = len/2;

		for(int i=halflen; i<len;i++) {
			if(arr[i]%2==0) {

				System.out.println(arr[i]);
			}
		}

	}}
