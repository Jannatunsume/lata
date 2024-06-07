package abstractmethodexampletwo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b = new PNB();
		System.out.println("Rate of interest is:" + b.getReatOfInterest() + "%");
		b = new SBI();
		System.out.println("Rate of interest is:" + b.getReatOfInterest() + "%");

	}

}
