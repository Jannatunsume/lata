package exceptionhandling;

public class DemoException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[5];
			a[5] = 40;
			System.out.println(a[5]);
		} catch (ArithmeticException e1) {
			System.out.println(e1);
		} catch (Exception e2) {
			System.out.println(e2);
		} finally {
			System.out.println("Bangladesh is my country.");
		}
	}
}
