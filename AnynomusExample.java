class A
{
	public void show()
	{
		System.out.println("in A show");
	}
	public void display()
	{
		System.out.println("in A display");
	}
}

public class AnynomusExample {

	public static void main(String[] args) {
		A obj = new A() {					//Anonymous class
							public void show()
							{
								System.out.println("over ridden");
							}
						};
						obj.show();
						obj.display();

	}

}
