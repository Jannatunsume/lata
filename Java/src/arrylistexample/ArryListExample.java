package arrylistexample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number = new ArrayList<Integer>();
		System.out.println(number.size());
		// adding number
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(50);
		number.add(40);
number.add(5, 70);


		// for(int x:number) {
		// System.out.print(" "+x);
		// }

		Iterator<Integer> itr = number.iterator();
		while (itr.hasNext()) {
			System.out.println(" " + itr.next());
		}

		// System.out.println();
		System.out.println(number);

		System.out.println("Array size: " + number.size());

		int i=number.get(0);
		System.out.println("0 indix valu is: "+i);
		
		number.set(0, 80);
		System.out.println(number);
		
		boolean con=number.contains(40);
		System.out.println("This array contains 40: "+con);
		
		int pos=number.indexOf(50);
		System.out.println("Number index of 50 is: "+pos);
		
		number.remove(2);
		System.out.println("After removing Array contains:" + number);

		boolean b = number.isEmpty();
		System.out.println("*****:" + b);

		number.removeAll(number);
		System.out.println("After removing all: " + number);

		number.clear();
		System.out.println("After clear: " + number);
	}

}
