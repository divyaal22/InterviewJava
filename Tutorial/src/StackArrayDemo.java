
public class StackArrayDemo {

	public static void main(String[] args) {
		StackArray<Integer> sa = new StackArray<Integer>(5);
		sa.push(1);
		sa.push(2);
		sa.push(3);
		sa.push(4);
		sa.push(5);
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		
		

	}

}
