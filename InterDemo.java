interface Demo //in Functional interface we only have one
			   //Abstract method, we can add methods by adding
			   // "default" key word before the method
{
	void abc();
	default public void show()
	{
		System.out.println("in Demo Show");
	}
	default public void command()
	{
		System.out.println("command ");
	}
} 
class DemoImp implements Demo
{
	public void abc()
	{
		System.out.println("in abc");
	}
	public void show()
	{
		System.out.println("overridden!!");
	}
}

public class InterDemo {

	public static void main(String[] args) {
		
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();
		obj.command();
		

	}

}
