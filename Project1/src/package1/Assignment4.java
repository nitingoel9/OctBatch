package package1;

public class Assignment4 
{
	int deepak; //global variable
	public void method1(int a) // int a is a local variable
	{
		deepak=a;  // giving the value of local variable to global variable 
	}
	public static void main(String[] args) 
	{
		Assignment4 obj=new Assignment4();
		obj.method1(123);
		System.out.println("Value of Deepak: "+obj.deepak);
	}
	
}
