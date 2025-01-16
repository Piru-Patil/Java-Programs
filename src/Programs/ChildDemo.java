package Programs;

public class ChildDemo extends ParentDemo {
	
	
	
	public void Engine() {
		System.out.println("New engine added");
	}
	
	public void colour() {
		System.out.println(colour);
	}
	
	
	public static void main(String[] args) {
		ChildDemo cd = new ChildDemo();
		 cd.colour();
		 cd.breaks();
		
		
	}

}
