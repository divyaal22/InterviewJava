
public class LinkedListU<T> {
	
	Node head;

	public LinkedListU() {
		head=null;
	}
	
	
	public void add(Object Value)
	{
		Node newNode = new Node(Value,null);
		
		if(head == null)
			head=newNode;
		else
		{
			newNode.next=head;
			head=newNode;
		}	
		
	}
	
	
	public void delete()
	{
		if(head != null)
		{
			head = head.next;
		}
	}
	
	
	public void display()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.println((T)n.value);
			n=n.next;
			
		}
	}


}
