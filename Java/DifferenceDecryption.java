import java.util.Scanner;

public class DifferenceDecryption{

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter encrypted password:  ");
int password = input.nextInt();

int numberOne = (password / 1000) % 10;
int numberTwo = (password / 100) % 10;
int numberThree = (password / 10) % 10;
int numberFour = password % 10;

numberOne = (numberOne + 10 - 7) % 10;
numberTwo = (numberTwo + 10 - 7) % 10;
numberThree = (numberThree + 10 - 7) % 10;
numberFour = (numberFour + 10 - 7) % 10;

int temp1 = numberOne;
numberOne = numberThree;
numberThree = temp1;

int temp2 = numberTwo;
numberTwo = numberFour;
numberFour = temp2;
System.out.printf("Enter Encrypted number to Decrypt %d%d%d%d", numberOne,numberTwo,numberThree,numberFour);
}


}