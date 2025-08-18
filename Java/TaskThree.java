import java.util.Scanner;

public class TaskThree{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the first number:  ");
int numberOne = input.nextInt();

System.out.print("Enter the second number:  ");
int numberTwo = input.nextInt();

	if(numberOne % 3 == 0) {
		System.out.println("First integer is divisible by 3");
	} else {
		System.out.println("First integer is not divisible by 3");
	}

	if (numberTwo % 3 == 0) {
		System.out.println("Second integer is divisible by 3");
	} else {
		System.out.println("Second integer is not divisible by 3");
	}

}
}