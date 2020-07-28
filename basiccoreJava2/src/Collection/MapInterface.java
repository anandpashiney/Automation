package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {


		Map<String,String> map = new Hashtable<>();
		
		map.put("name", "anand bhayre");
		
		map.put("email", "anandbhayre2007@gmail.com");
		
		map.put(null, "jhjhjh");
		
		
		System.out.println(map.get("name"));
		
		System.out.println(map.get("email"));

		
	}

}
