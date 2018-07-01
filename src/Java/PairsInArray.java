package Java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairsInArray {

	
	public static void main(String[] args) {
		
		int arr[]={4,5,7,11,9,13,8,12};
		System.out.println("Enter the no: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for(int a:arr)
		set.add(a);
		System.out.println(set.toString());
		int temp=0;
		int length=arr.length;
		
		for(int i=0;i<length;i++)
		{
			temp=num-arr[i];
			if(set.add(temp)==false)
				System.out.println("pair is ("+temp+","+arr[i]+")");
		}
	}
}
