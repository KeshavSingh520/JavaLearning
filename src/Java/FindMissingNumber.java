package Java;

public class FindMissingNumber {
	
	
	public static void main(String[] args) {
		
		int arr[]={1,2,3,3,4,5,6};
		int count=arr.length;
		int actualsum=0,sum=0;
		for(int i=0;i<arr.length;i++)
		{
			actualsum=actualsum+arr[i];
			
		}
		sum=(count)*(count+1)/2;
		
		/*for(int i=1;i<=8;i++)
		{
			sum=sum+i;
			
		}*/
		
		int missNo=sum-actualsum;
		System.out.println(missNo);
		
	}

}
