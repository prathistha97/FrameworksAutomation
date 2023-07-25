package jul25th;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Map<String, String> hMap=new HashMap<String, String>();
		
		hMap.put("Tester", "Ravi");
		hMap.put("Developer", "Sam");
		hMap.put("Business Analyst", "Sai");
		
		System.out.println(hMap);
		
		Set<Entry<String, String>>  allEntries=hMap.entrySet();
		
		for(Entry<String, String>  temp:allEntries)
		{
			
			System.out.println(temp.getKey()+"---"+temp.getValue());
		}
		

	}

}
