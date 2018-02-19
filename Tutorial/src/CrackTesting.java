
public class CrackTesting {
	
	public String stringBuilderTest(String words[])
	{
		StringBuilder s = new StringBuilder();
		for(int i=0;i<words.length;i++)
			s.append(words[i]);
		
		return s.toString();
		
	}
	
	
	
	public boolean uniqueCharcters(String word){
		
		boolean[] char_set = new boolean[256];
		
		for(int i=0;i<word.length();i++)
		{
			int val = word.charAt(i);
			System.out.println(val + "   " + char_set[val] + "      " +word.charAt(i));
			if(char_set[val]) return false;
				char_set[val]=true;
		}
		
		return true;
		
	}
	

	public static void main(String[] args) {
		CrackTesting ct = new CrackTesting();
		String[] words = {"a","b","c"};
		//System.out.println(ct.stringBuilderTest(words));

		System.out.println(ct.uniqueCharcters("aabcd"));
	}

}
