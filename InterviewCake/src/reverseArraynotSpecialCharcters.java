import java.util.Stack;

public class reverseArraynotSpecialCharcters {

	public static void main(String[] args) {
	
		String str = "a,b$c";
		
		Stack s= new Stack<>();
		
		for(int i=0;i<str.length();i++){
			
		if(Character.isLetter(str.charAt(i))){
			s.push(str.charAt(i));
		}	
			
	}
		
		for(int i=0;i<str.length();i++){
			if(Character.isLetter(str.charAt(i))){
				System.out.println(s.pop());
			}	
			else
				System.out.println(str.charAt(i));
			
		}
		

	}

}
