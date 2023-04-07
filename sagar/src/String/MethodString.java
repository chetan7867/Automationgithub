package String;

public class MethodString {

	public static void main(String[] args) {
		
	    String s1 = "chetan";
		String s2 ="Meyur";
		String s3 = "Yogesh";
	
		System.out.println(s1.charAt(4));
		System.out.println(s1.replace("c","a"));
		System.out.println(s3.isEmpty());
		System.out.println(s2.concat(s3));
		
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		String[] result=s1.split("t");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
