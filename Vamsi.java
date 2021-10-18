class Student
{
  int rollno;
  String name;
  public void display()
  {
    rollno = 1;
    name = "Vamsi";
   
  }
}
public class Vamsi
{
  public static void main(String[] args)
  {
    System.out.println("Hello");
    Student obj = new Student();
    obj.display();
    System.out.println(obj.rollno);
  }
}
