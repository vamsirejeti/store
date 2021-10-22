//if we want to call method from interface we can use "static" key word
//for the method
interface Dem
{
	int num = 9; // a variable in interface is constant even though we dont
	             // mention "final" keyword
	void abc();
	static void show()
	{
		System.out.println("hi");
	}
}
class DemImp implements Dem
{
	public void abc()
	{
		System.out.println("hey");
	}
}
public class StatInterfaceDemo {

	public static void main(String[] args) {
		Dem.show();

	}

}
