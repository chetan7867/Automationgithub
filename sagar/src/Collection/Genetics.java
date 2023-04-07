package Collection;

public class Genetics <C>{
	
	int a;
	C b;

	public static void main(String[] args) {
		
		
		Genetics x = new Genetics();
		
		x.a = 50;
		System.out.println(x.a);
		

		
		x.b = 52;
		System.out.println(x.b);
		
		x.b = 53;
		System.out.println(x.b);
		
		x.b = 56.23f;
		System.out.println(x.b);

		x.b="sham";
	}

}
