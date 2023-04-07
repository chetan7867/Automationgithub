package Interface;

public class Test implements Demo {
	public void test() {
		System.out.println("Test method");
	}
	public void addition() {
		int x = 10;
		int y =20;
		int z = x+y;
		System.out.println(z);
		
	}
	/*public void multiplication() {
		int a = 30;
		int b= 15;
		int c= a*b;
		System.out.println(c);
	}*/
	public static void main ( String[] args) {
	Test x = new Test();
	x.addition();
	x.test();
	
	System.out.println(x.a);
	System.out.println(x.b);
	}
	

		
	}


