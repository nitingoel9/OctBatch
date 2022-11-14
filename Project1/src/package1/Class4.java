//Calling constructors using super and this keyword.
package package1;

public class Class4 extends Class3
{
	public Class4()
	{
		this(1,2);
		System.out.println("Child Default Constructor");
	}
	public Class4(int a)
	{
		this();
		System.out.println("Child one parameterized Constructor");
	}
	public Class4(int a,int b)
	{	
		super(1,2);
		System.out.println("Child two parameterized Constructor");
	}
	public Class4(int a,int b,int c)
	{
		this(1); // it will call parent 2 parameterized constructor.
		System.out.println("Child three parameterized Constructor");
	}
	public void m1()
	{
		System.out.println("Final Value");
	}
	public static void main(String[] args) 
	{
		Class4 c4=new Class4(1,2,3); //child 3 parameterized constructor.
		c4.m1();
	}
}
