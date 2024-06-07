package list;

import java.util.LinkedList;

public class StudentListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Student> list = new LinkedList<Student>();

		Student s1 = new Student(101, "Karim", "Eleven");
		Student s2 = new Student(102, "Rarim", "Eleven");
		Student s3 = new Student(103, "Jamal", "Eleven");
		Student s4 = new Student(104, "Kamal", "Eleven");

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		for (Student s : list) {
			System.out.println(s.id + " " + s.name + " " + s.className);
		}
	}
}