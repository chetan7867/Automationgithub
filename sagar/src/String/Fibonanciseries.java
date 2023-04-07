package String;

public class Fibonanciseries {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 45;
		
		int total = 12;
				
				int c ;
		System.out.print(a+" "+b);
		
		for(int i =2 ; i<total;i--) {
			
			c=a+b;
			System.out.print("   "+c);
			
			a=b;
			b=c;
		}

	}

}
