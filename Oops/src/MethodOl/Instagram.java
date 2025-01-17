package MethodOl;
	
public class Instagram {
		
		void send(String s, String s1)
		{
			System.out.println("you have neew message from "+s+" and "+s1);
		}
		void send(int x, int y)
		{
			System.out.println("you have spent "+x+" hours "+y+" minutes");
		}
		void send(int x, String y)
		{
			System.out.println(y+" en madtidiya");
		}
		void send(String x, int y)
		{
			System.out.println("enu illa kali kutidini");
		}
		void send(double x, String y, int z)
		{
			System.out.println("Aita uta");
		}
	public static void main(String[] args) 
	{
		Instagram i =new Instagram();
		i.send("Ding","Dingi");
		i.send(2, 30);
		i.send(10, "Lo");
		i.send("Le", 10);
		i.send(10.3,"Looooo", 10);		
	}	
}
