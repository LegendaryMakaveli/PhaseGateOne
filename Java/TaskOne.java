import java.util.Scanner;

public class TaskOne{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int totalSumOfSquare = 0;
int difference = 0;

System.out.print("Enter an integer:  ");
int numberOne = input.nextInt();

System.out.print("Enter another integer:  ");
int numberTwo = input.nextInt();

int squareOne = numberOne * numberTwo;
int squareTwo = numberTwo * numberTwo;

totalSumOfSquare = squareOne + squareTwo;
difference = squareOne - squareTwo;

System.out.println("The Sqaure of first integer is:  " + squareOne);
System.out.println("The Sqaure of second integer is:  " + squareTwo);
System.out.println("The Sum of the squares is:  " + totalSumOfSquare);
System.out.println("The difference of the squares is:  " + difference);
}



}