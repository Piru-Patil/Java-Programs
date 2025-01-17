package MethodORR;

public class WhatsAppV3 extends WhatsAppV2{
	
	@Override
	void Display()
	{
		super.Display();
		System.out.println("Blue tick supported");
	}
	
	@Override
	void Calls()
	{
		super.Calls();
		System.out.println("Video call supported");
	}
	
	void Story()
	{
		System.out.println("Can upload images as stoty");
	}

}
