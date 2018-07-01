package Java;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveArraylistDuplicates {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("ABC");
		list.add("ABC");
		list.add("DEF");
		list.add("FGH");
		list.add("GHI");
		list.add("IJK");
		
		System.out.println("List with duplicates "+list);
		
//		Set listwithoutduplicates=new HashSet(list);
		Set listwithoutduplicates=new LinkedHashSet(list);
		System.out.println("List without duplicates "+listwithoutduplicates);
		
		
	}

}
