package Arrays;

import java.util.ArrayList;

public class PairSumSortedArray {
	
	public int getPairSumforKey(int[] arr, int n, int sum)
	{
		
		ArrayList<Integer> alarr =  new ArrayList<Integer>();
		for(int x=0;x<n;x++)
			alarr.add(arr[x]);
		
		int key=0;
		int i=0;
		
		for(i=0;i<n;i++)
		{
			if(sum>arr[i])
				key = sum - arr[i];
			else
				key = arr[i] - sum;
		
			
			if(alarr.contains(key))
			{
				System.out.println("The first number is " + arr[i]);
				return alarr.indexOf(key);
			}
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		PairSumSortedArray psa = new PairSumSortedArray();
		int[] arr = new int[] {1,2,3,4,5,6,7};
		int index = psa.getPairSumforKey(arr, arr.length, 13);
		if(index != -1)
			System.out.println(" The Second number is " + arr[index]);
		else
			System.out.println("could not find any pair");
		

	}

}
