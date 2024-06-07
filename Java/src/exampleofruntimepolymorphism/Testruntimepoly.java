package exampleofruntimepolymorphism;

public class Testruntimepoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new SBI();
		System.out.println("SBI Rate Of Interest :" + b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI Rate Of Interest :" + b.getRateOfInterest());
		b = new AXIS();
		System.out.println("AXIS Rate Of Interest :" + b.getRateOfInterest());
	}

}
