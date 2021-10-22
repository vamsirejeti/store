class Details
    {
		int eid,salary,level;
		static String prj;
		String manager;
		String tl;
		static String ceo;
	public Details()
	{
		eid = 100;
		salary = 70000;
		level =13;
		manager = "Kiran";
		tl = "Hari";
		System.out.println("const");
	}
	public Details(int x)
	{
		eid = 200;
		salary = 80000;
		level =12;
		manager = "Rambabu";
		tl = "Ajay";
//		System.out.println(eid+":"+salary+":"+level+":"+prj+":"+manager+":"+tl+":"+ceo);
	}
		static 
		{
			ceo = "Sundar";
			prj = "Trust and Safety";
			System.out.println("Stat");
		}
		public void show()
		{
			System.out.println(eid+":"+salary+":"+level+":"+prj+":"+manager+":"+tl+":"+ceo);
		}
	}

public class empDetails {

	public static void main(String[] args) 
	{
		Details vamsi = new Details();
		Details bhagi = new Details(5);
		Details vijaya = new Details();
//		vamsi.eid = 11070010;
//		vamsi.salary = 70000;
//		vamsi.level = 13;
//		vamsi.manager = "Kiran";
//		vamsi.tl = "Hari";
		vamsi.show();
		//bhagi.Details(5);
		System.out.println(bhagi.eid+":"+bhagi.salary+":"+bhagi.level+":"+Details.prj+":"+bhagi.manager+":"+bhagi.tl+":"+Details.ceo);
		vijaya.show();
	}

}
