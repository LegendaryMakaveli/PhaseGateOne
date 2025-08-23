from datetime import datetime, timedelta

month_map = {
	"january": 1, "february": 2, "match": 3, "april": 4, "may": 5, "june": 6, "july": 7, "august": 8, "september": 9, "october": 10, "november": 11, "december": 12

}

def calculate_menstrual_flow(day, month) :
	while True :
		month = month.strip().lower()
		if month not in month_map :
			print("invalid month..Please try again")
			return

	current_year = datetime.now().year

	MENSTRUAL_FLOW = 3;
	DANGEROUS_DATE = 3

	start_date = datetime(current_year, month, day)
	calculate_menstrual = start_date + timedelta(days=MENSTRUAL_FLOW)
	calculate_dangrous_date = calculate_menstrual + timedelta(days=DANGEROUS_DATE)

	print(f"\n Your flow will run till {calculate_menstrual.strftime("%d %B %Y")}")
	print(f"\n Your dangerous date end on {calculate_dangrous_date.strftime("%d %B %Y")}  if you have sex admist this date....you fit don carry belle oo")


def get_ovulation_period(day, month) :
	print("YOUR DANGERIOUS DAY END DATE IS THREE(3) DAYS AFTER YOUR MENSTRUAL FLOW END DATE")
	while True :
		month = month.strip().lower()
		if month not in month_map :
			print("invalid month..Please try again")
			return

	current_year = datetime.now().year

	FREE_DATE = 14;
	ovulation_start = day + FREE_DATE 
	OVULATION_PERIOD = 7

	start_date = datetime(current_year, month, ovulation_start)
	ovulation_stop_date = start_date + timedelta(days=OVULATION_PERIOD)

	print(f"\n Your ovulation period will start on {start_date.strftime("%d %B %Y")}")
	print(f"\n Your ovulation period will end on {ovulation_stop_date.strftime("%d %B %Y")} make sure you keep menstrual pad on you all day and nur try wear white")


def safe_days(day, month) :
	print("YOUR DANGERIOUS DAY END DATE IS THREE(3) DAYS AFTER YOUR MENSTRUAL FLOW END DATE")
	while True :
		month = month.strip().lower()
		if month in month_map :
			month = month_map[month]
			break
		else :
			print("invalid month..Please try again")

	current_year = datetime.now().year
	
	free_day_start_date = day + 1
	FREE_DAYS = 14
	
	start_date = datetime(current_year, month, free_day_start_date)
	ovulation_stop_date = start_date + timedelta(days=FREE_DAYS)

	print(f"\n Your safe period will start on {start_date.strftime("%d %B %Y")}")
	print(f"\n Your safe period will end on {ovulation_stop_date.strftime("%d %B %Y")} you don enter ovulation period niyen oo.....careful with your attitude this period!")



def main_menu() :
	while True :
		print("""
			WELCOME TO YOUR MENTRUAL FLOW CALCULATOR

			1 -> Calculate your mentrual flow date
			2 -> Calculate your free days/ days wey you fit dey hmmmm anyhow..
			3 -> Calculate your ovulation period
			0 -> Exit
		""")
		choice = input("Enter your choice: ")
		match(choice) :
			case "1": 
				day = int(input("Enter your menstuation start date (e.g 20):   "))
				month = input("Enter the month (e.g January):  ") 
				calculate_menstrual_flow(day, month)
main_menu()


	


	
