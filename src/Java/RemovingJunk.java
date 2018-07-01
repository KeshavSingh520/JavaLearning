package Java;

public class RemovingJunk {
	
	public static void main(String[] args) {
		
		String s= "###@$keshav123/////***";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
	}

}
