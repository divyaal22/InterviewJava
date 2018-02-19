import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicates {

	public static void main(String[] args) {
		
		String[] duplicates = new String[]{"Java","c","Python","Java","c","Testing"};		
		Set dupset = new HashSet<>(Arrays.asList(duplicates));
		
		if(dupset.size()!=duplicates.length)
		{
			System.out.println("there are duplicates");
		}
		else
		{
			System.out.println("there are no duplicates");
		}
		

	}

}
