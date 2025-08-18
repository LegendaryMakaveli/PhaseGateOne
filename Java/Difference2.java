import  java.util.Scanner;

public class Differnce{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Current World Population:  ");
double current = input.nextDouble();

System.out.print("Growth rate:  ");
double growth = input.nextDouble();

System.out.print("Enter number of year (s):  ");
double year = input.nextDouble();

current = 8_063_000_000L;
growth = 0.009;

double total  = 8_063_000_000L * growth;

double cal = total * year;

System.out.printf("%f", cal);
}
}