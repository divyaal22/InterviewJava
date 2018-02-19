import java.util.*;
import java.lang.*;
import java.io.*;

public class IdenticalArrays {
	public static void main (String[] args) {
		int testcases;
		int size;
		Scanner sc=new Scanner(System.in);
		testcases=sc.nextInt();
		
		while(testcases > 0)
		{
			size=sc.nextInt();
			ArrayList<Integer> a1 = new ArrayList<>(size);
			ArrayList<Integer> a2 = new ArrayList<>(size);
			
			for(int i=0;i<size;i++)
				a1.add(sc.nextInt());	
			
			for(int i=0;i<size;i++)
				a2.add(sc.nextInt());
			
			System.out.println(IsArrayIdentical(a1, a2));
			
			testcases--;
		}
	
	}
	
	
	public static int IsArrayIdentical(ArrayList arr1, ArrayList arr2)
	{
		
		Collections.sort(arr1);
		Collections.sort(arr2);
		
		if(arr1.equals(arr2))
		{
			return 1;
		}
		
		
		
		return 0;
	}
	
	
	

}