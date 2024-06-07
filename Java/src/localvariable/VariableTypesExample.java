package localvariable;

public class VariableTypesExample {
	// instance variable
	int abc = 100;
	// static variable
	static int temp = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableTypesExample va = new VariableTypesExample();
		va.localvar();
		va.localvar2();
		statVar1();
		statVar2();
	}

	private static void statVar2() {
		// TODO Auto-generated method stub

	}

	private static void statVar1() {
		// TODO Auto-generated method stub

	}

	public void localvar() {
		// local variable
		int a = 10;
		System.out.println(a);
		System.out.println(abc + a);
	}

	public void localvar2() {
		// local variable
		int a = 20;
		System.out.println(a);
		System.out.println(abc + 100+a);

	}
}
