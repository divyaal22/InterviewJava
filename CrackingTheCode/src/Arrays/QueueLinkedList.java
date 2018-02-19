package Arrays;

public class QueueLinkedList {
	
	NodeLL first;
	NodeLL rear;
	
	public QueueLinkedList(){
		first=null;
		rear=null;
	}
	
	public void enQueue(int value){
		
		NodeLL newnode = new NodeLL(null,value);
		
		if(first == null){
			first=newnode;
			rear=first;
		}
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
		
	}
	
	public void deQueue()
	{
		if(first==null)
		{
			System.out.println("queue is empty");
			return;
		}
		System.out.println(first.value);
		first=first.next;
		
		if(first==null){
			rear=null;
		}
		
	}

	public static void main(String[] args) {
		QueueLinkedList q = new QueueLinkedList();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();

	}

}
