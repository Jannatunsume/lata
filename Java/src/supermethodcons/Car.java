package supermethodcons;

public class Car extends Vehicle {
	int gear;

	Car(String n, double w, int g) {
		super(n, w);
		gear = g;
	}

	void disply() {
		System.out.println("car name: " + name);
		System.out.println("car weight: " + weight);
		System.out.println("car gear: " + gear);
	}

}
