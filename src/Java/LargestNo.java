package Java;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class LargestNo {
	
	public static void main(String[] args) {
		
		int []arr={1,2,3,6,5};
		
		
		Set set=new TreeSet();
		for(int a:arr)
		{
			set.add(a);
		}
		
		System.out.println(set);
		
		
	}

}
