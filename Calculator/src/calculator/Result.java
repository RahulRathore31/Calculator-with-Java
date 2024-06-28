package calculator;

public class Result {

	public static void main(String[] args) {
		
		Addition a = new Addition();
		System.out.println(a.add());
		System.out.println();
		
		Substraction s=new Substraction();
		System.out.println(s.sub());
		
		System.out.println();
		
		Multiplication M=new Multiplication();
		System.out.println(M.mult());
				
		System.out.println();
		
		Division D = new Division();
		System.out.println(D.div());
		
		System.out.println();

	}

}
