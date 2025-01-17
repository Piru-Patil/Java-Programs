package MethodOl;

public class WhatsappMain {

	public static void main(String[] args) {
		Whatsapp a = new Whatsapp();
		
		a.upload(10,20);
		a.upload("Dinga", "Dingi");
		a.upload(29.3,27.2);
		a.upload(10,20,30);
		a.upload("Dinga", 23);
		a.upload(43, "Dingi");
	}
}
