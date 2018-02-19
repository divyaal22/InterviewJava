package Arrays;

public class MaxOccuringString {
	int ASCII_CHAR=256;
	public char maxString(String str){

		str = str.toLowerCase();
		int[] count = new int[ASCII_CHAR];
		int max=0;
		char result=0;
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i) + "    "+count[str.charAt(i)]);
			count[str.charAt(i)]++;
		}
	   
		for(int i=0;i<str.length();i++)
		{
			
			if(max<count[str.charAt(i)]){
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
	
		return result;
	}

	public static void main(String[] args) {
		MaxOccuringString ms = new MaxOccuringString();
		System.out.println(ms.maxString("She sells sea shells on the sea shore"));
		

	}

}
