package Arrays;

public class Solution2 {

	public String reverseCString(String sentence)
	{
		
		char[] data = sentence.toCharArray();
		char temp;
		int i=1;
		int j = data.length-1;

		
		while(i<=j){
			temp = data[j];
			data[j]=data[i];
			data[i]=temp;
			System.out.println(data[i]);
			i++;
			j--;
		
			
		}
		String s = new String(data);
		
		return s;
		
	}
	
	
	public static void main(String[] args) {
		
		Solution2 s2 = new Solution2();
		System.out.println(s2.reverseCString("abcd!"));
		

	}

}
