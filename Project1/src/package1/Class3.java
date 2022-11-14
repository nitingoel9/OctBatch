//Calling constructors using super and this keyword.
package package1;

public class Class3 
{
	public Class3()
	{
		this(1,2,3);
		System.out.println("Parent Default Constructor");
	}
	public Class3(int a)
	{
		this();
		System.out.println("Parent one parameterized Constructor");
	}
	public Class3(int a,int b)
	{
		this(1);
		System.out.println("Parent two parameterized Constructor");
	}
	public Class3(int a,int b,int c)
	{
		System.out.println("Parent three parameterized Constructor");
	}
}
