// Java program for Naive Pattern Searching
public class NaiveSearch {
 
    public static void search(String txt, String pat)
    {
   
    	int count=0;
    	for(int i=0;i<txt.length()-pat.length();i++){
    		for(int j=0;j<pat.length();j++){
    			if(txt.charAt(i+j) != pat.charAt(j))
    			{
        				break;
    				
    			}		
    		
    			if(j == pat.length()-1)
    				count++;
    			
    		}
    		
    	}
    	System.out.println(count);
    	
    }
 
    public static void main(String[] args)
    {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        search(txt, pat);
    }
}
