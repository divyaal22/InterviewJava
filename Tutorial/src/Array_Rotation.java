
public class Array_Rotation {
	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 1, 2, 3};

        if(array1.length != array2a.length)
        	return;
 

       int key= array1[0];
       int pos=-1, i=0, j=0;
       
       while(i < array2a.length)
       {
    	   if(key==array2a[i])
    	   {
    		   pos=i;
    		   break;
    	   }
    	   i++;
       }
       
       if(pos==-1)
       {
    	   System.out.println("The arrays are not roations");
    	   return;
       }
      
    	   for(int k=0;k<array1.length;k++)
    	   {
    		   j = (k+pos)%array1.length;
    		   if(array1[k]!=array2a[j])
    		   {
    			   System.out.println("The arrays are not roations");
    			   return;
    		   }  
    		   
    	   }
    	      
    	   System.out.println("the arays are rotations");
		
	}

}
