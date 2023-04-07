package Collection;

public class Generics1<D> {
	
	int G;
	D c;

	public static void main(String[] args) {
		
		Generics1<Integer> x = new Generics1<Integer>();
		x.G = 52;
		
		x.c=23;
		System.out.println(x.c);
		
		Generics1<String> y = new Generics1 <String>();
		
		y.c="Roller";
		System.out.println(y.c);
		
		


	}

}
