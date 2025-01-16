package Sample;

public class MainClass {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		Dog d = new Dog();
		Snake s = new Snake();
		
		Stimulator.noise(c);
		Stimulator.noise(d);
		Stimulator.noise(s);
		
	}

}
