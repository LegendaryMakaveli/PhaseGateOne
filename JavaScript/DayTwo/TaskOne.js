function checkFatherToSonAge(fatherAge, sonAge) {
	let fatherFutureAge = fatherAge -  sonAge * 2;
		if (fatherFutureAge < 0) {
			return 0;
		}
return fatherFutureAge;

}

console.log(checkFatherToSonAge(50,16));