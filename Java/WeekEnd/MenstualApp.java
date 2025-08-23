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
	for (int row = 0; i < months.length; row++) {
		if (months[row].equals(monthName)) {
			return row + 1;
            }
        }
        return -1;
    }

    public static void calculateMenstrualFlow(int day, String month) {
        int monthNumber = getMonthNumber(month);
        if (monthNumber == -1) {
            System.out.println("Invalid month.");
            return;
        }

        int currentYear = LocalDate.now().getYear();
        LocalDate startDate = LocalDate.of(currentYear, monthNumber, day);

        LocalDate menstrualEnd = startDate.plusDays(3);
        LocalDate dangerDate = menstrualEnd.plusDays(3);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("\nYour flow will run till " + menstrualEnd.format(formatter));
        System.out.println("Your dangerous date ends on " + dangerDate.format(formatter));
    }

    public static void getOvulationPeriod(int day, String month) {
        int monthNumber = getMonthNumber(month);
        if (monthNumber == -1) {
            System.out.println("Invalid month.");
            return;
        }

        int currentYear = LocalDate.now().getYear();
        int ovulationStartDay = day + 14;
        LocalDate ovulationStart = LocalDate.of(currentYear, monthNumber, 1).plusDays(ovulationStartDay - 1);
        LocalDate ovulationEnd = ovulationStart.plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("\nYour ovulation period starts on " + ovulationStart.format(formatter));
        System.out.println("Your ovulation period ends on " + ovulationEnd.format(formatter));
    }

    public static void calculateSafeDays(int day, String month) {
        int monthNumber = getMonthNumber(month);
        if (monthNumber == -1) {
            System.out.println("Invalid month.");
            return;
        }

        int currentYear = LocalDate.now().getYear();
        int safeStartDay = day + 1;
        LocalDate safeStart = LocalDate.of(currentYear, monthNumber, 1).plusDays(safeStartDay - 1);
        LocalDate safeEnd = safeStart.plusDays(14);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("\nYour safe period starts on " + safeStart.format(formatter));
        System.out.println("Your safe period ends on " + safeEnd.format(formatter));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                WELCOME TO YOUR MENSTRUAL FLOW CALCULATOR

                1 -> Calculate your menstrual flow date
                2 -> Calculate your safe days
                3 -> Calculate your ovulation period
                0 -> Exit
            """);

            System.out.print("Select an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter your menstruation start day (e.g. 20): ");
                    int day1 = scanner.nextInt();
                    scanner.nextLine(); // Clear newline

                    System.out.print("Enter the month (e.g. January): ");
                    String month1 = scanner.nextLine();

                    calculateMenstrualFlow(day1, month1);
                    break;

                case "2":
                    System.out.print("Enter your dangerous day end date (e.g. 20): ");
                    int day2 = scanner.nextInt();
                    scanner.nextLine(); // Clear newline

                    System.out.print("Enter the month (e.g. January): ");
                    String month2 = scanner.nextLine();

                    calculateSafeDays(day2, month2);
                    break;

                case "3":
                    System.out.print("Enter your dangerous day end date (e.g. 20): ");
                    int day3 = scanner.nextInt();
                    scanner.nextLine(); // Clear newline

                    System.out.print("Enter the month (e.g. January): ");
                    String month3 = scanner.nextLine();

                    getOvulationPeriod(day3, month3);
                    break;

                case "0":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
