package package1;
public class Student 
{
	// {} indicate boundary (body) of the class 
	int rollNo; // rollNo is a variable which will store integer value
	int age; // age is a variable which will store integer value
	public void display1() // name of method1 (display1)  
	{
		System.out.println("Welcome to all of you.");
	}
	public void display2() // name of method2 (display2)  
	{
		System.out.println("Automation is very easy.");
	}
	public static void main(String[] args) 
	{
		Student nit=new Student(); // third pillar and abc is a reference variable.
		nit.display1(); // calling method1 
		nit.display2(); // calling method2
		nit.rollNo=11;  // calling variable1
		nit.age=36;     // calling variable2
		System.out.println(nit.rollNo); // printing the value of variable1.
		System.out.println(nit.age); // printing the value of variable2.
	}
}
