package Arrays;

import java.util.Arrays;

public class SubsetArrays {
	
	public boolean findSubset(int[] arr, int[] subset)
	{
		Arrays.sort(arr);
		Arrays.sort(subset);
		
		int i=0, j=0;
		
		while(i<arr.length && j<subset.length)
		{
			
			if(arr[i]==subset[j])
			{
				i++;
				j++;
			}
			else if(arr[i]<subset[j])
				i++;
			
			else if(arr[i]>subset[j]) return false;

		}
		
		if(j<subset.length)
			return false;
		else 
			return true;

	}

	public static void main(String[] args) {
		
		SubsetArrays sa = new SubsetArrays();
		int[] arr = new int[] {1,4,6,2,7,5,3};
		int[] subset = new int[] {5,6};
		
		System.out.println(sa.findSubset(arr,subset));
		

	}

}
