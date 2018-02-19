package com.ds.hash;

public class HashTableArrayDemo {

	public static void main(String[] args) {
		HashTableArray<Integer> ht = new HashTableArray<Integer>(10);
		ht.putValue(11,11);
		ht.putValue(12, 12);
		ht.putValue(13, 13);
		ht.putValue(23, 23);
		ht.putValue(53, 53);
		
		int value = ht.getValue(23);
		System.out.println(value);

	}

}
