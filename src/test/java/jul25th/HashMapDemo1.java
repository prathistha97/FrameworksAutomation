package jul25th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hMap=new HashMap<Integer, String>();
		
		hMap.put(100, "Ravi");
		hMap.put(101, "Sam");
		hMap.put(102, "Sai");
		
		System.out.println(hMap);
		
		
		System.out.println(hMap.get(100));
		System.out.println(hMap.get(101));
		System.out.println(hMap.get(102));
		
		
		Set<Entry<Integer, String>>  allEntries=hMap.entrySet();
		
		for(Entry<Integer, String>  temp:allEntries)
		{
			
			System.out.println(temp.getKey()+"---"+temp.getValue());
		}
		
		Iterator<Entry<Integer, String>> it=allEntries.iterator();
		
		
		while(it.hasNext())
		{
			
			Entry<Integer, String> entry=it.next();
			
			System.out.println(entry.getKey()+"\t"+entry.getValue());
			
		}
		
		

	}

}
