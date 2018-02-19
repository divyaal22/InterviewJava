
public class DynamicArrayDemo {

	public static void main(String[] args) {
		DynamicArray<Integer> da = new DynamicArray<Integer>();
		
		da.push(11);
		System.out.println("size" + da.getSize());
		
		da.push(12);
		System.out.println("size" + da.getSize());
		da.push(13);
		System.out.println("size" + da.getSize());
		da.push(14);
		System.out.println("size" + da.getSize());
		da.push(15);
		System.out.println("size" + da.getSize());

	}

}
