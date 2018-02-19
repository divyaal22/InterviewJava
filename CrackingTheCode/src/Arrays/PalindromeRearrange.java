package Arrays;

import java.util.HashMap;

public class PalindromeRearrange {
	
	public String rearragePalindrome(String sample){
		
		char[] words = sample.toCharArray();
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		int oddval = 0;
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
			if(hmap.containsKey(words[i])){
				hmap.put(words[i],hmap.get(words[i])+1);
			}
			else
			{
				hmap.put(words[i],1);
			}
		}
		
	 for(int i : hmap.values()){
		 System.out.println(i);
		  if(i%2 != 0) oddval++;
	 }
		
	 if(oddval>1)
		return "cannot create a palindrome";         
		
	 
	 
	 
	
	 return null;
	}

	public static void main(String[] args) {
		
		PalindromeRearrange pr = new PalindromeRearrange();
		
		pr.rearragePalindrome("mmaad");

	}

}
