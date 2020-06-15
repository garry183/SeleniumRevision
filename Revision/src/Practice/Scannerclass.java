package Practice;

import java.util.Scanner;//(((((X1+X2)-X3)+X4)*X5)/X6)

public class Scannerclass 
{
	public int addition(int a, int b)
	{int c = a+b;
	return c;}
	public int substration(int d, int e)
	{int f = d-e;
	return f;}
	public int multiplication(int g, int h)
	{int i = g*h;
	return i;}
	public int division(int j, int k)
	{int l = j/k;
	return l;}
	
	public static void main(String[] args) 
	{
		Scannerclass garry = new Scannerclass();
		Scanner scangarry = new Scanner(System.in);
		
		System.out.println("Enter value of x1");
		int X1 = scangarry.nextInt();
		System.out.println("Enter value of X2");
		int X2 = scangarry.nextInt();
		int add = garry.addition(X1, X2);
		
		System.out.println("Enter value of X3");
		int X3 = scangarry.nextInt();
		int subt = garry.substration(add, X3);
		
		System.out.println("Enter value of X4");
		int X4 = scangarry.nextInt();
		int add1 = garry.addition(subt, X4);
		
		System.out.println("Enter value of X5");
		int X5 = scangarry.nextInt();
		int multi = garry.multiplication(add1, X5);
		
		System.out.println("Enter value of X6");
		int X6 = scangarry.nextInt();
		int div = garry.division(multi, X6);
		
		System.out.println("Final result is : " +div);	
				
	}

}
