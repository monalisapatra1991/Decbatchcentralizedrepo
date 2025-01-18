package Package2;

public class Constructor_day4 
{
	public Constructor_day4()
	{
		System.out.println("Default constructor");// TODO Auto-generated constructor stub
	}
	public Constructor_day4(int a)
	{
		System.out.println("One parametrized constructor");
	}
	public Constructor_day4(int a,int b)
	{
		System.out.println("Two parametrized constructor");
	}
	public static void main(String[] args) 
	{
		Constructor_day4 ref = new Constructor_day4();
		Constructor_day4 ref1 = new Constructor_day4(1);
		Constructor_day4 ref2 = new Constructor_day4(1,2); // Need to call all the constructor by using Object.So here we are calling 3 constructor so called 3 obj.
	}
}
