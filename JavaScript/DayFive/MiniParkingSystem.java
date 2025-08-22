const prompt = require("prompt-sync")();

let cars = [];

let mainMenu = true;
while (mainMenu) {
    let showMenu = `
    WELCOME TO MAKAVELI PARKING SPACE
        
    1 ->  Park your car in the parking lot
    2 -> Remove you car from the parking lot
    3 -> Show available spaces and occupied ones
    0 -> Exit
`;
    console.log(showMenu);
    let number = prompt("Enter 1, 2, or 3 to perform operation and 0 to quit:  ");

    switch(number) {
	case "1":	addCarsToList(); break;
        case "2":	removeCarFromList(); break;
	case "3":	showAvailableSpaceInTheLot(); break;
	case "0":	mainMenu = false;
            console.log("Safe journey");
            break;
        default:	console.log("That's not a correct input");
            break;
    }
}

function addCarsToList() {
    let availableSpace = showAvailableSpaceInTheLot();
    let userItem = prompt("Park you car in the available spaces:  ");
    cars.push(userItem);
    console.log("Car Parked Successfully");
}

function removeCarFromList() {
    let removeItem = prompt("Enter the lot number you want to remove your car from:  ");
    let index = cars.indexOf(removeItem);
    if (index !== 0) {
        cars.splice(index);
        console.log("Car Removed Successfully");
    } else {
        console.log("Car not found");
    }
}

function showAvailableSpaceInTheLot() {
    console.log("..................Available Space And Occupied ones............");
        for (let count = 0; count < cars.length; count++) {
            console.log(cars[count]);
        	}
	for(let count = 0; count < cars.length; count++) {
			 if (cars.length > 20) {
        console.log("No parking space");
}
    }
}