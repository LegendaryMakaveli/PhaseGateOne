import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CheckOutApp {

public static ArrayList<String> customerList = new ArrayList<>();
public static ArrayList<Double> quantity = new ArrayList<>();
public static ArrayList<Double> priceOfGoods = new ArrayList<>();
public static ArrayList<Double> totalGoods = new ArrayList<>();


public static void main(String... makaveli) {

Scanner input = new Scanner(System.in);

LocalDateTime time = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm");
String formatted = time.format(formatter);

System.out.println("What is the Customer's Name: ");
String customerName = input.next().toUpperCase();


String addMoreItems = "yes";
String ITEM = "unknow";
double QTY = 0;
double PRICE = 0;
double TOTAL = 0;
double subTotal = 0;
while(!addMoreItems.equalsIgnoreCase("NO")) {

	System.out.println("What did the customer want to buy?: ");
	ITEM = input.next().toUpperCase();

	System.out.println("How many" + " " + ITEM + " " + "pieces the customer want to buy?: ");
	QTY = input.nextDouble();

	System.out.println("How much is " + " " + ITEM + " " + "per unit?: ");
	PRICE = input.nextDouble();
	
	System.out.println("Add more items (Yes/No)?: ");
	addMoreItems = input.next().toUpperCase();

	TOTAL = QTY * PRICE;
	totalGoods.add(TOTAL);
	customerList.add(ITEM);
	quantity.add(QTY);
	priceOfGoods.add(PRICE);
}

System.out.println("What is your name?:  ");
String cashierName = input.next().toUpperCase();

System.out.println("How much discount will he/she get?:  ");
double discount = input.nextDouble();


System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION:  312, HERBERT MACAULAY WAY, SABO YABA,  LAGOS");
System.out.println("TEL:  03293828343");
System.out.println("Date: " + formatted);
System.out.println("Cashier Name: " + cashierName);
System.out.println("Customer Name: " + customerName);
System.out.println("=============================================================");
System.out.println("ITEM \t QTY \t PRICE \t  TOTAL(NGN)");
for(int count = 0; count < customerList.size(); count++) {
	System.out.println(customerList.get(count) + "\t" + quantity.get(count) + "\t" + priceOfGoods.get(count) +  "\t" + totalGoods.get(count));

}
System.out.println("=============================================================");
for(int count = 0; count < totalGoods.size(); count ++) {
	subTotal += totalGoods.get(count);
}
double cashDiscount = (discount / 100) * subTotal;
double totalVat = 0.175 * subTotal;

double billTotal = (subTotal - cashDiscount) + totalVat;

System.out.println("  ");
System.out.println("  ");
System.out.println("  ");
System.out.println("  ");
System.out.println("========================INVOICE============================= ");

System.out.println("SubTotal = " + subTotal);
System.out.println("Discount = " + cashDiscount);
System.out.println("Vat @ 17.50% = " + totalVat);
System.out.println("=============================================================");
System.out.println("Bill Total = " + billTotal);
System.out.println("=============================================================");
System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);

System.out.println("How much did the customer give to you?");
double customerPay = input.nextDouble();

double Balance = customerPay - billTotal;
if (customerPay < billTotal) {
	System.out.println("Your payment is  not yet complete.....kindly complete your payment!!");
} else {

System.out.println("  ");
System.out.println("  ");
System.out.println("  ");
System.out.println("  ");
System.out.println("========================RECIEPT============================= ");

System.out.println("LOCATION:  312, HERBERT MACAULAY WAY, SABO YABA,  LAGOS");
System.out.println("TEL:  03293828343");
System.out.println("Date: " + formatted);
System.out.println("Cashier Name: " + cashierName);
System.out.println("Customer Name: " + customerName);
System.out.println("=============================================================");
System.out.println("ITEM \t QTY \t PRICE \t  TOTAL(NGN)");
for(int count = 0; count < customerList.size(); count++) {
	System.out.println(customerList.get(count) + "\t" + quantity.get(count) + "\t" + priceOfGoods.get(count) +  "\t" + totalGoods.get(count));

}
System.out.println("=============================================================");
System.out.println("SubTotal = " + subTotal);
System.out.println("Discount = " + cashDiscount);
System.out.println("Vat @ 17.50% = " + totalVat);
System.out.println("=============================================================");
System.out.println("Bill Total = " + billTotal);
System.out.println("Amount paid = " + customerPay);
System.out.println("Balance = " + Balance);
System.out.println("=============================================================");
System.out.println("THANK YOU FOR YOUR PATRONAGE");

}

}
}