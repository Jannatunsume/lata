package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
		String currentdate = dateFormat.format(date);
		System.out.println("Currentdate: " + currentdate);
	}
}