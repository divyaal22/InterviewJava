package Arrays;

public class FindSQL {

	
	public static void main(String[] args) {
		
		String sample = "IBM Processor";
		
		String[] x = sample.trim().split(" ");
		
		int len=0;
	
		for(int i=0;i<x.length;i++)
			len = len +x[i].length();
		
		System.out.println(len);
		
		
		System.out.println(len/x.length);
		
		
		

	}

}
