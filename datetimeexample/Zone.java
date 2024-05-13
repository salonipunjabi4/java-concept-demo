package datetimeexample;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zone {
	//Function to get zoned date and time
	public static void ZonedTimeAndDate() {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedCurrentDate = date.format(format1);
		
		//to get the current zone
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("The current zone is " + currentZone.getZone());
		
		//getting time zone of specific place
		//we use wuthZoneSameInstant(): it is used to return a copy of this date-time
		//with a different time-zone,
		//retaining the instant
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		
		ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
		
		System.out.println("Tokyo time zone is " + tokyoZone);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = tokyoZone.format(format);
		System.out.println("Formatted tokyo time zone " + formatedDateTime);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
