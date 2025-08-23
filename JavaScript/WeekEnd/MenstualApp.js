const prompt = require("prompt-sync")();

const months = [
	 "january", "february", "march", "april", "may", "june",
	"july", "august", "september", "october", "november", "december"
];


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

const dangerDate = new Date(menstrualEnd);
dangerousDate.setDate(dangerousDate.getDate() + 3);

return "Your flow will run till " + menstrualEnd.toLocaleDateString() +
         "\nYour dangerous date ends on " + dangerousDate.toLocaleDateString() +
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

  return "\nYour ovulation period starts on " + ovulationStart.toLocaleDateString('en-US', { day: '2-digit', month: 'long', year: 'numeric' }) +
         "\nYour ovulation period ends on " + ovulationEnd.toLocaleDateString('en-US', { day: '2-digit', month: 'long', year: 'numeric' }) +
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

  return "\nYour safe period starts on " + safeStart.toLocaleDateString('en-US', { day: '2-digit', month: 'long', year: 'numeric' }) +
         "\nYour safe period ends on " + safeEnd.toLocaleDateString('en-US', { day: '2-digit', month: 'long', year: 'numeric' }) +
         "\nNa so you enter ovulation period ooo\n\n\n\n\n";
}

function main() {
  while (true) {
    console.log(`WELCOME TO YOUR MENSTRUAL FLOW CALCULATOR

Note: This will be accurate if your circle is 28days.
just dey remove 1 day if na 27 days be your own...else your are good to go!!.

1 -> Calculate your menstrual flow date
2 -> Calculate your safe days  
3 -> Calculate your ovulation period
0 -> Exit

`);
    const choice = prompt("Which one will you love to calculate:  ").trim();

    switch (choice) {
      case "1": {
        const newDayStr = prompt("Enter your menstruation start day (e.g. 20):   ");
        if (!newDayStr) break;
        const newDay = parseInt(newDayStr);
        const newMonth = prompt("Enter the month (e.g. January):   ");
        if (!newMonth) break;
        console.log(calculateMenstrualFlow(newDay, newMonth));
        break;
      }
      case "2": {
        console.log("YOUR DANGERIOUS DAY END DATE IS THREE(3) DAYS AFTER YOUR MENSTRUAL FLOW END DATE");
        const newDay2Str = prompt("Enter your dangerous day end date (e.g. 20):   ");
        if (!newDay2Str) break;
        const newDay2 = parseInt(newDay2Str);
        const newMonth2 = prompt("Enter the month (e.g. January):   ");
        if (!newMonth2) break;
        console.log(calculateSafeDays(newDay2, newMonth2));
        break;
      }
      case "3": {
        console.log("YOUR DANGERIOUS DAY END DATE IS THREE(3) DAYS AFTER YOUR MENSTRUAL FLOW END DATE");
        const newDay3Str = prompt("Enter your dangerous day end date (e.g. 20):   ");
        if (!newDay3Str) break;
        const newDay3 = parseInt(newDay3Str);
        const newMonth3 = prompt("Enter the month (e.g. January):   ");
        if (!newMonth3) break;
        console.log(getOvulationPeriod(newDay3, newMonth3));
        break;
      }
      case "0":
        console.log("Enjoy yourself if you're a fine girl, else");
        return;
      default:
        console.log("Invalid option.");
    }
  }
}

main();
