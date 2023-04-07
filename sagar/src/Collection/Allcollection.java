package Collection;

import java.util.HashMap;
import java.util.Map;

public class Allcollection {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap();
		map.put(12,"Automation");
		map.put(87, null);
		map.put(null,"SQL");
		map.put(32, null);
		
		for(Map.Entry<Integer, String> m : map.entrySet())	{
			
			System.out.println("key="+ m.getKey()  + "Value="+m.getValue());
					
		}
		System.out.println("****************");
		map.put(65, "abc");
		for(Map.Entry<Integer, String> m : map.entrySet())	{
			
			System.out.println("key="+ m.getKey()  + "Value="+m.getValue());
}
	}
}
	
