
public class MergeSort {
	
	public static void getMergerSort(int[] arr, int l, int m, int r){
		
		int i, j, k;
		
	    int n1 = m - l + 1;
	    int n2 =  r - m;
	 
	    /* create temp arrays */
	    int L[] =new int[n1], R[]=new int[n2];
	 
	    /* Copy data to temp arrays L[] and R[] */
	    for (i = 0; i < n1; i++)
	        L[i] = arr[l + i];
	    for (j = 0; j < n2; j++)
	        R[j] = arr[m + 1+ j];
	 
	    /* Merge the temp arrays back into arr[l..r]*/
	    i = 0;
	    j = 0;
	    k = l;
	    while (i < n1 && j < n2)
	    {
	        if (L[i] <= R[j])
	        {
	            arr[k] = L[i];
	            i++;
	        }
	        else
	        {
	            arr[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	 
	    /* Copy the remaining elements of L[], if there are any */
	    while (i < n1)
	    {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }
	 
	    /* Copy the remaining elements of R[], if there are any */
	    while (j < n2)
	    {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }
	
	
		
		
	}
	
	public static void sort(int[] a, int l, int r){
		if(l<r){
			int mid = (l+r)/2;
			
			sort(a,l,mid);
			sort(a,mid+1,r);
			
			getMergerSort(a,l,mid,r);
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] {1,4,2,5,3};
		
		sort(a,0,a.length-1);
        
	}

}
