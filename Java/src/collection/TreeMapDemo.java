package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> mymap = new TreeMap<String, Integer>();
		mymap.put("kalam", 101);
		mymap.put("salam", 201);
		mymap.put("balam", 301);
		mymap.put("jalam", 401);
		mymap.put("dalam", 501);

		System.out.println(mymap);

		System.out.println(mymap.get("kalam"));
		System.out.println(mymap.get("salam"));
		System.out.println(mymap.get("balam"));
		System.out.println(mymap.get("jalam"));
		System.out.println(mymap.get("dalam"));

		Set myset = mymap.entrySet();
		System.out.println(myset);
		
		
		Iterator<Integer> itr = myset.iterator();
		while (itr.hasNext()) {
			System.out.println("Valu: " + itr.next());
		}
	}

}
