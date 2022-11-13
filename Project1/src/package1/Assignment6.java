package package1;

public class Assignment6 
{
	int deepak=333; //global variable
	public void m1 (int deepak) // int a is a local variable
	{
		this.deepak=deepak; // this keyword is used for differentiating the local variable and global variable when the variable names are same.
	}
	public static void main(String[] args) 
	{
		Assignment6 obj=new Assignment6();
		obj.m1(123);
		System.out.println("Value of method1: "+obj.deepak);
	}
	
}
