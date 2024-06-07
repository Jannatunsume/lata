package collection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> mymap = new LinkedHashMap<Integer, String>();

		mymap.put(11, "kamal");
		mymap.put(22, "kalam");
		mymap.put(12, "samal");
		mymap.put(23, "balam");
		mymap.put(14, "gamal");
		mymap.put(25, "aalam");
		
		System.out.println(mymap.get(11));

		System.out.println(mymap);
		for (Integer key : mymap.keySet()) {
			System.out.println("Key: " + key + ", Value: " + mymap.get(key));
		}
	}

}
