package runtimePolymorphism2;

public class TestPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		s.draw();
		// upcasting
		s = new Rectangle();
		s.draw();//Dynamic
		s = new Circle();
		s.draw();//Dynamic
		s = new Triangle();
		s.draw();//Dynamic

	}

}
