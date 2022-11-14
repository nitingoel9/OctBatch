//Hierarchical Inheritance
package package1;

public class Child2 extends Parent 
{
	public void third() 
	{
		System.out.println("Child2 Class Method");
	}
	public static void main(String[] args) 
	{
		Child2 c1=new Child2();
		c1.first();
		c1.third();
	}
}
