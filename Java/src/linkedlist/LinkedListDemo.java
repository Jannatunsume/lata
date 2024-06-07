package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> name = new LinkedList<String>();

		name.add("nana");
		name.add("nane");
		name.add("khala");
		name.add("mama");
		name.add("mame");
		name.add(5, "khalu");

		name.addFirst("bula");
		name.addLast("dula");

		System.out.println(name.size());
		System.out.println(name);

		// name.remove(0);
		// name.removeFirst();
		// name.removeLast();
		// name.removeAll(name);

		for (String N : name) {
			System.out.println(N);
		}

		System.out.println("First: " + name.getFirst());
		System.out.println("Last: " + name.getLast());
		name.clear();
		System.out.println(name);
	}

}
