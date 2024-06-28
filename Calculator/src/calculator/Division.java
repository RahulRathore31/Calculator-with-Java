package calculator;

import java.util.Scanner;

public class Division {
	public int div()
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number");
		a=sc.nextInt();
		
		System.out.print("Enter Second number:");
		b=sc.nextInt();
		
		System.out.print("Result is : ");
		
		if (b!=0)
		{
			c=a/b;
		
		return c;
		}
		else
		{
		return 0;
	    }
     }
}