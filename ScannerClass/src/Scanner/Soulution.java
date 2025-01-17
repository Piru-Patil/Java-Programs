package Scanner;

import java.util.Scanner;

public class Soulution {
	
	void add(int a,int b)
	{
		System.out.println("The sum of"+a+" and "+b+" is "+(a+b));
	}

	public static void main(String[] args) {
		Soulution s = new Soulution();
		Scanner scan =new Scanner(System.in);
		
		for(int i=1; i<=3; i++)
		{
			System.out.println("Enter the First number");
			int a = scan.nextInt();
			
			System.out.println("Enter the Second number");
			int b = scan.nextInt();
			
			s.add(a, b);
			System.out.println("-------------------");
		}

	}

}
