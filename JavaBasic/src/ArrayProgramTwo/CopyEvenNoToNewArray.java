package ArrayProgramTwo;

public class CopyEvenNoToNewArray {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,8,6,};
		
		int len =arr.length;
int count = 0;
		for(int i =0;i<=len-1;i++) {
			if(arr[i] % 2 ==0) {
				count++;
				}
		}
		
		
		int arr1[]= new int[count];
		int p=0;
		for(int i=0;i<arr.length;i++)
		{
			 
			if(arr[i]%2==0)
			{
				arr1[p]=arr[i];
				p++;
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}// take input from user 2.size>10  3. select even and odd nos from half part nd put it into separate part

}
