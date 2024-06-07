package abstraction;

public class Rettangle extends Shape {

	Rettangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	void area() {
		double result = dim1 * dim2;
		System.out.println("Rettangle area: " + result);
	}

}
