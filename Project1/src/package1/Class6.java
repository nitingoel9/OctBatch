//Calling methods using super and this keyword.
package package1;

public class Class6 extends Class5
{
	public void a1()
	{
		this.a3();
		System.out.println("Child Default Method");	
	}
	public void a2()
	{	
		super.m3();
		System.out.println("Child one parmetrized Method");
	}
	public void a3()
	{
		this.a4();
		System.out.println("Child two parmetrized Method");
	}
	public void a4()
	{	
		this.a2();
		System.out.println("Child three parmetrized Method");
	}
	public static void main(String[] args) 
	{
		Class6 c6=new Class6();
		c6.a1();
	}
}
