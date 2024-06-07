package arrylistexample;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(-5);
		number.add(78);
		number.add(1);
		number.add(0);
		number.add(50);
		System.out.println("Before sorting number is: "+number);
		Collections.sort(number);
		System.out.println("After sorting ascending number is: "+number);
		
		Collections.sort(number,Collections.reverseOrder());
		System.out.println("After sorting descending number is: "+number);
		
	}

}
