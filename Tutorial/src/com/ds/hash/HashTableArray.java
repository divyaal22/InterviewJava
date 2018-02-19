package com.ds.hash;

public class HashTableArray<T> {
	
	Entry[] arrayHashMap;
	int size;

	public HashTableArray(int size) {
		this.size=size;
		arrayHashMap = new Entry[size];
		for(int i=0;i<size;i++){
			arrayHashMap[i]=new Entry();
		}	   
	}
	
	int getHash(int Key){
		return Key%size;
		
	}
	
	public void putValue(int key, Object value)
	{
		int HashIndex = getHash(key);
		Entry ArrayValue = arrayHashMap[HashIndex];
		Entry newValue = new Entry(key,value);
		newValue.next=ArrayValue.next;
		ArrayValue.next=newValue;
		
	}
	
	public T getValue(int key){
		
		T value = null;
		int HashIndex = getHash(key);
		Entry ArrayValue = arrayHashMap[HashIndex];
		while(ArrayValue!= null){
			if(ArrayValue.getKey()==key){
				value = (T) ArrayValue.getValue();
				break;
			}
			ArrayValue=ArrayValue.next;
		}
		
		
		return value;
		
	}

}
