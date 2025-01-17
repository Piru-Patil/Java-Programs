package Methods;

public class Sample4MainClass {

	public static void main(String[] args) {
		
		Sample4 s = new Sample4();
		s.m1();
		
		s.m2(23, "Dinga");
		
		String Q = s.m3();
		System.out.println(Q+" "+(s.m3()));
		
		 int Q1 =s.m4(10, 21);
		 System.out.println(Q1);

	}

}
