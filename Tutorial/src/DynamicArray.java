import java.util.Arrays;

public class DynamicArray<T> {

	int size;
	Object[] obj;
	
	public DynamicArray()
	{
		size=0;
		obj = new Object[1];
	}
	
	public int getSize()
	{
		return obj.length;
	}
	
	
	public T get(int index)
	{
		return (T) obj[index];		
	}
	
	public void push(Object element)
	{
		ensureCapacity(size + 1);
		obj[size++]=element;
	}
	
	
	public void ensureCapacity(int minCapacity)
	{
		int oldCapacity = getSize();
		int newCapacity=0;
		
		if(oldCapacity < minCapacity)
			newCapacity=oldCapacity*2;
		
		if(newCapacity < minCapacity)
			newCapacity=minCapacity;
			
		obj = Arrays.copyOf(obj, newCapacity);

	}
	
	
	
	
}
