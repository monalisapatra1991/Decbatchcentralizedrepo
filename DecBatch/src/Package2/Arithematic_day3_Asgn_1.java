package Package2;

public class Arithematic_day3_Asgn_1 
{
   public int sum(int a,int b,int c)
   {
	   int m;
	   m=a+b+c;
	   System.out.println("sum result" +m);
	   return c; 
    }
   public int sub(int a1,int b1)
   {
	   int d;
	   d=a1+b1;
	   System.out.println("sub result" +d);
	   return d;
   }
   public int multi(int a11,int b11)
   {
	   int d11;
	   d11=a11*b11;
	   System.out.println("multi result" +d11);	  
	   return d11;
   }
   public void div(int x,int y)
   {
	   int result;
	   result=x/y;
	   System.out.println("Final result is "+result);
   }
   public static void main(String[] args) 
   {
	   Arithematic_day3_Asgn_1 ref1 =new Arithematic_day3_Asgn_1();
	   int sumresult=ref1.sum(10,2,2);
	   int subresult=ref1.sub(sumresult,2);
	   int multiresult=ref1.multi(subresult,2);
	   ref1.div(multiresult,2);
   }
}
