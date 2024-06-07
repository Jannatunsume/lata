package date;

import java.time.Duration;

public class DurationExample {

	public static void main(String[] args) {
		Duration duration = Duration.ofHours(5).plusMinutes(30);
		System.out.println(duration);
	}

}
