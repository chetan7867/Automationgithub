package Polymorphism;

public class Overloading2 {
	public static void addition (int a,int b ) {
		System.out.println(a+b);
		
	}
 public static void addition (int a,int b, int c) {
	 System.out.println(a+b+c);
	 
 }
  public static void main (String[] args) {
	  overloading overloading = new overloading();
	overloading.addition(20, 30); // Calling with class name due to static method
	  overloading.addition(20,30,40);
  }
}
