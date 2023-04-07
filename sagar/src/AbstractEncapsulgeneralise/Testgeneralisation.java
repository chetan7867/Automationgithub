package AbstractEncapsulgeneralise;

public class Testgeneralisation {
	
	public static void main (String[] args) {
		System.out.println("***********Speciacation of  vodafone************");
		
		vodafone x = new vodafone ();
		x.audiocall();
		x.textsms();
		x.internet();
		
		System.out.println("***********Speciacation of  uninor************");
		
		uninor y = new uninor ();
		x.audiocall();
		x.textsms();
		x.internet();
		
		System.out.println("***********Speciacation of docomo************");
		
		
		docomo z = new docomo ();
		x.audiocall();
		x.textsms();
		x.internet();
		
	}

}
