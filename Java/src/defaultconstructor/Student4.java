package defaultconstructor;

public class Student4 {
	int id;
	String name;

	Student4(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id +  " \t  "  + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 s1 = new Student4(111, "khan");
		Student4 s2 = new Student4(100, "bhan");
		Student4 s3 = new Student4(122, "hhan");
		Student4 s4 = new Student4(113, "dhan");

		s1.display();
		s2.display();
		s3.display();
		s4.display();

	}
}