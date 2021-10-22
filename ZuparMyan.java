class Vehicle
{
	int maxSpeed = 120;
	public void display()
	{
		System.out.println(maxSpeed);
	}
}
class Car extends Vehicle
{
	int maxSpeed = 100;
	public void display()
	{
		super.display();
		System.out.println(maxSpeed);
	}
}
class Bike extends Vehicle
{
	int maxSpeed = 80;
	public void display()
	{
		System.out.println(maxSpeed);
	}
	public void colour()
	{
		System.out.println("Black bike");
	}
}
public class ZuparMyan {

	public static void main(String[] args) {
		Vehicle c = new Car();
		c.display();
		c = new Bike();
		c.display();
		Bike d = new Bike();
		d.colour();

	}

}
