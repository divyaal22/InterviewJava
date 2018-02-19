package Arrays;

public class BinarySearch {
	
	public int generatebinarySearch(int[] arr, int low, int high, int key)
	{
		int mid = (low+high)/2;
		
		if(mid > high) return -1;
		
		if(arr[high] < key) return -1;
		
		
		if(arr[mid] == key) return mid;
		
		
		if(arr[mid] < key)
			return generatebinarySearch(arr,mid+1, high,key);
		
		
		return generatebinarySearch(arr,low, mid-1,key);
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		
		System.out.println(bs.generatebinarySearch(arr, 0, arr.length-1, 0));
		

	////////////////////////////////////////////////////////////////////////////////////
		}

}
