package String;

public class Pallindrome {

	public static void main(String[] args) {
		
		String a= "123";
		String reverse = "";
		
		for (int i=a.length()-1;i>=0;i--) {
			reverse = reverse + a.charAt(i);
		}
			System.out.println(reverse);
		
		if (a.equals(reverse)) {
			System.out.println("Given string is Pallindrome");
		}
		//else {
		//	System.out.println("Given string is not  Pallindrome");
		}
					
		}


	


