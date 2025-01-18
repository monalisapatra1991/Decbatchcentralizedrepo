package Package1;
//{} indicate boundary(body) of the class
// complete code write in the body of the class 
public class Student 
{
    int rollno; // Declair datatype and varible name
    int age;
    public void display1() //display1() is the method name 
    {
    	System.out.println("Welcome to all of you");
    }
    public void display2() //display2() is the method name 
    {
    	System.out.println("Automation is very easy");
    }
    public static void main(String[] args) 
    {
		Student result =new Student();
		result.display1();
		result.rollno=123;
		System.out.println(result.rollno);
		result.display2();
		result.age=18;
		System.out.println(result.age);
	}
}
