package treeset;
import java.util.*;
import java.util.ArrayList;
public class TreeSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrlist = new ArrayList<String>();  
		arrlist.add("hi");  
		arrlist.add("vegi");  
		arrlist.add("aravind");  
		arrlist.add("chowdary");  
		arrlist.add("how r u ");  
		System.out.println(arrlist);   


		ListIterator<String> iterator = arrlist.listIterator(3);
		while (iterator.hasNext())
		{  
			String i = iterator.next();  
			System.out.println(i);  
		}  

	}
}

