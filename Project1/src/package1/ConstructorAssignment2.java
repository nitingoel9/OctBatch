package package1;

public class ConstructorAssignment2 
{
	public ConstructorAssignment2()
	{
		this(1,2,3,4);
		System.out.println("Default Constructor");
	}
	public ConstructorAssignment2(int a)
	{
		this();	
		System.out.println("One Parametrized Constructor");
	}
	public ConstructorAssignment2(int a,int b)
	{
		this(1,2,3);
		System.out.println("Two Parametrized Constructor");
	}
	public ConstructorAssignment2(int a,int b,int c)
		
	{
		this(1);
		System.out.println("Three Parametrized Constructor");
	}
	public ConstructorAssignment2(int a,int b,int c,int d)
	{
		System.out.println("Four Parametrized Constructor");
	}
	public static void main(String[] args) 
	{
		ConstructorAssignment2 CA2=new ConstructorAssignment2(1,2);
	}
}
