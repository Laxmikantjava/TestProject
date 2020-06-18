package ArrayProgramTwo;

public class FindCountOfEvenNumber {

	public static void main(String[] args) {
		int arr1[] = {2,3,2,4,5,6};
		int len= arr1.length;
		int count=0;
		
		for(int i=0;i<len;i++)
		{
			if(arr1[i]% 2==0)
			{
				count = count+1;
			}
		}
		System.out.println(count);
		
		

		
	}

}
