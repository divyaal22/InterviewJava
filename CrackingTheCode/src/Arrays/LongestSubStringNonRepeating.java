package Arrays;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

public class LongestSubStringNonRepeating {
	
	int  ASCII_CHAR=256;
	public int getLongestSubStringNonRepeating(String sample){
		
		Stack<Character> s = new Stack<Character>();
	    HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
		
				for(int i=0;i<sample.length();i++)
				{

					arr[sample.charAt(i)] = -1;
					s.push(sample.charAt(i));
					
					System.out.println(sample.charAt(i) + "    " + arr[sample.charAt(i)]);
				}
				Iterator<Character> iter = s.iterator();


		
		return 0;
	}

	public static void main(String[] args) {
		
		LongestSubStringNonRepeating l= new LongestSubStringNonRepeating();
		
		String sample = "aabccdefghh";
		System.out.println(l.getLongestSubStringNonRepeating(sample));
		

	}

}
