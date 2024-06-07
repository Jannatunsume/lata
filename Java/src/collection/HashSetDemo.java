package collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> furitsName = new HashSet<String>();

		furitsName.add("Apple");
		furitsName.add("Orange");
		furitsName.add("Mango");
		furitsName.add("Melon");
		furitsName.add("Hunnydue");
		furitsName.add("Strwberry");
		
		furitsName.remove("Apple");
		System.out.println(furitsName);
		System.out.println(furitsName.size());

		furitsName.clear();
		System.out.println(furitsName);

		boolean b = furitsName.isEmpty();
		System.out.println(b);
	}

}
