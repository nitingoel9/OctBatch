package package1;

public class ConstructorAssignment1 
{
	public ConstructorAssignment1(int a,int b)
	{
		System.out.println("Two parametrized constructor");
	}
	public ConstructorAssignment1(int a)
	{
		System.out.println("One parametrized constructor");
	}
	public static void main(String [] args)
	{
		ConstructorAssignment1 CA1=new ConstructorAssignment1(12);
		ConstructorAssignment1 CA2=new ConstructorAssignment1(12,13);
	}
	
}
