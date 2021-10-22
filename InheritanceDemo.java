class Calculator
	{
		public int add(int ... i)
		{
			int sum=0;
			for (int k:i)
			{
				sum = sum+k;
			}
			return sum;
		}
	}
class ClacAdv extends Calculator
	{
		public int sub(int i, int j)
		{ 
			return i-j;
		}
	}
public class InheritanceDemo {

	public static void main(String[] args) {
		
		ClacAdv obj =new ClacAdv();
		
		System.out.println(obj.add(4,5));
		System.out.println(obj.sub(10,5));

	}

}
