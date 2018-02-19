import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    static int camelcase(String s) {
    	
    	int numletters = 0;
    	
    	if(s.length()==0)
    		return 0;
    	else
    	{
    		 if(Character.isLowerCase(s.charAt(0)))
    			 numletters = 1;
    	}
    	
    	
    	for(int i=1;i<s.length();i++)
    	{
    		 if(Character.isUpperCase(s.charAt(i)))
    			 numletters += 1;         		
    	}

		return numletters;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}