package calculator;

import java.util.Scanner;

public class Multiplication {
	public int mult()
	{
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number:");
		a=sc.nextInt();
		
		System.out.print("Enter Second Number:");
		b=sc.nextInt();
		
		System.out.print("Multiplication is = ");
		
		c=a*b;
		
		return c;
	}

}
