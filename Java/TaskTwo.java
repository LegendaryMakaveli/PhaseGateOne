import java.util.Scanner;

public class TaskTwo{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int sum = 0;
double average = 0;
int product = 1;

System.out.print("Enter the first number:  ");
int numberOne = input.nextInt();

System.out.print("Enter the second number:  ");
int numberTwo = input.nextInt();

System.out.print("Enter the third number:  ");
int numberThree = input.nextInt();

sum = numberOne + numberTwo + numberThree;
average = (double) sum / 3;
product = numberOne * numberTwo * numberThree;

System.out.println("The sum of the numbers is:  " + sum);
System.out.println("The average of the numbers is:  "  + average);
System.out.println("The product of the numbers is:  " + product);

}
}