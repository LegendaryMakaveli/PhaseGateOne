from datetime import datetime, timedelta

month_map = {
	"january": 1, "february": 2, "match": 3, "april": 4, "may": 5, "june": 6, "july": 7, "august": 8, "september": 9, "october": 10, "november": 11, "december": 12

}

def calculate_menstrual_flow() :
	day = int(input("Enter your menstual start day (e.g 20):  "))
	
	while True :
		month = input("Enter the month (e.g.  January):  ").strip().lower()
		if month in month_map :
			month = month_map[month]
			break
		else :
			print("invalid month..Please try again")

	current_year = datetime.now().year

	MENSTRUAL_FLOW = 3;
	DANGEROUS_DATE = 3

	start_date = datetime(current_year, month, day)
	calculate_menstrual = start_date + timedelta(days=MENSTRUAL_FLOW)
	calculate_dangrous_date = calculate_menstrual + timedelta(days=DANGEROUS_DATE)

	print(f"\n Your flow will run till {calculate_menstrual.strftime("%d %B %Y")}")
	print(f"\n Your dangerous date end on {calculate_dangrous_date.strftime("%d %B %Y")}  if you have sex admist this date....you fit don carry belle oo")


def get_ovulation_period() :
	print("Your dangerous_date end date is three day after your menstruation flow ends")
	day = int(input("Enter your dangerous day end date(e.g 23):  "))
	
	while True :
		month = input("Enter the month (e.g.  January):  ").strip().lower()
		if month in month_map :
			month = month_map[month]
			break
		else :
			print("invalid month..Please try again")

	current_year = datetime.now().year

	FREE_DATE = 14;
	ovulation_start = day + FREE_DATE 
	OVULATION_PERIOD = 7

	start_date = datetime(current_year, month, ovulation_start)
	ovulation_stop_date = start_date + timedelta(days=OVULATION_PERIOD)

	print(f"\n Your ovulation period will start on {start_date.strftime("%d %B %Y")}")
	print(f"\n Your ovulation period will end on {ovulation_stop_date.strftime("%d %B %Y")} make sure you keep menstrual pad on you all day and nur try wear white")


get_ovulation_period()
	


	
