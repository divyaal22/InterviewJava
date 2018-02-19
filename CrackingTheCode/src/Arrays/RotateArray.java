package Arrays;

public class RotateArray {
	
	public void rotateLeftArray(int[] arr, int n, int d){
		
		int[] temp = new int[d];
		int i=0;
		
		for(int x=0;x<d;x++)
			temp[x]=arr[x];
		
		for(i=0;i<n-d;i++){
				arr[i]=arr[i+d];
		}
		
		
		for(int x=0;x<d;x++){
			arr[i]= temp[x];
			i++;
		}
		
		for(int x=0;x<n;x++)
			System.out.println(arr[x]);
			
	}

	public static void main(String[] args) {
		
		int[] arr= new int[] {1,2,3,4,5};
		RotateArray ra = new RotateArray();
		ra.rotateLeftArray(arr,arr.length,2);
		

	}

}
