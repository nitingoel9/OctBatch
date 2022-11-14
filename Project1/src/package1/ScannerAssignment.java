// (((((x1+x2)+x3)-x4)*x5)/x6)
package package1;

import java.util.Scanner;

public class ScannerAssignment 
{
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
	public static void main(String[] args) 
	{
		ScannerAssignment SA=new ScannerAssignment();
		Scanner S=new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a=S.nextInt();
		System.out.println("Enter value of b:");
		int b=S.nextInt();
		System.out.println("Enter value of c:");
		int c=S.nextInt();
		System.out.println("Enter value of d:");
		int d=S.nextInt();
		System.out.println("Enter value of e:");
		int e=S.nextInt();
		System.out.println("Enter value of f:");
		int f=S.nextInt();
		int sum1=SA.sum(a,b);
		int sum2=SA.sum(sum1,c);
		int sub=SA.sub(sum2,d);
		int mul=SA.mul(sub,e);
		int div=SA.div(mul,f);
		System.out.println("Final output is: "+div);
		S.close();
	}
}
