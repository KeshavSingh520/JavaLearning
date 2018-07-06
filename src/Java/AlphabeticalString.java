package Java;

import java.util.Arrays;

public class AlphabeticalString {
	
	public static void main(String[] args) {
		 String result = "keshav";
		 
		char arr[]= result.toCharArray();
		
		Arrays.sort(arr);
		String s=new String(arr);
		System.out.println(s);
	     

	}
}
