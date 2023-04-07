package package2;

import package1.ClassA;

public class ClassD extends ClassA {



	public static void main(String[] args) {
		ClassD x = new ClassD ();
		System.out.println(x.a);//public
		System.out.println(x.b);//protected

	}
}

