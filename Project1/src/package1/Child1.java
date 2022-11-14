//Hierarchical Inheritance
package package1;

public class Child1 extends Parent
{
	public void second() 
	{
		System.out.println("Child1 Class Method");
	}
	public static void main(String[] args) 
	{
		Child1 c1=new Child1();
		c1.second();
		c1.first();
		
	}
}
