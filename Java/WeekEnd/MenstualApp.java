import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualFlowCalculator {
public static String[] months = {
	"january", "february", "march", "april", "may", "june",
        "july", "august", "september", "october", "november", "december"
    };


public static int getMonthNumber(String monthName) {
monthName = monthName.toLowerCase().trim();
	for (int row = 0; row < months.length; row++) {
		if (months[row].equals(monthName)) {
			return row + 1;
		}
	}
	return 0;
}


public static void calculateMenstrualFlow(int day, String month) {
	int monthNumber = getMonthNumber(month);
		if (monthNumber == 0) {
			System.out.println("Invalid month.");
		return;
}
int currentYear = LocalDate.now().getYear();
        LocalDate startDate = LocalDate.of(currentYear, monthNumber, day);

LocalDate menstrualEnd = startDate.plusDays(3);
LocalDate dangerDate = menstrualEnd.plusDays(3);

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
System.out.println("\nYour flow will run till " + menstrualEnd.format(formatter));
System.out.println("\nYour dangerous date ends on " + dangerDate.format(formatter));

}



public static void getOvulationPeriod(int day, String month) {
int monthNumber = getMonthNumber(month);
	if (monthNumber == 0) {
		System.out.println("Invalid month.");
		return;
}
int currentYear = LocalDate.now().getYear();
int ovulationStartDay = day + 14;
LocalDate ovulationStart = LocalDate.of(currentYear, monthNumber, 1).plusDays(ovulationStartDay - 1);
LocalDate ovulationEnd = ovulationStart.plusDays(7);


DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
	System.out.println("\nYour ovulation period starts on " + ovulationStart.format(formatter));
	System.out.println("\nYour ovulation period ends on " + ovulationEnd.format(formatter));
}



public static void calculateSafeDays(int day, String month) {
int monthNumber = getMonthNumber(month);
	if (monthNumber == -1) {
		System.out.println("\nInvalid month.");
	return;
}
int currentYear = LocalDate.now().getYear();
int safeStartDay = day + 1;
LocalDate safeStart = LocalDate.of(currentYear, monthNumber, 1).plusDays(safeStartDay - 1);
LocalDate safeEnd = safeStart.plusDays(14);

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
	System.out.println("\nYour safe period starts on " + safeStart.format(formatter));
	System.out.println("\nYour safe period ends on" + safeEnd.format(formatter));
}





public static void main(String[] args) {
Scanner input = new Scanner(System.in);
while (true) {
System.out.println("""
WELCOME TO YOUR MENSTRUAL FLOW CALCULATOR

Note: This will be accurate if your circle is 28days.
just dey remove 1 day if na 27 days be your own...else your are good to go!!.

1 -> Calculate your menstrual flow date
2 -> Calculate your safe days
3 -> Calculate your ovulation period
0 -> Exit

	""");

System.out.print("Which one will you love to calculate:  ");
String choice = input.next();
switch (choice) {
	case "1":
		System.out.print("Enter your menstruation start day (e.g. 20):   ");
		int newDay = input.nextInt();

		System.out.print("\nEnter the month (e.g. January):   ");
		String newMonth = input.next();
		
		calculateMenstrualFlow(newDay, newMonth);
		break;
	
	case "2":
		System.out.print("Enter your dangerous day end date (e.g. 20):   ");
		int newDay2 = input.nextInt();

		System.out.print("\nEnter the month (e.g. January):   ");
		String newMonth2 = input.next();

		calculateSafeDays(newDay2, newMonth2);
		break;


	case "3":
		System.out.print("Enter your dangerous day end date (e.g. 20):   ");
		int newDay3 = input.nextInt();
		System.out.print("\nEnter the month (e.g. January):   ");
		String newMonth3 = input.next();

		getOvulationPeriod(newDay3, newMonth3);
		break;


	case "0":
		System.out.println("\n\nEnjoy yourself if you're a fine girl, else\n\n");
		return;

	default : System.out.println("Invalid option.");
            }
        }
    }
}
