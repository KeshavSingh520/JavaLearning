package Java;

import java.util.Scanner;

public class ArmstrongNo {
	
	public static void main(String[] args) {
		System.out.println("Enter the no: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0,num=n,temp=0,num1=n;
		count=String.valueOf(n).length();
		
//		System.out.println("No of digits are: "+count);
		int sum=0;
		for(int i =1;i<=count;i++)
		{
			temp=num%10;
			sum=sum+(int)(Math.pow(temp, count));
			num=num/10;
		}
		if(num1==sum)
		System.out.println("No is Armstrong."+" "+"Num is "+num1+" "+"Sum is "+sum);
		
		
		
	}

}
