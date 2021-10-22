class A
{
	final int x=100; // the value of 'x' cannot be changed
	public final void show() // cannot override show method
	{
		System.out.println("in A show");
	}
	
}
class B extends A
{
	public void display()
	{
		System.out.println("in B display");
	}
}
final class C // cannot extend class c
{
	
}
public class FinalDemo {

	public static void main(String[] args) {
		

	}

}
