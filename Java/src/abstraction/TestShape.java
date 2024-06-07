package abstraction;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s = new Rettangle(10, 20);
		s.area();
		s = new Tryangle(10, 20);
		s.area();
		s = new Circle(10);
		s.area();

	}

}
