package methodsNames;

import java.time.LocalDateTime;
import java.util.Date;

public class GetDateAndTime {

	public static void main(String[] args) {
		// Get the current system date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + currentDateTime);

		System.out.println("=============");

		Date currentDateAndTime = new Date();
		System.out.println("Current Date and Time: " + currentDateAndTime);
	}

}
