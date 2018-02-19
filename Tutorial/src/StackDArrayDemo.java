
public class StackDArrayDemo {

	public static void main(String[] args) {
		StackDArray<Integer> sd = new StackDArray<Integer>(2);
		sd.push(1);
		sd.push(2);
		sd.push(3);
		sd.push(4);
		sd.push(5);
		
		System.out.println("The size of the array" + sd.getSize());
		
		System.out.println(sd.pop());
		System.out.println(sd.pop());
		System.out.println(sd.pop());
		System.out.println(sd.pop());
		System.out.println(sd.pop());
		
		

	}

}
