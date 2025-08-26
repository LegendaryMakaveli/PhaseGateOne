const prompt = require('prompt-sync')();

let userInput = prompt("Enter your card number: ");

let cardNumber = new Array(userInput.length);
for (let count = 0; count < userInput.length; count++) {
    cardNumber[count] = Number(userInput.charAt(count));
}

let result = validateCreditCard(cardNumber);
console.log(result);

function SumDigits(number) {
    let first = number % 10;
    let second = Math.floor(number / 10);
    let sum = first + second;
    return sum;
}

function validateCreditCard(cardNumber) {
if (cardNumber.length < 13 || cardNumber.length > 16) {
	return "Check the card number length";
} else if (cardNumber == null || cardNumber.length === 0) {
	return "Invalid Card";
}

    let result = 0;
	
	for (let count = cardNumber.length - 1; count >= 0; count--) {
	let number = cardNumber[count];

	if (((cardNumber.length - 1) - count) % 2 === 1) {
		number *= 2;
		number = SumDigits(number);
	}

	result += number;
}


let cardType;


if (cardNumber[0] === 4) {
	cardType = "Visa Card";
} else if (cardNumber[0] === 5) {
	cardType = "MasterCard";
} else if (cardNumber[0] === 3 && cardNumber[1] === 7) {
	cardType = "American Express Card";
} else if (cardNumber[0] === 6) {
	cardType = "Discover Card";
} else {
	cardType = "Unknown Card Type";
}

 if (result % 10 === 0) {
	return "Card is Valid and its Type: " + cardType;
} else {
	return "Card is not valid, its Type: " + cardType;
}
}
