
public class permutations {
	
	final static int ASCII_CHAR=256;
	
	public static long factorial(int num){
		int fact=1;
		
		for(int i=1;i<num;i++)
			fact*=i;
		
	
		
		return fact;
	}
	public static int countPermutations(String str) {
		
		int[] count = new int[ASCII_CHAR];
		int perm=0;
		int x=0;
		
		for(int i=0;i<str.length();i++){
			count[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<str.length();i++){
			perm+=factorial(count[str.charAt(i)-'a']);
		}
		
		return perm;
	}

	public static void main(String[] args) {
		String str = "utggghsjjsgggat";
		
		int fact = countPermutations(str);
		
		System.out.println(factorial(str.length())/fact);

	}



}
