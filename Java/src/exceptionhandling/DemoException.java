package exceptionhandling;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b = 0;

			int result = a / b;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Exception: " + e1);
		} catch (Exception e2) {
			System.out.println("Exception: " + e2);
		} finally {
			System.out.println("last line of this code");
		}
	}
}
