package Practice;

public class FirstClass 
{
	int age;
	int rollno;
	
	public void methodONE() 
		{
		System.out.println("Welcome All");
		}
	
	public void methodTWO() 
		{
		System.out.println("Automation is easy");
		}
	public static void main(String[] args) 
		{
		FirstClass garry = new FirstClass();
		garry.age = 100;
		System.out.println("Age is :"+garry.age);
		
		garry.rollno = 200;
		System.out.println("RollNo is :"+garry.rollno);
		
		garry.methodONE();
		garry.methodTWO();
		}
}
