

public class SolutionLL {
	
	public static void reverseString(LinkedListNode x)
	{
		LinkedListNode temp = null,c= null;
		
	     while(x!=null){
	    	 temp = x;
	    	 c=x.next;
	    	 x=c;
	     }
		
	    System.out.println(temp.value);
		
	}
  
    public static void main(String[] args) {
        LinkedListNode a = new LinkedListNode(5);
        LinkedListNode b = new LinkedListNode(1);
        LinkedListNode c = new LinkedListNode(9);
        
        a.next = b;
        b.next = c;

        reverseString(a);
   
   


       

    }
}