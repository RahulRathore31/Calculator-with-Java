package calculator;

import java.util.Scanner;

public class Addition {
    
	public int add() 
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter first Number:");
		a = sc.nextInt();
	
		System.out.print("Enter second Number:");
		b = sc.nextInt();

		c = a + b ;
		
		System.out.print("Addition is = ");
		

	return c;
}
}
