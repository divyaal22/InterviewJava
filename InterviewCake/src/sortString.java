import java.util.Arrays;
import java.util.Collections;

public class sortString {

	public static void main(String[] args) {
		
		String str1 = "geeksforgeeks";
		
		Character[] chr = new Character[str1.length()];
		
		for(int i=0;i<str1.length();i++)
			chr[i]=str1.charAt(i);
		
	Arrays.sort(chr, new charSorter());
	
	StringBuilder str = new StringBuilder();
	
	for(int i=0;i<str1.length();i++)
		str.append(chr[i]);
	
	System.out.println(str);
	
		
	}

}
