//Single-level Inheritance and Is a Relationship
package package2;
import package1.Maruti;
public class Swift extends Maruti 
{	
	int deepak;
	public void second()
	{
		System.out.println("Child Class Method:");
	}
	public static void main(String[] args) 
	{
		Swift obj=new Swift();
		obj.first(); //able to call parent method.
		obj.price=123; //able to call parent class variable.
		System.out.println(obj.price);
		obj.second(); //able to call child method.
		obj.deepak=234; //able to call child class variable.
		System.out.println(obj.deepak);
	}
}

