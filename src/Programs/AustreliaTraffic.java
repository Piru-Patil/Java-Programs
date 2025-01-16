package Programs;

public class AustreliaTraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		
		CentralTraffic ct = new AustreliaTraffic();
		ct.RedStop();
		ct.GreenGo();
		ct.FlashYellow();
		
		AustreliaTraffic at = new AustreliaTraffic();
		at.WalkSymbol();
		
		ContinentalTraffic CT = new AustreliaTraffic();
		CT.TrainSymbol();

	}

	@Override
	public void RedStop() {
		System.out.println("Red stop implemented");

	}

	@Override
	public void GreenGo() {
		System.out.println("green go implemented");

	}

	@Override
	public void FlashYellow() {
		System.out.println("Flash yellow implemented");

	}
	
	public void WalkSymbol() {
		System.out.println("Ready to walk");
	}

	@Override
	public void TrainSymbol() {
		System.out.println("Please stop train is coming");
	}

}
