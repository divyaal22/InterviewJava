package Arrays;
public class SmallWindowString{
	
	int ASCII_CHAR =256;
	public String getWindowString(String sample, String pattern)
	{
		int[] arr_pat = new int[ASCII_CHAR];
		int[] arr_sam = new int[ASCII_CHAR];
		int count=0;
		
	      int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
		
		if(pattern.length()>sample.length()) return null;
		
		for(int i=0;i<pattern.length();i++)
		{
			 arr_pat[pattern.charAt(i)]++;
		}
		
		for(int j=0;j<sample.length();j++)
		{
			arr_sam[sample.charAt(j)]++;
			if(arr_sam[sample.charAt(j)]<=arr_pat[sample.charAt(j)]){
				count++;
			}
			
			if(count==pattern.length()){
				
				while(arr_sam[sample.charAt(j)]>arr_pat[sample.charAt(j)] ||  arr_pat[sample.charAt(start)] == 0)
				{
					if (arr_sam[sample.charAt(start)] > arr_sam[sample.charAt(start)])
						arr_sam[sample.charAt(start)]--;
                    start++;
					
				}
				
				
				
			}
			
			
		}
		
		
		
		
		return null;
	}
	
	
	public static void main(String[] args) {
		SmallWindowString sw= new SmallWindowString();
		String sample = "this is a test string";
		String pattern = "tist";
		String result = sw.getWindowString(sample, pattern);
		
		
	}
	
}