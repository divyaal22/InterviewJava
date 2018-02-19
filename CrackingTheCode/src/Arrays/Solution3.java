package Arrays;

public class Solution3 {
	
	public String removeduplicates(String words)
	{
		char data[] = words.toCharArray();
		
		if(data.length==0) return null;
		
		if(data.length<2) return words;
		
		int tail=1;
		
		for (int i = 1; i < data.length; ++i) {
		    int j;
		    for (j = 0; j < tail; ++j) {
		      if (data[i] == data[j]) break;
		    }
		    if (j == tail) {
		      data[tail] = data[i];
		      ++tail;
		    }
		  }
		  data[tail] = 0;

		String s = new String(data);

		return s;
	}
	
	
	static String removeDuplicates(String s) {
	    StringBuilder noDupes = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	    	System.out.println(i + "        "+s.substring(i, i + 1));
	        String si = s.substring(i, i + 1);
	        if (noDupes.indexOf(si) == -1) {
	            noDupes.append(si);
	        }
	    }
	    return noDupes.toString();
	}
	
	

	public static void main(String[] args) {
		
		Solution3 s3 = new Solution3();
		System.out.println(s3.removeduplicates("aaab"));
		

	}

}
