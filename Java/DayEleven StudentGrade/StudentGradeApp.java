import java.util.Scanner;

public class StudentGradeApp {

public static void main(String... makaveli) {

Scanner input = new Scanner(System.in);

System.out.println("How many students are available? ");
int studentSize = input.nextInt();

System.out.println("How many subjects? ");
int subjectLength = input.nextInt();

int[][] subjectScore = new int[studentSize][subjectLength];

for (int row = 0; row < studentSize; row++) {
	System.out.println("Entering score for student " + (row + 1));
for (int column = 0; column < subjectLength; column++) {
	System.out.print("Enter subject " + (column + 1) + " score: ");
	subjectScore[row][column] = input.nextInt();
	}
}

System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("Saved successfully");

System.out.println("=============================================================");
System.out.print("STUDENT\t \t");
for (int counter = 0; counter < subjectLength; counter++) {
	System.out.print("SUB" + (counter + 1) + "\t");
}
	System.out.println("TOT\tAVE\tPOS");

System.out.println("=============================================================");

int[] totals = new int[studentSize];
double[] average = new double[studentSize];
for (int count = 0; count < studentSize; count++) {
	int total = 0;
for (int counter = 0; counter < subjectLength; counter++) {
	total += subjectScore[count][counter];
}
	totals[count] = total;
	average[count] = (double) total / subjectLength;
}

int[] position = new int[studentSize];
	for (int count = 0; count < studentSize; count++) {
		int newPosition = 1;
	for (int counter = 0; counter < studentSize; counter++) {
		if (totals[counter] > totals[count]) {
                    newPosition++;
		}
	}
            position[count] = newPosition;
}

for (int count = 0; count < studentSize; count++) {
	System.out.print("Student" + (count + 1) + "\t");
for (int counter = 0; counter < subjectLength; counter++) {
	System.out.print(subjectScore[count][counter] + "\t");
}
System.out.println(totals[count] + "\t" + String.format("%.2f", average[count]) + "\t" + position[count]);
}
System.out.println("=============================================================");
System.out.println("=============================================================");

for (int counter = 0; counter < subjectLength; counter++) {
	int highestScore = 0;
	int lowestScore = 100;
	int highestStudent = 0;
	int lowestStudent = 0;
	int totalScore = 0;
	int passCount = 0;
	int failCount = 0;

for (int count = 0; count < studentSize; count++) {
	int score = subjectScore[count][counter];
	totalScore += score;

	if (score > highestScore) {
		highestScore = score;
		highestStudent = count;
}

	if (score < lowestScore) {
		lowestScore = score;
		lowestStudent = count;
}

	if (score >= 50) {
		passCount++;
} else {
		failCount++;
        }
}

double averagePerSubject = (double) totalScore / studentSize;

System.out.println("SUBJECT SUMMARY");
System.out.println("Subject " + (counter + 1));
System.out.println("Highest scoring student is: Student " + (highestStudent + 1) + " scoring " + highestScore);
System.out.println("Lowest scoring student is: Student " + (lowestStudent + 1) + " scoring " + lowestScore);
System.out.println("Total score is: " + totalScore);
System.out.printf("Average score is: %.2f\n", averagePerSubject);
System.out.println("Number of passes: " + passCount);
System.out.println("Number of Fails: " + failCount);
System.out.println();
}

























	}
}