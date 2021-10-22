
public class ArrayDemo {

	public static void main(String[] args) {
//		int a[] = {1,2,3,4};
//		int b[] = {5,6,7,8};
//		int c[] = {9,10,11,12};
		
		int d[][] = {
						{1,2,3,4},
						{5,6,7},
						{9,10,11,12,14,13}
					};
		//System.out.println(d.length);
		for (int i=0;i<d.length;i++)
		{
//			System.out.println(d[i].length);
			for (int j=0;j<d[i].length;j++)
			{
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int k[]:d)
		{
			for(int l:k)
			{
				System.out.print(" "+l);
			}
			System.out.println();
		}
	}

}
