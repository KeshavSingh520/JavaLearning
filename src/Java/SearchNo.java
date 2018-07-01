package Java;


import java.util.ArrayList;
import java.util.List;

public class SearchNo {
	
	public static void main(String[] args) {
		
		int input[]={1,2,3,4,5,6};
		int sum=0,median=0;
//		Set set=new HashSet();
		List set=new ArrayList();
		for(int a:input)
		{
//			sum=sum+input[i];
			
			set.add(a);
		}
		int num=3;
		System.out.println(set.contains(num));
		
		
		
		
		
		/*if(input.length%2!=0)
		median=(input.length+1)/2;
		else if(input.length%2==0)
		median=(input.length/2)+((input.length/2)+1);*/
		
		
		
	}

}
