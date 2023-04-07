package Collection;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Table {

	public static void main(String[] args) {
		
		
		Hashtable<Integer,String> Table = new Hashtable<Integer,String>();
		Table.put(13,"Nashik");
		Table.put(12,"Solapur");
		Table.put(15,null);
		Table.put(13,null);
		Table.put(44,"Nampur");
		Table.put(24,"delhi");
		Table.put(245,"nagpur");//manger do this
		
		for (Map.Entry<Integer,String> f: Table.entrySet()) {
			
			System.out.println("Key" + f.getKey() + "Value=" + f.getValue() );
		}

	}

}
