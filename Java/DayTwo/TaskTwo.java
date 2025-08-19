public class TaskTwo {

public static char studentGrade(int firstGrade, int secondGrade, int thirdGrade) {

	int result = (firstGrade + secondGrade + thirdGrade) / 3;
	
	if (result >= 90 && result <= 100) {
		return 'A';
	} else if (result >= 80 && result < 90) {
		return 'B';
	} else if (result >= 70 && result < 80) {
		return 'C';
	} else if (result >= 60 && result < 70) {
		return 'D';
	} else {
		return 'F';
	}
	
}

public static void main(String... makaveli) {
System.out.print(studentGrade(34,33,78));	
}

}