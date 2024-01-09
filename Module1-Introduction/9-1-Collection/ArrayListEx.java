import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		
		ArrayList <String> arrayList = new ArrayList<>();
		
		arrayList.add("Android");
		arrayList.add("Java");
		arrayList.add("Php");
		arrayList.add("Ios");
		arrayList.add("Spring");
		
		ArrayList <String> arrayList2 = new ArrayList<>();
		
		arrayList2.add("Flutter");
		arrayList2.add("React");
		arrayList2.add("Spring");
		
		
		//System.out.println(arrayList);
		
		//Interface - Iterator
		
		//arrayList.addAll(arrayList2);
		//arrayList.remove("Java");
		//arrayList.removeAll(arrayList2);
		
		arrayList.retainAll(arrayList2);
		
		
		Iterator i = arrayList.iterator();
		
		//hashNext() method will call next value
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}
