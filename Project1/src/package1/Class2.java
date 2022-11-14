//Has a Relationship
package package1;

public class Class2 
{
	public void second()
	{
		System.out.println("Method2");
	}
	public static void main(String[] args) 
	{
		Class2 c2=new Class2();
		c2.second();
		Class1 c1=new Class1(); //has a relationship
		c1.first();		
	}
}
