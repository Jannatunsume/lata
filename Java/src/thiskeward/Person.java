package thiskeward;

public class Person {
	String name;
	int age;
	String hearcolor;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	Person(String name, int age,String hearcolor ) {
	
		this(name,age);
		this.hearcolor=hearcolor;}
	
	void display() {
		System.out.println("Person name:" + name);
		System.out.println("Person age:" + age);
		System.out.println("Person hearcolor:"+hearcolor);
	}
}
