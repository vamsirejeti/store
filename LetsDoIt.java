import java.util.Scanner;
class Student
{
	String Stud;

public Student() 
	{
		Stud = "Unknown";
	}
public Student(String s)
	{
		Stud = s;
	}
}
public class LetsDoIt 
{
	public static void main(String[] args) 
	   {
		Student obj = new Student();
		System.out.println(obj.Stud);
		Student obj1 = new Student("Vamsi");
		System.out.println(obj1.Stud);
		}
}
		




