package runtimePolyMultilevelinheritance;

public class TestRunMultIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1, a2, a3;
		a1 = new Animal();
		a1.eat();
		a2 = new Dog();
		a2.eat();
		a3 = new Pup();
		a3.eat();
	}

}
