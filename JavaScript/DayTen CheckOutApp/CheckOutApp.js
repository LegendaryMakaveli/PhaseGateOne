let customerList = [];
let quantity = [];
let priceOfGoods = [];
let totalGoods = [];

const input = require("prompt-sync")();

const time = new Date();
const formatted = time.toLocaleString('en-GB', { day: '2-digit', month: '2-digit', year: 'numeric', hour: '2-digit', minute: '2-digit' });

let customerName = input("What is the Customer's Name:   ").toUpperCase();

let addMoreItems = "yes";
let ITEM = "unknow";
let QTY = 0;
let PRICE = 0;
let TOTAL = 0;
let subTotal = 0;

while (addMoreItems.toUpperCase() !== "NO") {
	ITEM = input("What did the customer want to buy?:   ");

	QTY = parseInt(input("How many " + ITEM + " pieces the customer want to buy?:   "));
  
	PRICE = parseFloat(input("How much is " + ITEM + " per unit?:   "));

	addMoreItems = input("Add more items? (Yes/No):   ");

	TOTAL = QTY * PRICE;
	totalGoods.push(TOTAL);
	customerList.push(ITEM);
	quantity.push(QTY);
	priceOfGoods.push(PRICE);
}

let cashierName = input("What is your name?:   ");

let discount = parseFloat(input("How much discount will he/she get:  "));

console.log("  ");
console.log("  ");
console.log("  ");
console.log("  ");
console.log("SEMICOLON STORES");
console.log("MAIN BRANCH");
console.log("LOCATION:  312, HERBERT MACAULAY WAY, SABO YABA,  LAGOS");
console.log("TEL:  03293828343");
console.log("Date: " + formatted);
console.log("Cashier Name: " + cashierName);
console.log("Customer Name: " + customerName);
console.log("=============================================================");
console.log("ITEM \t QTY \t PRICE \t  TOTAL(NGN)");

for (let count = 0; count < customerList.length; count++) {
  console.log(customerList[count] + "\t" + quantity[count] + "\t" + priceOfGoods[count] + "\t" + totalGoods[count]);
}

console.log("=============================================================");
for (let count = 0; count < totalGoods.length; count++) {
  subTotal += totalGoods[count];
}

let cashDiscount = (discount / 100) * subTotal;
let totalVat = 0.175 * subTotal; 

let billTotal = (subTotal - cashDiscount) + totalVat;

console.log("========================INVOICE============================= ");

console.log("SubTotal = " + subTotal);
console.log("Discount = " + cashDiscount);
console.log("Vat @ 17.50% = " + totalVat);
console.log("=============================================================");
console.log("Bill Total = " + billTotal);
console.log("=============================================================");
console.log("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);

console.log("  ");
console.log("  ");

let customerPay = parseFloat(input("How much did the customer give to you?: "));

let Balance = customerPay - billTotal;

if (customerPay < billTotal) {
  console.log("Your payment is not yet complete.....kindly complete your payment!!");
} else {
  console.log("  ");
  console.log("  ");
  console.log("  ");
  console.log("  ");
  console.log("========================RECEIPT============================= ");

  console.log("LOCATION:  312, HERBERT MACAULAY WAY, SABO YABA,  LAGOS");
  console.log("TEL:  03293828343");
  console.log("Date: " + formatted);
  console.log("Cashier Name: " + cashierName);
  console.log("Customer Name: " + customerName);
  console.log("=============================================================");
  console.log("ITEM \t QTY \t PRICE \t  TOTAL(NGN)");

  for (let count = 0; count < customerList.length; count++) {
    console.log(customerList[count] + "\t" + quantity[count] + "\t" + priceOfGoods[count] + "\t" + totalGoods[count]);
  }

  console.log("=============================================================");
  console.log("SubTotal = " + subTotal);
  console.log("Discount = " + cashDiscount);
  console.log("Vat @ 17.50% = " + totalVat);
  console.log("=============================================================");
  console.log("Bill Total = " + billTotal);
  console.log("Amount paid = " + customerPay);
  console.log("Balance = " + Balance);
  console.log("=============================================================");
  console.log("THANK YOU FOR YOUR PATRONAGE");
}
