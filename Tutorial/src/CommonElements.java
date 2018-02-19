import java.util.ArrayList;

public class CommonElements {
	
	//will there be duplicates
	//sorted
	//-negative numbers
	
	

	public static void main(String[] args) {
		
		int[] arr1 = new int[]{1, 3, 4, 6, 7, 9};
		int[] arr2 = new int[]{1, 2, 4, 5, 9, 10};
		
		
		ArrayList<Integer> dup = new ArrayList<Integer>();
		
		
		int p1 =0 , p2=0;
		
	    while(p1 < arr1.length && p2 < arr2.length){	
			
			if(arr1[p1] == arr2[p2]) {
				
				dup.add(arr1[p1]);
				p1+=1;
				p2++;
				
			}
				
			
			else if(arr1[p1]< arr2[p2]  )
			{
				p1+=1;
			}
			else
			{
			    p2+=1;	
			}
			
		}
		
for(int i=0;i<dup.size();i++)
	System.out.println(dup.get(i));

		
		
		

	}

}
