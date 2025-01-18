package Package2;

public class Constructor_day5_Asgn 
{
	public Constructor_day5_Asgn(int a,int b,int c)
	{
		this();
		System.out.println("Three parametried constuctor");
	}
	public Constructor_day5_Asgn()
	{
		System.out.println("Default constructor");
	}
	public Constructor_day5_Asgn(int a1)
	{
		System.out.println("one parametried constructor");
	}
	public Constructor_day5_Asgn(int x,int y)
	{
		System.out.println("Two parametrized constructor");
	}
	public static void main(String[] args)
	{
		Constructor_day5_Asgn obj = new Constructor_day5_Asgn(12,22,23);
	    
	}
}
