package Collection;

import java.util.HashSet;

public class HashsetChar {
	
public static void main(String[] args) {
	
	
       
		
		HashSet<Character> set = new HashSet<Character>();
		
		set.add('@');
		set.add('$');
		set.add('#');
		set.add('*');
		set.add('%');
		set.add(null);
		
		System.out.println(set);
		
		for (Object f : set) {
			System.out.println(f);
		}

}
}
