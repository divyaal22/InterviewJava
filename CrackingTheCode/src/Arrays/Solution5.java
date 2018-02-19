package Arrays;

public class Solution5 {

	public static void main(String[] args) {
		
		int [] arr = new int[] {2,4,5,7,1,9,3};
		int i =0;
		int max=arr[i];
		
	while(i<arr.length){
		if(max>=arr[i])
			i++;
		else
		{
			max=arr[i];
			i++;
		}
		   
	}
	
	System.out.println(max);

	}

}
