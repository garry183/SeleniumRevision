package Practice;

public class secondCLASSassgnONE //   ((((10+2)+2)-2)*2)/2)
{
	public int addition(int a , int b) 
	{
		int c = a+b;
		System.out.println("Addition result is :"+c );
		return c;
	}
	public int subtraction(int a, int b) 
	{
		int d = a-b;
		System.out.println("Subtraction result is :"+d);
		return d;
	} 
	public int multiplication(int a , int b) 
	{
		int e = a*b;
		System.out.println("Multiplication result :"  +e);
		return e;
	}
	public void division(int a, int b) 
	{
		int f = a/b;
		System.out.println("Division result is :"+f);

	}
	public static void main(String[] args) 
	{
		secondCLASSassgnONE garry = new secondCLASSassgnONE();
		int var1 = garry.addition(10, 2);
		int var2 = garry.addition(var1, 2);
		int var3 = garry.subtraction(var2, 2);
		int var4 = garry.multiplication(var3, 2);
		garry.division(var4, 2);
		
	}

}
