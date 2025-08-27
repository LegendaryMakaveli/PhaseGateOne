from datetime import datetime
customer_list = []
quantity = []
price_of_goods = []
total_goods = []

customer_name = input("What is the Customer's Name:   ").upper()
current_datetime = datetime.now()
formatted_datetime = current_datetime.strftime("%d-%m-%Y %H:%M:%S")

add_more_items = "yes"
ITEM = "unknow"
QTY = 0
PRICE = 0
TOTAL = 0
sub_total = 0

while (add_more_items.upper() != "NO") :
	ITEM = input("What did the customer want to buy?:   ")

	QTY = int(input("How many pieces the customer want to buy?:   "))
  
	PRICE = float(input("How much is per unit?:   "))

	add_more_items = input("Add more items? (Yes/No):   ")

	TOTAL = QTY * PRICE
	total_goods.append(TOTAL)
	customer_list.append(ITEM)
	quantity.append(QTY)
	price_of_goods.append(PRICE)


cashier_name = input("What is your name?:   ")

discount = float(input("How much discount will he/she get:  "))

print("  ")
print("  ")
print("  ")
print("  ")
print("SEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION:  312, HERBERT MACAULAY WAY, SABO YABA,  LAGOS")
print("TEL:  03293828343")
print(formatted_datetime)
print("Cashier Name: " + cashier_name)
print("Customer Name: " + customer_name)
print("=============================================================")
print("ITEM \t QTY \t PRICE \t  TOTAL(NGN)")

for number in range(len(customer_list)) :
	print(customer_list[number],  "\t",   quantity[number],   "\t",   price_of_goods[number],   	"\t",  total_goods[number])

print("=============================================================")
for number in range(len(total_goods)) :
	sub_total += total_goods[number]


cash_discount = (discount / 100) * sub_total
total_vat = 0.175 * sub_total 

bill_total = (sub_total - cash_discount) + total_vat

print("  ")
print("  ")

print("========================INVOICE============================= ")

print("SubTotal = ", sub_total)
print("Discount = " , cash_discount)
print("Vat @ 17.50% = ", total_vat)
print("=============================================================")
print("Bill Total = ",  bill_total)
print("=============================================================")
print("THIS IS NOT A RECEIPT KINDLY PAY ",  bill_total)

print("  ")
print("  ")

customer_pay = float(input("How much did the customer give to you?:   "))

Balance = customer_pay - bill_total

if (customer_pay < bill_total) :
	print("Your payment is not yet complete.....kindly complete your payment!!")
else :
	print("  ")
	print("  ")
	print("  ")
	print("  ")
	print("========================RECEIPT============================= ")

	print("LOCATION:  312, HERBERT MACAULAY WAY, SABO YABA,  LAGOS")
	print("TEL:  03293828343")
	print(formatted_datetime)
	print("Cashier Name: " + cashier_name)
	print("Customer Name: " + customer_name)
	print("=============================================================")
	print("ITEM \t QTY \t PRICE \t  TOTAL(NGN)")

	for number in range(len(customer_list)) :
		print(customer_list[number],  "\t",   quantity[number],   "\t",   price_of_goods[number],  
		"\t",  total_goods[number])

	print("=============================================================")
	print("SubTotal = ", sub_total)
	print("Discount = ", cash_discount)
	print("Vat @ 17.50% = ", total_vat)
	print("=============================================================")
	print("Bill Total = ",  bill_total)
	print("Amount paid = ",  customer_pay)
	print("Balance = ", Balance)
	print("=============================================================")
	print("THANK YOU FOR YOUR PATRONAGE")