package objectcreat;

public class Teacher {

	String name;
	String gender;
	int phone;
	
	
	void setinformation(String n,String m,int ph) {
		name=n;
		gender=m;
		phone=ph;
	}

	void displayinformation() {
		System.out.println("name:" + name);
		System.out.println("name:" + gender);
		System.out.println("name:" + phone);
		System.out.println("\n");
		

	}

}
