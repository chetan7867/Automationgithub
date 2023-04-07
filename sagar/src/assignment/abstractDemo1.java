package assignment;

public class abstractDemo1 {
	
	public void show()
	{
		System.out.println("show method is running from abstractdemo cladss ");
	
	}
	
	public void demo()
	{
		System.out.println ("Demo Method is running from sub class ");
	}
	
	public void test ()
	{
	System.out.println("method is running from abstractdemo class");
	}
	
	public static void main (String [] args)
	{
		abstractDemo1 x = new   abstractDemo1 ();
		x.show();
		x.demo();
		x.test();
	}

	
	}
	
	


