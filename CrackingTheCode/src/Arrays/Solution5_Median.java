package Arrays;

public class Solution5_Median{
	
	public void bubbleSort(int[] arr, int n){
		
		int temp;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;					
				}
			}
			
		}
		for(int x=0; x<n;x++)
			System.out.println(arr[x]);

	}
	
	
	public static void main(String[] args) {
		
		Solution5_Median sm = new Solution5_Median();
		int[] arr = new int[]{1,5,2,4,7,3};
		sm.bubbleSort(arr, arr.length);
		
	}
}