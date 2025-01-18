package Package2;

public class Student2    // Class creation - Pillar 1
{
	int rollno; // Declair datatype and varible name
    int age;
    public void display1() //display1() is the method name  
    {
    	System.out.println("Welcome to all of you");
    }
    public void display2() 
    {
    	System.out.println("Automation is very easy");
    }
    
  public static void main(String[] args)    // Main method creation - Pillar 2
  {
	  Student2 def=new Student2(); // Object creation - call Variable and method -Pillar 3
	  def.display1();              // Call Variable or method in main method - Pillar 4
	  def.display2();  // call method
	  def.rollno=55;
	  System.out.println(def.rollno);
	  def.age=25;  //call variable
	  System.out.println(def.age);
			  
  }
}
