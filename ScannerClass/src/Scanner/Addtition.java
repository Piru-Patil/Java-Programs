package Scanner;

import java.util.Scanner;

public class Addtition {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a = scan.nextInt();
		
		System.out.println("Enter the value of b");
		int b = scan.nextInt();
		
		System.out.println("The sum of a:"+a+" and b:"+b+" is ");
		
		System.out.println(a+b);
		
	scan.close();
	}
}
