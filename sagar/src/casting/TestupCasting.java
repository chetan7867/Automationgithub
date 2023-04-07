package casting;

public class TestupCasting {
	
	public static void main (String[] args) {
		
		System.out.println("********Super class method*********");
		
		upcasting x = new upcasting ();
		x.demo();
		x.set();
		x.Staticcast();
		
		System.out.println("********Sub class method*********");
		
		Upcastin y = new Upcastin();
		y.demo();
		y.set();
		y.Subclass();
		y.Staticcast();
		
		System.out.println("********casting method*********");
		
		upcasting z = new Upcastin();
		
		z.demo();
		z.set();
		z.Staticcast();
		
		
	}
}


