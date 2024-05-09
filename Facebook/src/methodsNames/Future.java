package methodsNames;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class Future {

	public static void main(String[] args) {
		// Get the current system date and time
		LocalDateTime currentDateTime = LocalDateTime.now();

		// Add or subtract time
		LocalDateTime futureDateTime = currentDateTime.plusDays(7); // Add 7 days
		LocalDateTime pastDateTime = currentDateTime.minusHours(3); // Subtract 3 hours

		// Calculate duration between two dates
		long hoursBetween = ChronoUnit.HOURS.between(pastDateTime, futureDateTime);

		System.out.println("Future Date and Time: " + futureDateTime);
		System.out.println("Past Date and Time: " + pastDateTime);
		System.out.println("Hours Between: " + hoursBetween);


	}

}
