
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedListU li = new LinkedListU<Integer>();
		
		li.add(11);
		li.add(12);
		li.add(13);
		li.add(14);
		li.display();
		System.out.println("Before Delete");
		li.delete();
		System.out.println("After Delete");
		li.display();
		
 
	}

}
