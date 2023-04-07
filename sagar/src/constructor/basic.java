package constructor;

public  class basic {
int a;
int b;
int m;
String name;
String Velocity;
basic () {

	a=50;
	b=50;
}
basic (int c, int d){
	a=c;
	b=d;	
}
basic (int c,int d,int i){
	a=c;
	b=d;
	m=i;
}
public  void addition () {
	System.out.println(m+a+b);
}

public static void main(String [] args) {
	basic x = new basic ();
	x.addition();
	x.addition();
	
}
}