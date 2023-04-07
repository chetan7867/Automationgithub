package math;

public class Argument2 {

	public void Multiplication (int a, int b) {
	int c = a*b;
	System.out.println ("Mltiplication = " + c);
	}
	public static void addition () {
		int a =80;
		int b = 80;	
		int c =a+b;
		System.out.println(c);
	}
		public static void main (String[] args ) {
			addition ();
			
			Argument x = new Argument();
			
			x.Multiplication(20,10);
			x.Multiplication(10,12);
			x.Multiplication(25,10);

	}

}
