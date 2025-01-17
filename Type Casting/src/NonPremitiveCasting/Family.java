package NonPremitiveCasting;

public class Family {

	public static void main(String[] args) {
		
	//Upcasting
		
	Father f = new Son();
	System.out.println(f.age);
	
	//Downcasting
	
	Son s = (Son) f;
	System.out.println(s.age+" "+s.Name);
	}

}
