package calculator;

import java.util.Scanner;

public class Substraction {
	public int sub()
	{
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number:");
		a=sc.nextInt();
		
		System.out.print("Enter Second Number:");
		b=sc.nextInt();
		
		System.out.print("Substraction is = ");
		
		c=a-b;
		
		return c;
	}

}
