package NonPremitiveCasting;

public class CarTest {
	
	public static void main(String[] args) {
		
		// Upcasting
		
		Vehicle v = new Car();
		System.out.println(v.Brand);
		v.Start();
		
		System.out.println("-----------");
		//Downcasting
		
		Car c =(Car) v;
		System.out.println(c.Brand+" "+c.Fuel);
		c.Start();
		c.Stop();
	}

}
