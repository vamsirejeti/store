
class Student
{
	private int rollno;
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public int setRollno(int rollno) {
		return this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
}
public class EncapsuleDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("vamsi");
		s1.setRollno(10);
		s1.setAge(23);
		System.out.println("name"+"   : "+s1.getName());
		System.out.println("Rollno"+" : "+s1.getRollno());
		System.out.println("Age"+"    : "+s1.getAge());
		float x = (byte) 10;
		System.out.println(x);
	}

}
