//Multi-level Inheritance
package package1;

public class CretaSX extends Creta 
{	
	public void third()
	{
		System.out.println("Child Class Method");
	}
	public static void main(String[] args) 
	{
		CretaSX obj=new CretaSX();
		obj.first();
		obj.second();
		obj.third();
	}
	

}
