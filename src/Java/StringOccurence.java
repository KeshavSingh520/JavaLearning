package Java;

import java.util.HashSet;
import java.util.Set;

public class StringOccurence {
	
	public static void main(String[] args) {
		
		String s="Keshav singh";
		
		System.out.println(s.length());
		
		System.out.println("Character Occurrence is : "+Integer.toString(s.length()-s.replace("s", "").length()));
		
		char a[]=s.toCharArray();
		char temp[]=new char[5];
		int i=0;
		Set set = new HashSet();
		for(char itr:a)
		{
		  if(set.add(itr)==false)
			  
		temp[i]=itr; 
		}
		System.out.println("Duplicates are : "+temp);
	}

}
