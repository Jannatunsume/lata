package supermethod;

class Animal {
	public void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {

	public void eat() {
		System.out.println("eating bread");
	}

	void bark() {
		System.out.println("barking");

	}

	void work() {
		super.eat();
		bark();
	}
}

class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.work();

	}
}
