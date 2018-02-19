
import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
       nonRepeating("aabbdeerr"); // should return 'c'
        //nonRepeating("abab"); // should return null
        //nonRepeating("aabbbc"); // should return 'c'
        //nonRepeating("aabbdbc"); // should return 'd'
    }

    // Implement your solution below.
    public static Character nonRepeating(String s) {
    	
    	
    	HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
    	
    	char[] ch = s.toCharArray();
    	
    
    	
    	for(int i=0;i< s.toCharArray().length;i++)
    	{
    		System.out.println( s.toCharArray()[i]);
    	}

    	for(int i=0;i<ch.length;i++)
    	{
    	
    		if(hash.containsKey(ch[i]))
    		{
    			hash.put(ch[i], hash.get(ch[i])+1);
    		}
    		else
    		{
    			
    			hash.put(ch[i], 1);
    		}
    	}	
    	
    	for(Character key : hash.keySet())
    	{
    		System.out.println(key);
    		
    		if(hash.get(key)==1)
    			return key;
    	
    	
    	}
    	
    	return null;
    
    }
}
