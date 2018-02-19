
public class BubbleSort {
	
	public static void getsorted(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		
		for(int k=0;k<arr.length;k++)
			System.out.println(arr[k]);
		
	}

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,4,3,2};
		
		getsorted(arr);

	}

}
