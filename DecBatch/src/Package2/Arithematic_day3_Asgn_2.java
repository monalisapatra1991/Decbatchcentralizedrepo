package Package2;

public class Arithematic_day3_Asgn_2 
{
  public int multi(int a,int b)
  {
	  int c;
	  c=a*b;
	  System.out.println("Multiply result" +c);
	  return c;
  }
  public int sub(int x,int y)
  {
	  int z;
	  z=x-y;
	  System.out.println("sub result" +z);
	  return z;
  }
  public int sum(int a1,int b1)
  {
	  int c1;
	  c1=a1+b1;
	  System.out.println("sum result" +c1);
	  return c1;
  }
  public void div(int d1,int d2)
  {
	  int result;
	  result=d1/d2;
	  System.out.println("Final result" +result);
  }
  public static void main(String[] args)
  {
	  Arithematic_day3_Asgn_2 ref = new Arithematic_day3_Asgn_2();
	  int multiresult = ref.multi(10,2);
	  int subresult =ref.sub(multiresult, 2);
	  int sumresult =ref.sum(subresult, 2);
	  int subresult2 =ref.sub(sumresult,2);
	  ref.div(subresult2, 2);  
}
}
