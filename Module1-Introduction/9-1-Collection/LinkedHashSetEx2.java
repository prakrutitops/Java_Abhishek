import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetEx2 
{
	public static void main(String[] args) 
	{
		
		LinkedHashSet set = new LinkedHashSet<>();//hashvalue
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("c");
		set.add("e");
		set.add("1");
		set.add("2");
		set.add("4");
		set.add("3");
		set.add("5");
		set.add("2");
		
		System.out.println(set);
		
		
		
	}
}
