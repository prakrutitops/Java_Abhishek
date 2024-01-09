import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		
		Vector v = new Vector<>(5);
		
		v.add("Android");
		v.add("Java");
		v.add("Php");
		v.add("Java");
		v.add("Php");
		v.add("Php");
		v.add("Php");
		v.add("Java");
		v.add("Php");
		v.add("Php");
		v.add("Php");
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.contains("Php"));
		//if() ? "true" != null :"false";
		
		String res = (v.contains("Php")) ? ("true") : ("false");
		System.out.println(res);
		
		
//		if(v.contains("Php"))
//		{
//			System.out.println("true");
//		}
//		else
//		{
//			System.out.println("false");
//		}
//		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		
		
		
	}
}
