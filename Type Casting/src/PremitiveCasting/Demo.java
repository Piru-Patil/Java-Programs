package PremitiveCasting;

public class Demo {
	
	public static void main(String[] args) {
		
		 System.out.println("-----widening----");
		 
		 int a = 5;
		 double b = a;
		 System.out.println(a+" "+b);
		 
		 char x = 'A';    // ASCII value of A is 64
		 int y = x;
		 System.out.println(x+" "+y);
		 
		 char p = 'b';
		 int q = p;
		 System.out.println(p+" "+q);
		 
		 System.out.println("-----Narrowing-----");
		 
		 double c = 4.5;
		 int d = (int) c;
		 System.out.println(c+" "+d);
		 
		 double a1 = 30.87f;
		 float b1 = (float)a1;
		 System.out.println(a1+" "+b1);
		 
		 int a2 =78;
		 char b2 = (char) a2;
		 System.out.println(a2+" "+b2);	 
	}

}
