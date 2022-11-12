package package1;

public class ConstructorAssignment3 
{
	public void m1()
	{
		this.m4();
		System.out.println("Default Method: ");
		this.m5();
		this.m2();
		this.m3();
	}
	public void m2()
	{
		System.out.println("One Parametrized Method: ");
	}
	public void m3()
	{
		System.out.println("Two Parametrized Method: ");
	}
	public void m4()
	{
		System.out.println("Three Parametrized Method: ");
	}
	public void m5()
	{
		System.out.println("Four Parametrized Method: ");
	}
	public static void main(String[] args) 
	{
		ConstructorAssignment3 obj=new ConstructorAssignment3();
		obj.m1();
	}
}
