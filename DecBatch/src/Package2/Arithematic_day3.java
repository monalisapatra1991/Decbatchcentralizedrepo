package Package2;

public class Arithematic_day3
{
  public int sum(int a,int b)
  {
	  int c;
	  c=a+b;
      //System.out.println("Sum result is "+c);
      return c;
  }
  public int sub(int x,int y)
  {
	  int z;
	  z=x-y;
	  //System.out.println("sub result is "+z);
	  return z;
  }
  public void multi(int a1,int a2)
  {
	  int result;
	  result=a1*a2;
	  System.out.println("Final result is "+result);
  }
  public static void main(String[] args) 
  {
	  Arithematic_day3 ref = new Arithematic_day3();
	  int sumresult=ref.sum(10,2);
	  System.out.println("Sum result is "+sumresult);
	  int subresult=ref.sub(10,2);
	  System.out.println("subresult is "+subresult);
	  ref.multi(sumresult,subresult);
  }
}
 