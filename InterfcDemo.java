interface Writer
{
	void write(); //by default methods in interface are abstract methods
				  //no need to add "public interface"
}
class Book 
{
	public void withPen()
	{
		System.out.println("book pen");
	}
	public void withPencil()
	{
		System.out.println("book pencil");
	}
}
class Pen extends Book implements Writer
{
	public void write()
	{
		System.out.println("Im a Pen");
	}
}
class Pencil extends Book implements Writer
{
	public void write()
	{
		System.out.println("Im a Pencil");
	}
}
class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}
public class InterfcDemo {

	public static void main(String[] args) {
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		k.doSomething(p);
		Book bk = new Pen();
		bk.withPen();

	}

}
