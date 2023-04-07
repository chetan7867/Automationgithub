package Polymorphism;

public class Riding2 extends Riding { 
	public void Statement() {
		System.out.println("method from sub class is running");
	
	}
    public static void main(String[] args) {
    	Riding2 x =  new Riding2();
    	x.Statement();
    	Riding y = new Riding2();
    	y.Statement();
    	
    }
}
