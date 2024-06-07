package superConstructer2;

 class Test1 {
	public Test1() {
		System.out.println("animal is created");
	}

	public Test1(int a) {
		System.out.println("parent a:" + a);
	}
}

class Dog2 extends Test1 {
	public Dog2() {
		super();
		System.out.println("dog is created");
	}

	public Dog2(int a) {
		super(20);
		System.out.println("child a:" + a);
	}
}

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d = new Dog2();
		Dog2 dd = new Dog2(10);

	}

}
