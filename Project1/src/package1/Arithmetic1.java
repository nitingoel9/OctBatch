// Assignment1: (((((10+2)+2)-2)*2)/2)
package package1;
public class Arithmetic1 
{
  int a,b,c,d,e,f,g,h,i,j,k,result;	
  public int sum (int a, int b)
  {
	  c=a+b;
	  return c;
  }
  public int sub (int d, int e)
  {
	  f=d-e;
	  return f;
  }
  public int mul (int g, int h)
  {
	  i=g*h;
	  return i;
  }
  public int div (int j, int k)
  {
	  result=j/k;
	  return result;
  }
  public static void main(String[] args) 
  {
	Arithmetic1 nitin=new Arithmetic1();
	int output=nitin.sum(10,2);
	System.out.println("Result of addition1 is: "+output);
	int output1=nitin.sum(output,2);
	System.out.println("Result of addition2 is: "+output1);
	int output2=nitin.sub(output1,2);
	System.out.println("Result of subtraction is: "+output2);
	int output3=nitin.mul(output2,2);
	System.out.println("Result of multiplication is: "+output3);
    int output4=nitin.div(output3,2);
	System.out.println("Final Result after division is: "+output4);
  }
}
