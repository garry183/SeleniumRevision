package Practice;

public class constructorClass 
{

	public constructorClass ()
	{	
		this(100, 200, 300);
		System.out.println("This is Default Constructor");
	}
	public constructorClass (int a)
	{
		this();
		System.out.println("This is One Parameterized Constructor");
	}
	public constructorClass (int a , int b)
	{
	    this(100);
		System.out.println("This is Two Parameterized Constructor");
	}
	public constructorClass (int a , int b, int c)
	{   
		
		System.out.println("This is Three Parameterized Constructor");
	}		
	
	public static void main(String[] args) 
	{
		constructorClass obj = new constructorClass();
	}

}


