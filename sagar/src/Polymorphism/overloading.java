package Polymorphism;

public class overloading {
	public void addition (int a, int b) {
		System.out.println(a+b);
		
	}
public static void addition (int a,int b, int c) {
	System.out.println(a+b+c);
	
}

public static void main (String[] args) {
	overloading x = new overloading ();
	x.addition(20,50);
	x.addition(20,76,40);
	
}
}
