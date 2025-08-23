const prompt = require("prompt-sync")();

const months = [
	 "january", "february", "march", "april", "may", "june",
	"july", "august", "september", "october", "november", "december"
];


function formatDate(date) {
	let day = date.getDate();
		if (day < 10) {
			day = "0" + day;
}

let month = months[date.getMonth()];
let year = date.getFullYear();
return day + " " + month + " " + year;

}


function getMonthNumber(monthName) {
	monthName = monthName.toLowerCase().trim();
	for (let row = 0; row < months.length; row++) {
		if (months[row] === monthName) {
	return row + 1;
		}
	}
return 0;
}


function calculateMenstrualFlow(day, month) {
	const monthNumber = getMonthNumber(month);
		if (monthNumber === 0) {
	return "Invalid month.";
}
const currentYear = new Date().getFullYear();
const startDate = new Date(currentYear, monthNumber - 1, day);

const menstrualEnd = new Date(startDate);
menstrualEnd.setDate(menstrualEnd.getDate() + 3);

const dangerousDate = new Date(menstrualEnd);
dangerousDate.setDate(dangerousDate.getDate() + 3);

return "Your flow will run till " + formatDate(menstrualEnd) +
         "\nYour dangerous date ends on " + formatDate(dangerousDate) +
         " if you have hmmm in-between this date....you fit don carry belle oo";

}




function getOvulationPeriod(day, month) {
	const monthNumber = getMonthNumber(month);
		if (monthNumber === 0) {
	return "Invalid month.";
}
const ovulationStartDay = day + 14;
const currentYear = new Date().getFullYear();
const ovulationStart = new Date(currentYear, monthNumber - 1, ovulationStartDay);

const ovulationEnd = new Date(ovulationStart);
ovulationEnd.setDate(ovulationEnd.getDate() + 7);

  return "\nYour ovulation period starts on " + formatDate(ovulationStart) +
         "\nYour ovulation period ends on " + formatDate(ovulationEnd) +
         " make sure you keep menstrual pad on you all day and nur try wear white\n\n\n\n\n";
}





function calculateSafeDays(day, month) {
	const monthNumber = getMonthNumber(month);
		if (monthNumber === 0) {
	return "Invalid month.";

}

const currentYear = new Date().getFullYear();
const safeStart = new Date(currentYear, monthNumber - 1, day);
const safeEnd = new Date(safeStart);
safeEnd.setDate(safeEnd.getDate() + 14);

  return "\nYour safe period starts on " + formatDate(safeStart) +
         "\nYour safe period ends on " + formatDate(safeEnd) +
         "\nNa so you enter ovulation period ooo\n\n\n\n\n";

}





makaveli:  while (true) {
	console.log(`WELCOME TO YOUR MENSTRUAL FLOW CALCULATOR

	Note: This will be accurate if your circle is 28days.
	just dey remove 1 day if na 27 days be your own...else your are good to go!!.

1 -> Calculate your menstrual flow date
2 -> Calculate your safe days  
3 -> Calculate your ovulation period
0 -> Exit

`);
let choice = prompt("Which one will you love to calculate:  ").trim();
switch (choice) {
	case "1": {
		let newDay1 = prompt("Enter your menstruation start day (e.g. 20):   ");
		let newMonth1 = prompt("Enter the month (e.g. January):   ");
        	console.log(calculateMenstrualFlow(newDay1, newMonth1));
        break;

}


	case "2": {
		console.log("YOUR DANGERIOUS DAY END DATE IS THREE(3) DAYS AFTER YOUR MENSTRUAL FLOW END DATE");
		let newDay2 = prompt("Enter your dangerous day end date (e.g. 20):   ");
        	let newMonth2 = prompt("Enter the month (e.g. January):   ");
		console.log(calculateSafeDays(newDay2, newMonth2));
	break;

}


	case "3": {
		console.log("YOUR DANGERIOUS DAY END DATE IS THREE(3) DAYS AFTER YOUR MENSTRUAL FLOW END DATE");
		let newDay3 = prompt("Enter your dangerous day end date (e.g. 20):   ");
		let newMonth3 = prompt("Enter the month (e.g. January):   ");
		console.log(getOvulationPeriod(newDay3, newMonth3));
	break;

}
	case "0": 
		console.log("Enjoy yourself if you're a fine girl, else");
		break makaveli;

	default:  
		console.log("Invalid option.");
		}
}
