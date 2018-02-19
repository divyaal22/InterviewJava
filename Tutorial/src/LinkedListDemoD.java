
public class LinkedListDemoD {

	public static void main(String[] args) {
		LinkedListD li = new LinkedListD<Integer>();
		
		li.add(11);
		li.add(12);
		li.add(13);
		li.add(14);
		li.add(15);
		li.add(16);
		li.display();
		System.out.println("Before Delete");
		li.delete();
		li.delete();
		System.out.println("After Delete");
		li.display();
		
 
	}

}
