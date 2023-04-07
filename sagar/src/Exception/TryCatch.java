package Exception;

public class TryCatch {
	
	 
	 public static void main(String[] args) throws InterruptedException{
		         int a = 50;
				 int b = 0;
				 int c = 0;
				 int d[] = {12,15,14,16,18,14};
				 
				 try {
					 
				 
				// System.out.println("Risky code"); //= invalid code
				 System.out.println(d[7]);
				 c=a/b;
				 
						
				 
				 }
				
				catch (ArithmeticException e) {
				b=5;
				c=a/b;
				System.out.println("alternative ocde");
				
				 }
				 
				 

					catch (ArrayIndexOutOfBoundsException e) {
					
				 
					System.out.println("alternative ocde of array");
					
					 try {
						 
						 
						 System.out.println("Risky code"); //= invalid code
						 
						 c=a/b;
						 System.out.println(d[7]);
						 }
						
						catch (ArithmeticException e1) {
						b=5;
						c=a/b;
						System.out.println("alternative ocde");
						
					System.out.println(d[2]);
						}
					}
				 
				 System.out.println(c);
				 
				 
	

}
}
}




	 
