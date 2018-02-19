// A Java program to count all possible paths 
// from top left to bottom right
 
public class Exceptions
{
     
    public static double dividebyzero(int a, int b)
    {
    	return (a/b);
    }
  
    public static void main(String args[])
    {
       double res=0;
       
       try
       {
    	   res = dividebyzero(4,0);
       }
       catch(ArithmeticException E)
       {
    	  System.out.println(E.getMessage()); 
       }
       
       System.out.println(res);
      
    
 
     
    System.out.println("Hi, I want to execute");
    
    }
    
    

    
   
    
    
    
   
    
}