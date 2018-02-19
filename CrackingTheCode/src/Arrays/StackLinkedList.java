package Arrays;

public class StackLinkedList {
	
	NodeStack curr;
	NodeStack prev;
	
	public StackLinkedList(){
		curr=null;
		prev=null;
	}
	
	public void push(int value){
		
		NodeStack newnode = new NodeStack(null, value);
		
		if(curr == null){
			curr = newnode;
			prev=curr;
		}
		else
		{
			newnode.next= curr;
			curr=newnode;

		}

	}
	public void pop()
	{
		if(curr == null){
			System.out.println("stack is empty");
			return;
		}
		System.out.println(curr.value);
		curr=curr.next;
		if(curr == null){
			prev=null;
		}
		
	}

	public static void main(String[] args) {
		StackLinkedList s = new StackLinkedList();
		s.push(1);
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();

	}

}
