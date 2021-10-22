// if a developer dont want anybody of create obj to a particular class,
// then the key word "abstract" should be added before the class
abstract class Human //abstract class
{
	public abstract void eat(); //we can declare methods only as abstract, and only in abstract class
	
	public void walk(Number i)	
	{
		System.out.println(i);
	}
}
class Man extends Human
{
	public void eat() //its mandatory to define declared abstract method 
					  //here coz, if not this will also become abstract class
					// and throws error
	{
		System.out.println("Man is Omnivourous");
	}
}
class Woman
{
	
}
public class AbstrDemo {

	public static void main(String[] args) {
		
		Human obj = new Man();
		obj.eat();
		obj.walk(9.54);
		
	}

}
