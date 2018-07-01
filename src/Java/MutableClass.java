
package Java;

public class MutableClass {

	public static void main(String[] args) {
		
		String s="ABC";
		s.concat("DEF");
		System.out.println(s);
		
		
		StringBuffer sb=new StringBuffer("ABC");
		sb.append("DEF");
		System.out.println(sb);
		
	}
	
	
}
