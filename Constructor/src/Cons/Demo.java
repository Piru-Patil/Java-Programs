package Cons;

public class Demo {
	
	int age;
	String name;
	
	Demo(int a,String b)
	{
		age = a;
		name = b;
	}

	public static void main(String[] args) {
		
		Demo d = new Demo(21,"Ding");
		Demo d1 = new Demo(23,"Dingi");
		
		System.out.println("Age: "+d.age+" Name: "+d.name);
		System.out.println("Age: "+d1.age+" Name: "+d1.name);
	}

}
