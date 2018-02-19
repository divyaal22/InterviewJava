import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
	
		String str1 = "fried";
		String str2 = "deirfd";
		
		
		System.out.println(anagramCheck(str1,str2));
		
	}
	
	
	public static boolean anagramCheck(String str1, String str2){
		
		
		char[] ch1 =  str1.toCharArray();
		char[] ch2 =  str2.toCharArray();
		
		int i =0;
		
		
		if(ch1.length ==ch2.length)
		{
			while(i < ch1.length)
			{
	
						
				if(ch1[i] != ch2[ch2.length-i-1])
				{
					return false;
				}		
				
				i++;
			}
		}
		else
			return false;

	 return true;
		
	}

}
