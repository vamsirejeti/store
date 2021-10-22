import java.util.*;
class Outer
{
	public void show()
	{
		
	}
	static class Inner
	{
		public void display(int x)
		{
			int y = x;
			if (y>=4){
			System.out.println("In Display");}
		}
		
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display(800);

	}

}
