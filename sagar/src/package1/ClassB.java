package package1;

public class ClassB {
public static void main (String[] args)	{
	ClassA z= new ClassA();
	
	System.out.println(z.a);//calling variable with public access specifier
	//System.out.println(z.b);
	System.out.println(z.c);//calling variable with protected access specifier
	System.out.println(z.d);//calling variable default public access specifier
}

}
