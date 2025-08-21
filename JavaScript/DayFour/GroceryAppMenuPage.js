const prompt = require("prompt-sync")();

let items = [];

let mainMenu = true;
while (mainMenu) {
    let showMenu = `
    WELCOME TO YOUR GROCERIES APP
        
    1 -> Add item
    2 -> Remove item
    3 -> Show available item
    0 -> Exit
`;
    console.log(showMenu);
    let number = prompt("Enter 1, 2, or 3 to perform operation and 0 to quit:  ");

    switch(number) {
	case "1":	addItemToList(); break;
        case "2":	removeItemFromList(); break;
	case "3":	viewItemInTheFromList(); break;
	case "0":	mainMenu = false;
            console.log("Thanks for shopping with us");
            break;
        default:	console.log("That's not a correct input");
            break;
    }
}

function addItemToList() {
    let userItem = prompt("Enter an element to add to items:  ");
    items.push(userItem);
    console.log("Item Added Successfully");
}

function removeItemFromList() {
    let removeItem = prompt("Enter an element to remove from the items:  ");
    let index = items.indexOf(removeItem);
    if (index !== 0) {
        items.splice(index);
        console.log("Item Removed Successfully");
    } else {
        console.log("Item not found");
    }
}

function viewItemInTheFromList() {
    console.log("..................Grocery_lists.............");
    if (items.length === 0) {
        console.log("Market nur dey shop");
    } else {
        for (let count = 0; count < items.length; count++) {
            console.log(items[count]);
        }
    }
}