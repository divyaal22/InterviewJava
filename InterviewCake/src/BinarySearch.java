
public class BinarySearch {
	
	public static int getbinarySearch(int[] a, int num, int low, int high) {
		
		int mid = (low+high)/2;
		

				
		if(a[mid]==num) {
			return mid;	
		}
		
	

		if(mid == 0) return 0;
		
		if(mid > high) return 0;
	
		
				if(num<a[mid])
					return getbinarySearch(a,num,low,mid);
				else
					return getbinarySearch(a,num,mid+1,high);
				 				
		
	}
		

	

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(getbinarySearch(a, 7,0, a.length-1));

	}



	

	

}
