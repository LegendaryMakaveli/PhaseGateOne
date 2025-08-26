import java.util.Scanner;

public class CreditCardValidator {

public static void main(String[] args) {

Scanner input =  new Scanner(System.in);

System.out.print("Enter your card number:   ");
String userInput = input.nextLine();

int [] cardNumber = new int [userInput.length()];
for(int count = 0; count < userInput.length(); count++) {
	cardNumber[count] = Character.getNumericValue(userInput.charAt(count));
	}

String result = validateCreditCard(cardNumber);
System.out.println(result);
}

public static int SumDigits(int number) {
	int first = number % 10;
	int second = number / 10;
	int sum = first + second;

return sum;	
}

public static String validateCreditCard(int [] cardNumber) {
	if (cardNumber.length < 13 || cardNumber.length > 16) {
	return "Check the card number length";
	} else if (cardNumber == null || cardNumber.length == 0) {
	return "Invalid Card";
	}

	int result = 0;
	for(int count =  cardNumber.length - 1; count >= 0; count--) {
		int number = cardNumber[count];
		if(((cardNumber.length - 1) - count ) % 2 == 1) {
			number *= 2;
		number = SumDigits(number);
		}
		result += number;
		}
String cardType; 

	if (cardNumber[0] == 4) {
		cardType = "Visa Card";
	} else if (cardNumber[0] == 5) {
		cardType = "MasterCard";
	} else if (cardNumber[0] == 3 && cardNumber[1] == 7) {
		cardType = "American Express Card";
	} else if (cardNumber[0] == 6) {
		cardType = "Discover Card";
	} else {
		cardType = "Unknon Card Type";
	}

if (result % 10 == 0) {
	return "Card is Valid and its Type: " + cardType;
} else {
	return "Card is not valid its Type: " + cardType;
}


}

}