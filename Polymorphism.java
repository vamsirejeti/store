class Bird
{
	public void sing()
	{
		System.out.println("kook kook kook");
	}
}
class Crow extends Bird
{
	public void sing()
	{
		System.out.println("kaaw kaaw");
	}
}
class Sparow extends Bird
{
	public void sing()
	{
		//super.sing();
		System.out.println("twiddlee");
	}
	public void fly()
	{
		System.out.println("can fly at 500 mts high");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Bird b = new Crow();
		b.sing();
		b = new Sparow();
		b.sing();
	}

}
