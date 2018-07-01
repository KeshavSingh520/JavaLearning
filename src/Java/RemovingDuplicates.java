package Java;

public class RemovingDuplicates {

	
	public static void main(String[] args) {
		
		
		int input[]={1,2,2,3,4,5,6};
		
		int result[]=new int[input.length];
		
		int previousNo=input[0];//1
		result[0]=previousNo;//1
		for(int i=1;i<input.length;i++)
		{
			if(previousNo!=input[i])//2!=3
			{
				result[i]=input[i];//2
			}
			previousNo=input[i];//2
			
		}
		System.out.print("Array without Duplicates ");
		for(int a:result)
		System.out.print(a+" ");
		
		
		
		
	}
	
	
	
}
