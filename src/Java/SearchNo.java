package Java;

public class SearchNo {
	
	public static void main(String[] args) {
		
		int input[]={1,2,3,4,5,6};
		int sum=0,median=0;
		for(int i=0;i<=input.length;i++)
		{
			sum=sum+input[i];
			
		}
		if(input.length%2!=0)
		median=(input.length+1)/2;
		else if(input.length%2==0)
		median=(input.length/2)+((input.length/2)+1);
		
		
		
	}

}
