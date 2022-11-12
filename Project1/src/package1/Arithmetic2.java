//  (((((10*2)+2)-2)-2)/2)
package package1;
public class Arithmetic2 
{
	  int a,b,c,d,e,f,g,h,i,j,k,result;
	  public int sum (int a,int b)
	  {
		  c=a+b;
		  return c;
	  }
	  public int sub (int d,int e)
	  {
		  f=d-e;
		  return f;
	  }
	  public int mul (int g,int h)
	  {
		  i=g*h;
		  return i;
	  }
	  public int div (int j,int k)
	  {
		  result=j/k;
		  return result;
	  }
	  public static void main(String[] args) 
	  {
		Arithmetic2 nitin1=new Arithmetic2();
		int output=nitin1.mul(10,2);
		System.out.println("Result of multiplication is: " +output);
		int output1=nitin1.sum(output,2);
		System.out.println("Result of addition is: " +output1);
		int output2=nitin1.sub(output1,2);
		System.out.println("Result of subtraction1 is: " +output2);
		int output3=nitin1.sub(output2,2);
		System.out.println("Result of subtraction2 is: " +output3);
	    int output4=nitin1.div(output3,2);
		System.out.println("Final Result after division is: " +output4);
	  }
}
