package Practice;

public class secondCLASSassgnTWO //((((10/2)+2)-2)-2)*2)
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
	public void multiplication(int a , int b) 
	{
		int e = a*b;
		System.out.println("Multiplication result :"  +e);
	}
	public int division(int a, int b)
	{
		int f = a/b;
		System.out.println("Division result is :"+f);
		return f;
			}	

	public static void main(String[] args) 
	{
		secondCLASSassgnTWO garry = new secondCLASSassgnTWO();
		int var1 = garry.division(10, 2);
		int var2 = garry.addition(var1, 2);
		int var3 = garry.subtraction(var2, 2);
		int var4 = garry.subtraction(var3, 2);
		garry.multiplication(var4, 2);
	}

}
