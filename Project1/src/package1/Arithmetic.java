// Assignment in class: (10+2)(10-2)
package package1;
public class Arithmetic 
{	
	public int sum(int s, int s1) // method1
	{
		int c=s+s1;
		System.out.println("Result of Addition is: "+c);
		return c;
	}
	public int sub(int d1, int d2) // method2
	{
		int d=d1-d2;
		System.out.println("Result of Subtraction is: "+d);
		return d;
	}
	public void mul(int a1, int a2) // method3
	{
		int result=a1*a2;
		System.out.println("Final result is: "+result);
	}
	public static void main(String[] args)
	{
		Arithmetic obj=new Arithmetic(); // object creation	
		int sumresult=obj.sum(10,2); // calling method1
		int subresult=obj.sub(10,2); // calling method2
		obj.mul(sumresult, subresult); // calling method3
	}	
}
