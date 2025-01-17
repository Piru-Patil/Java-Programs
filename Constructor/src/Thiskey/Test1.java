package Thiskey;

public class Test1 {
	
	int OrdId;
	String ItemName;
	String name;
	
	Test1(int OrdId, String ItemName)
	{
		this.OrdId =OrdId;
		this.ItemName = ItemName;
	}
	
	Test1(int OrdId, String ItemName,String name)
	{
		this.OrdId =OrdId;
		this.ItemName = ItemName;
		this.name=name;
	}
	public static void main(String[] args) {
		
		Test1 t1 = new Test1(23251,"Shirt");
		Test1 t2 = new Test1(22313,"Pant");
		Test1 t3 = new Test1(22313,"Pant","piru");
		System.out.println("Order ID is:"+t1.OrdId+" Item name is:"+t1.ItemName);
		System.out.println("Order ID is:"+t2.OrdId+" Item name is:"+t2.ItemName);
		System.out.println("Order ID is:"+t3.OrdId+" Item name is:"+t3.ItemName+" name is:"+t3.name);
	}

}
