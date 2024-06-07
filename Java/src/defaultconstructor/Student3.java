package defaultconstructor;

public class Student3 {

	String name;
	int id;

	void information(String n, int i) {
		name = n;
		id = i;

	}

	void college() {
		System.out.println("college name is: MIT");

	}

	void display() {
		System.out.println(id + "\t" + name);
		System.out.println("student is created");
		System.out.println("\t");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		Student3 s3 = new Student3();
		Student3 s4 = new Student3();
		Student3 s5 = new Student3();
		Student3 s6 = new Student3();
		Student3 s7 = new Student3();
		
		s1.college();
		s1.information("lalu", 2154);
		s1.display();
		
		s2.college();
		s2.information("halu", 1122);
		s2.display();
		
		s3.college();
		s3.information("balu", 2233);
		s3.display();
		
		s4.college();
		s4.information("kalu", 3344);
		s4.display();
		
		s5.college();
		s5.information("Salu", 4455);
		s5.display();
		
		s6.college();
		s6.information("galu", 5566);
		s6.display();
		
		s7.college();
		s7.information("tulu", 6655);
		s7.display();
		
	}
}
