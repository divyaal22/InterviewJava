package Arrays;

public class SecondMostFrequent {
	
	int ASCII_MAX=256;
	
	public char getSecondFreqString(String sample){
		
		int[] count = new int[256];
		char first=0, second=0;
		int max=0;
		
		for(int i=0;i<sample.length();i++){
			
			count[sample.charAt(i)]++;
			
		}
		
		for(int i=0;i<sample.length();i++){
			
			if(max<count[sample.charAt(i)]){
				max=count[sample.charAt(i)];
				first = sample.charAt(i);
			}
			
		}
		
		max=0;
		for(int i=0 ;i<sample.length();i++){
			
			if(max<count[sample.charAt(i)]  && sample.charAt(i)!=first){
				max=count[sample.charAt(i)];
				second = sample.charAt(i);
			}
			
		}
		
		
		return second;
	}

	public static void main(String[] args) {
		SecondMostFrequent ms = new SecondMostFrequent();
		System.out.println(ms.getSecondFreqString("pesterering"));
		

	}

}
