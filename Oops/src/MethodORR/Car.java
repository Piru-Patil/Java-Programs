package MethodORR;

public class Car extends Vehical{
	
	@Override
	void start()
	{
		super.start();
		System.out.println("car started...");
	}
	void shiftgear()
	{
		System.out.println("change gear...");
	}
}
