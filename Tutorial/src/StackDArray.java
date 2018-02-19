import java.util.Arrays;

public class StackDArray<T> {
	
	Object[] ArrayStack;
	int size;
	int top;

	public StackDArray(int size) {
		
		this.size=size;
		ArrayStack = new Object[size];
		top =-1;	
	}
	
	public boolean isFull()
	{
		return (top == size-1);
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public void push(Object newItem){
		
		ensureCapacity(top+2);
		top=top+1;
		ArrayStack[top]=newItem;
		
	}
	
	public int getSize()
	{
		return ArrayStack.length;
	}
	
	public void ensureCapacity(int minCapacity)
	{
		int oldCapacity = getSize();
		int newCapacity=0;
		
		if(oldCapacity < minCapacity)
			newCapacity=oldCapacity*2;
		
		if(newCapacity < minCapacity)
			newCapacity=minCapacity;
			
		ArrayStack = Arrays.copyOf(ArrayStack, newCapacity);

	}
	
public T pop(){
		
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return null;
		}
		
		T item = (T)ArrayStack[top];
		top=top-1;
		return item;
	}


}
