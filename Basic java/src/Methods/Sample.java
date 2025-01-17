package Methods;

public class Sample {
	
	void circle(int r)
	{
		double pi = 3.142;
		double c = 3.142*(r*r);
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		
		Sample s = new Sample();
		s.circle(3);
		s.circle(5);
		
	}

}
