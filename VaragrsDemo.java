class Calc
	{
		public int add(int ... i)
		{
			int sum=0;
			for (int x : i)
			{
				sum = sum + x;
			}
			return sum;
		}
		public void name(String ... n)
		{
			for (String x : n) {
				System.out.println(x);
			}
		}
	}
public class VaragrsDemo {

	public static void main(String[] args) {
		Calc obj = new Calc();
		Calc obj1 = new Calc();
		System.out.println(obj.add(4,5,6,7));
		System.out.println(obj1.add(1,2,3,4));
		obj.name("vamsi","Bhagi","Bujji","Nani");
	}

}
