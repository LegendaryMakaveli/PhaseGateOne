function userLikePage(myList) {
	let count = myList.length;

	if (count === 0) {
		return "No one like this";
	} else if (count === 1) {
		return `${myList} like this`
	} else if (count === 2) {
		return `${myList[0]},${myList[1]} like this`
	} else if (count === 3) {
		return `${myList[0]},${myList[1]} and ${myList[2]} like this`
	} else if (count > 3) {
		return `${myList[0]},${myList[1]} and ${myList.length-2} others like this`
	}

}

console.log(userLikePage(["peter", "James", "john", "kehi", "lili", "yiuy", "ikka"]));