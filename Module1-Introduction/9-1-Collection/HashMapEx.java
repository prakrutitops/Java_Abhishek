import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		
		HashMap<String,String> map = new HashMap<>();
		
		map.put("A","1");
		map.put("B","2");
		map.put("C","3");
		map.put("D","4");
		
		System.out.println(map);
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		
		
	}
}
