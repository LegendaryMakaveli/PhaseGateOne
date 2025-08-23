import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstualApp {
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


public static String calculateMenstrualFlow(int day, String month) {
	int monthNumber = getMonthNumber(month);
		if (monthNumber == 0) {
return "Invalid month.";
}
int currentYear = LocalDate.now().getYear();
LocalDate startDate = LocalDate.of(currentYear, monthNumber, day);

LocalDate menstrualEnd = startDate.plusDays(3);
LocalDate dangerousDate = menstrualEnd.plusDays(3);

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
return "Your flow will run till " + menstrualEnd.format(formatter) +
           "\nYour dangerous date ends on " + dangerousDate.format(formatter) + 
           " if you have hmmm in-between this date....you fit don carry belle oo";
}






public static String getOvulationPeriod(int day, String month) {
	int monthNumber = getMonthNumber(month);
		if (monthNumber == 0) {
return "Invalid month.";
}

int ovulationStartDay = day + 14;
int currentYear = LocalDate.now().getYear();
LocalDate ovulationStart = LocalDate.of(currentYear, monthNumber, ovulationStartDay);

LocalDate ovulationEnd = ovulationStart.plusDays(7);

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
return "\nYour ovulation period starts on " + ovulationStart.format(formatter) +
           "\nYour ovulation period ends on " + ovulationEnd.format(formatter) + 
           " make sure you keep menstrual pad on you all day and nur try wear white\n\n\n\n\n";
}





public static String calculateSafeDays(int day, String month) {
    int monthNumber = getMonthNumber(month);
    if (monthNumber == 0) {  
return "Invalid month.";
}


int currentYear = LocalDate.now().getYear();
int safeStartDay = day;
LocalDate safeStart = LocalDate.of(currentYear, monthNumber, safeStartDay);
LocalDate safeEnd = safeStart.plusDays(14);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    return "\nYour safe period starts on " + safeStart.format(formatter) + 
           "\nYour safe period ends on " + safeEnd.format(formatter) + 
           "\nNa so you enter ovulation period ooo\n\n\n\n\n";
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
		
		System.out.println(calculateMenstrualFlow(newDay, newMonth));
		break;
	
	case "2":
		System.out.println("YOUR DANGERIOUS DAY END DATE IS THREE(3) DAYS AFTER YOUR MENSTRUAL FLOW END DATE");
		System.out.print("Enter your dangerous day end date (e.g. 20):   ");
		int newDay2 = input.nextInt();

		System.out.print("\nEnter the month (e.g. January):   ");
		String newMonth2 = input.next();

		System.out.println(calculateSafeDays(newDay2, newMonth2));
		break;


	case "3":
		System.out.println("YOUR DANGERIOUS DAY END DATE IS THREE(3) DAYS AFTER YOUR MENSTRUAL FLOW END DATE");
		System.out.print("Enter your dangerous day end date (e.g. 20):   ");
		int newDay3 = input.nextInt();
		System.out.print("\nEnter the month (e.g. January):   ");
		String newMonth3 = input.next();

		System.out.println(getOvulationPeriod(newDay3, newMonth3));
		break;


	case "0":
		System.out.println("\n\nEnjoy yourself if you're a fine girl, else\n\n");
		return;

	default : System.out.println("Invalid option.");
            }
        }
    }
}
