package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashmap {
	
public static void main(String[] args) {
		
		
		HashMap<Integer,String> Table = new HashMap<Integer,String>();
		Table.put(13,"Nashik");
		Table.put(null,"Solapur");
		Table.put(15,null);
		Table.put(13,null);
		Table.put(44,"Nampur");
		Table.put(24,"delhi");
		
		for (Map.Entry<Integer,String> f: Table.entrySet()) {
			
			System.out.println("Key" + f.getKey() + "Value=" + f.getValue() );
		}

	}

}



