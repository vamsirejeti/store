
public class WrapperDemo {

	public static void main(String[] args) {
		int i =5; //primitive data type
		
		Integer ii = new Integer(i); //Boxing -  Wrapping 
		int j = ii.intValue(); // Unboxing - unwrapping
		
		Integer value = i; //auto boxing
		int k = value; // auto unboxing
		
		String str = "123.7";
		Float n = Float.parseFloat(str);
		System.out.println(n);
	}

}
