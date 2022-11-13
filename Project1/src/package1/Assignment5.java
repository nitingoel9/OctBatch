package package1;

public class Assignment5 
{
	int deepak; //In this case it will print the default value of the global int variable that is 0.
//	int deepak=333; // In this case it will print the value of the global int variable that is 333.
	public void m1 (int deepak)
	{
		deepak=deepak;
	}
	public static void main(String[] args) 
	{
		Assignment5 obj=new Assignment5();
		obj.m1(123);
		System.out.println("value of deepak: "+obj.deepak);
	}
}

