package Java;

public class RevStringWithPreserveSpace {

	public static void main(String[] args) {

		String inputString = "I am Strong";
		char[] inputarr = inputString.toCharArray();

		char[] resultarr = new char[inputString.length()];

		for (int i = 0; i < inputString.length(); i++) {
			if (inputarr[i] == ' ') {
				resultarr[i] = ' ';
			}
		}

		int j = resultarr.length - 1;

		for (int i = 0; i < inputarr.length; i++) 
		{
			if (inputarr[i] != ' ') {

				if (resultarr[j] == ' ')

				{
					j--;

				}
				resultarr[j] = inputarr[i];
				j--;
			}

		}

		System.out.println(String.valueOf(resultarr));

	}

}
