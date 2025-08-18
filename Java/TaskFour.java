import java.util.Scanner;

public class TaskFour{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the first number:  ");
int numberOne = input.nextInt();

if (numberOne > 0) {
		System.out.println("Number is positive");
	} else {
		System.out.println("Number is negative");
	}

}
}