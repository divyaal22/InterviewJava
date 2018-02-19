import java.util.Collections;
import java.util.HashMap;

public class mostFrequent {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,3,1,3,4,3,5,4,7,4,5,4,7};
		int count=0;
		
		int maxCount=0, maxItem=-1;
		
		HashMap hm = new HashMap();
		
		for (int i=0;i<arr.length;i++){
			
			if(hm.containsKey(arr[i])){
				count = (int) hm.get(arr[i]);
				hm.put(arr[i], count+1);
				
			}
			else
				hm.put(arr[i], 1);
			
			if((int) hm.get(arr[i]) > maxCount)
			{
				maxCount = (int) hm.get(arr[i]);
				maxItem=arr[i];
			}
	
		}
		
		System.out.println(maxItem);

	}

}
