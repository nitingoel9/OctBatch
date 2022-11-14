//Calling methods using super and this keyword.
package package1;

public class Class5 
{
	public void m1()
	{
		this.m4();
		System.out.println("Parent Default Method");
	}
	public void m2()
	{
		this.m1(); 
		System.out.println("Parent one parameterized Method");
	}
	public void m3()
	{	
		this.m2();
		System.out.println("Parent two parameterized Method");
	}
	public void m4()
	{	
		System.out.println("Parent three parameterized Method");
		
	}	
}



