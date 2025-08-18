import java.util.Scanner;

public class Difference1 {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter your password:  ");
int password = input.nextInt();

int numberOne = (password / 1000) % 10;
int numberTwo = (password / 100) % 10;
int numberThree = (password / 10) % 10;
int numberFour = password % 10;

numberOne = (numberOne + 7) % 10;
numberTwo = (numberTwo + 7) % 10;
numberThree = (numberThree + 7) % 10;
numberFour = (numberFour + 7) % 10;

int temp1 = numberOne;
numberOne = numberThree;
numberThree = temp1;

int temp2 = numberTwo;
numberTwo = numberFour;
numberFour = temp2;
System.out.printf("Encrypted number %d%d%d%d", numberOne,numberTwo,numberThree,numberFour);
}


}