interface Demo
{
	default public void show()
	{
		System.out.println("in Demo Show");
	}
}
interface MyDemo
{
	default public void show()
	{
		System.out.println("in MyDemo Show");
	}
}
class DemoImp implements MyDemo,Demo
{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		MyDemo.super.show();
	}
	
}
public class MultiInherit {

	public static void main(String[] args) {
		
		Demo obj = new DemoImp();
		obj.show();
	}

}