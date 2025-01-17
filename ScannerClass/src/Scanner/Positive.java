package Scanner;

import java.util.Scanner;

public class Positive {
	
	void pon(int n)
	{
		if(n>=0)
			{
			System.out.println(n+" is positive number");
			}
			else
			{	
			System.out.println(n+" is negative number");		
			}	
	}
	public static void main(String[] args) {
		
		Positive p = new Positive();
		Scanner scan =  new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter the number");
			int n = scan.nextInt();
			
			p.pon(n);
			System.out.println("----------");
		}
	}

}
