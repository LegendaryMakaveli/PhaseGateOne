from datetime import datetime, timedelta

month_names = {
	"january": 1, "february": 2, "march": 3, "april": 4, "may": 5, "june": 6, "july": 7, "august": 8, "september": 9, "october": 10, "november": 11, "december": 12

}

def calculate_menstrual_flow(day, month) :
	if type(month) == float :
		raise ValueError("no float")
	elif type(month) == int :
		raise ValueError("no number pls")
	elif type(day) == str :
		raise ValueError("No string in days")
	elif type(day) == float :
		raise ValueError("no float")
	if not day :
		raise TypeError("cannot be empty")
	if not month :
		raise TypeError("cannot be empty")

	month = month.strip().lower()
	if month not in month_names :
		print("invalid month..Please try again")
		return

	month = month_names[month]
	current_year = datetime.now().year

	MENSTRUAL_FLOW = 3;
	DANGEROUS_DATE = 3

	start_date = datetime(current_year, month, day)
	calculate_menstrual = start_date + timedelta(days=MENSTRUAL_FLOW)
	calculate_dangrous_date = calculate_menstrual + timedelta(days=DANGEROUS_DATE)

	print(f"\n Your flow will run till {calculate_menstrual.strftime("%d %B %Y")}")
	print(f"\n Your dangerous date end on {calculate_dangrous_date.strftime("%d %B %Y")}  if you have hmmm in-between this date....you fit don carry belle oo\n\n\n\n\n")


def get_ovulation_period(day, month) :
	if type(month) == float :
		raise ValueError("no float")
	elif type(month) == int :
		raise ValueError("no number pls")
	elif type(day) == str :
		raise ValueError("No string in days")
	elif type(day) == float :
		raise ValueError("no float")
	if not day :
		raise TypeError("cannot be empty")
	if not month :
		raise TypeError("cannot be empty")

	print("YOUR DANGERIOUS DAY END DATE IS THREE(3) DAYS AFTER YOUR MENSTRUAL FLOW END DATE")
	month = month.strip().lower()
	if month not in month_names :
		print("invalid month..Please try again")
		return

	month = month_names[month]
	current_year = datetime.now().year

	FREE_DATE = 14;
	ovulation_start = day + FREE_DATE 
	OVULATION_PERIOD = 7

	start_date = datetime(current_year, month, ovulation_start)
	ovulation_stop_date = start_date + timedelta(days=OVULATION_PERIOD)

	print(f"\n Your ovulation period will start on {start_date.strftime("%d %B %Y")}")
	print(f"\n Your ovulation period will end on {ovulation_stop_date.strftime("%d %B %Y")} make sure you keep menstrual pad on you all day and nur try wear white\n\n\n\n\n")


def calculate_safe_days(day, month) :
	if type(month) == float :
		raise ValueError("no float")
	elif type(month) == int :
		raise ValueError("no number pls")
	elif type(day) == str :
		raise ValueError("No string in days")
	elif type(day) == float :
		raise ValueError("no float")
	if not day :
		raise TypeError("cannot be empty")
	if not month :
		raise TypeError("cannot be empty")

	print("YOUR DANGERIOUS DAY END DATE IS THREE(3) DAYS AFTER YOUR MENSTRUAL FLOW END DATE")
	month = month.strip().lower()
	if month not in month_names :
		print("invalid month..Please try again")
		return

	month = month_names[month]
	current_year = datetime.now().year
	
	free_day_start_date = day + 1
	FREE_DAYS = 14
	
	start_date = datetime(current_year, month, free_day_start_date)
	ovulation_stop_date = start_date + timedelta(days=FREE_DAYS)

	print(f"\n Your safe period will start on {start_date.strftime("%d %B %Y")}")
	print(f"\n Your safe period will end on {ovulation_stop_date.strftime("%d %B %Y")} you don enter ovulation period niyen oo.....careful with your attitude this period!\n\n\n\n\n")



def main_menu() :
	while True :
		print("""
WELCOME TO YOUR MENTRUAL FLOW CALCULATOR


Note: This will be accurate if your circle is 28days.
just dey remove 1 day if na 27 days be your own...else your are good to go!!.



1 -> Calculate your mentrual flow date
2 -> Calculate your safe days/ days wey you fit dey hmmmm anyhow..
3 -> Calculate your ovulation period
0 -> Exit
		""")
		choice = input("Which one will you love to calculate: ")
		match(choice) :
			case "1": 
				day = int(input("Enter your menstuation start date (e.g 20):   "))
				month = input("Enter the month (e.g January): ")
				calculate_menstrual_flow(day, month)

			case "2":
				day = int(input("Enter your dangerous day end date (e.g 20):   "))
				month = input("Enter the month (e.g January):  ") 
				calculate_safe_days(day, month)
	
			case "3":
				day = int(input("Enter your dangerous day end date (e.g 20):   "))
				month = input("Enter the month (e.g January):  ") 
				get_ovulation_period(day, month)
		
			case "0": 
				print("\n\nEnjoy yourself if you're a fine girl, else\n\n")
				break

main_menu()


	
