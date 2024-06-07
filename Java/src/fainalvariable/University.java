package fainalvariable;

public class University {

	final String universityname = "LU";
	// final int fees;
	static final int fees;// blank final variable

	//University() {
	//	fees = 3800;
	//}

	static {
		fees = 38000;

	}

	void display() {
		System.out.println(universityname);
		System.out.println(fees);
	}
}
