package Ass12Que2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Ass12Que1.Student;

public class Main {
	
	public static void main(String[] args) {
		
		Map<String, String> hm = new HashMap<>();
		
		hm.put("Maharastra","Mumbai");
		hm.put("Assam","Dispur");
		hm.put("Rajasthan","Jaipur");
		hm.put("Telengana","Hydrabad");
		hm.put("Bihar","Patna");
		
		
		System.out.println("Indian States And their Capitals");
		System.out.println("---------------------------------");
		
		Set<Map.Entry<String,String>> keyValue= hm.entrySet();
		
		for(Map.Entry<String,String> me: keyValue)
		{
			System.out.println(me.getKey()+"======"+me.getValue());
		}
	}
}


