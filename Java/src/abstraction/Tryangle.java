package abstraction;

public class Tryangle extends Shape {

	Tryangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	void area() {
		double result = 0.5*dim1 * dim2;
		System.out.println("Tryangle area: " + result);
	}

}
