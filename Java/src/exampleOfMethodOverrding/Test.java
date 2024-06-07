package exampleOfMethodOverrding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI rate of intarest:" + s.getReatOfInterest());
		System.out.println("ICICI rate of intarest:" + i.getReatOfInterest());
		System.out.println("AXIS rate of intarest:" + a.getReatOfInterest());
	}

}
