package date;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zoneid = ZoneId.of("Asia/Dhaka");
		System.out.println("Zoneid for bangladesh:" + zoneid);
		Set<String> zoneids = ZoneId.getAvailableZoneIds();
		System.out.println("\nAll Available Zone Ids:");
		for (String id : zoneids) {
			System.out.println(id);
		}
	}
}
