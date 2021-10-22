@FunctionalInterface 
interface Abc
{
	void show();//Functional Interface will only have one abstract method
}
public class AnonymousInterface {

	public static void main(String[] args) {
		
		Abc obj = () -> System.out.println("Im the best"); // Lamda expression
//		new Abc() {
//			public void show()
//			{
//				System.out.println("Im the best");
//			}
//		}; this entire code can be represented as above
		obj.show();

	}

}
