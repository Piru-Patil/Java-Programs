package Programs;

public class ReversString {
	
	public static void main(String[] args) {
		
		String s = "I love India";
		String s2 ="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			s2 = s2+ s.charAt(i);	
		}
		System.out.println(s2);
	}

}
