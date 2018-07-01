package Java;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="abcba";
		StringBuffer sf= new StringBuffer(s);
		System.out.println(sf.reverse());
		
		
		//2nd Method

		int i=0;
		char[] inputStringarr=s.toCharArray();
		char[] resultStringarr=new char[inputStringarr.length];
		for(int j=resultStringarr.length-1;j>=0;j--)
		{
			resultStringarr[j]=inputStringarr[i];
			i++;
			
		}
		System.out.println(String.valueOf(resultStringarr));
	
		
	}

}
