const input = require("prompt-sync")();

let optionA = [];
let optionB = [];

let counterA = 0;
let counterB = 0;

let personalityE_A = 0;
let personalityI_B = 0;

let personalityS_A = 0;
let personalityN_B = 0;

let personalityT_A = 0;
let personalityF_B = 0;

let personalityJ_A = 0;
let personalityP_B = 0;


let userInput = input("What is you name:   ");

console.log("YOU CAN ONLY CHOOSE JUST OPTION A & B\n\n\n");

console.log("(1) You regularly make new friends\n");
let answerOne = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerOne == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityE_A++;
} else if (answerOne == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityI_B++;
} else if (answerOne != 'A' && answerOne != 'B'){
	console.log("invalid input")
}




console.log("\n(2) Complex and novel ideas excite you more than simple and straightforward ones\n");
let answerTwo = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerTwo == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityS_A++;
} else  if(answerTwo == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityN_B++;
} else if (answerTwo != 'A' && answerTwo != 'B'){
	console.log("Invalid input");
}




console.log("(3) You usually feel more persuaded by what resonates emotionally with you than by factual arguments\n");
let answerThree = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerThree == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityT_A++;
} else if (answerThree == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityF_B++;
} else if (answerThree != 'A' && answerThree != 'B') {
	console.log("Invalid input");
}




console.log("(4) Your living and working spaces are clean and organized\n");
let answerFour = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerFour == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityJ_A++;
} else if (answerFour == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityP_B++;
} else if(answerFour != 'A' && answerFour != 'B') {
	console.log("Invalid input");
}




console.log("(5) You usually stay calm, even under a lot of pressure\n");
let answerFive = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerFive == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityE_A++;
} else if (answerFive == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityI_B++;
} else if (answerFive != 'A' && answerFive != 'B') {
	console.log("Invalid input");
}




console.log("(6) You find the idea of networking or promoting yourself to strangers very daunting\n");
let answerSix = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerSix == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityS_A++;
} else if (answerSix == 'B' ){
	optionB.push("Disagree");
	counterB++;
	personalityN_B++;
} else if (answerSix != 'A' && answerSix != 'B') {
	console.log("Invalid input");
}




console.log("(7) You prioritize and plan tasks effectively, often completing them well before the deadline\n");
let answerSeven = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerSeven == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityT_A++;
} else if (answerSeven == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityF_B++;
} else if (answerSeven != 'A' && answerSeven != 'B') {
	console.log("Invalid input");
}




console.log("(8) People’s stories and emotions speak louder to you than numbers or data\n");
let answerEight = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerEight == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityJ_A++;
} else if (answerEight == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityP_B++;
} else if (answerEight != 'A' && answerEight != 'B') {
	console.log("Invalid input");
}




console.log("(9) You like to use organizing tools like schedules and lists\n");
let answerNine = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerNine == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityE_A++;
} else if (answerNine == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityI_B++;
} else if (answerNine != 'A' && answerNine != 'B') {
	console.log("Invalid input");
}




console.log("(10) Even a small mistake can cause you to doubt your overall abilities and knowledge\n");
let answerTen = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerTen == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityS_A++;
} else if (answerTen == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityN_B++;
} else if (answerTen != 'A' && answerTen != 'B') {
	console.log("Invalid input");
}




console.log("(11) You feel comfortable just walking up to someone you find interesting and striking up a conversation\n");
let answerEleven = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerEleven == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityT_A++;
} else if (answerEleven == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityF_B++;
} else if (answerEleven != 'A' && answerEleven != 'B') {
	console.log("Invalid input");
}




console.log("(12) You are not too interested in discussions about various interpretations of creative works\n");
let answerTwelve = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerTwelve == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityJ_A++;
} else if (answerTwelve == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityP_B++;
} else if (answerTwelve != 'A' && answerTwelve != 'B') {
	console.log("Invalid input");
}




console.log("(13) You prioritize facts over people’s feelings when determining a course of action\n");
let answerThirteen = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerThirteen == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityE_A++;
} else if (answerThirteen == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityI_B++;
} else if (answerThirteen != 'A' && answerThirteen != 'B') {
	console.log("Invalid input");
}




console.log("(14) You too like sex\n");
let answerFourteen = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerFourteen == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityS_A++;
} else if (answerFourteen == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityN_B++;
} else if (answerFour != 'A' && answerFourteen != 'B') {
	console.log("Invalid input");
}




console.log("(15) You often allow the day to unfold without any schedule at all\n");
let answerFifteen = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerFifteen == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityT_A++;
} else if (answerFifteen == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityF_B++;
} else if (answerFifteen != 'A' && answerFifteen != 'B') {
	console.log("Invalid input");
}




console.log("(16) You rarely worry about whether you make a good impression on people you meet\n");
let answerSixteen = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerSixteen == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityJ_A++;
} else if (answerSixteen == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityP_B++;
} else if (answerSixteen != 'A' && answerSixteen != 'B') {
	console.log("Invalid input");
}




console.log("(17) You enjoy partiipating in tean-based activities\n");
let answerSeventeen = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerSeventeen == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityE_A++;
} else if (answerSeventeen == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityI_B++;
} else if (answerSeventeen != 'A' && answerSeventeen != 'B') {
	console.log("Invalid input");
}




console.log("(18) You enjoy experimenting with new and untested approaches\n");
let answerEighteen = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerEighteen == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityS_A++;
} else if (answerEighteen == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityN_B++;
} else if (answerEighteen != 'A' && answerEighteen != 'B') {
	console.log("Invalid input");
}




console.log("\n(19) You proritize being sensitive over being completely honest\n");
let answerNineteen = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerNineteen == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityT_A++;
} else  if (answerNineteen == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityF_B++;
} else if (answerNineteen != 'A' && answerNineteen != 'B') {
	console.log("Invalid input");
}




console.log("(20) You actively seek out new experiences and knowledge areas to explore\n");
let answerTwenty = input("A. Agree,	B. Disagree:   ").toUpperCase();
if(answerTwenty == 'A') {
	optionA.push("Agree");
	counterA++;
	personalityJ_A++;
} else if (answerTwenty == 'B'){
	optionB.push("Disagree");
	counterB++;
	personalityP_B++;
} else if (answerTwenty != 'A' && answerTwenty != 'B') {
	console.log("Invalid input");
}

let EI = (personalityE_A >= personalityI_B) ? 'E' : 'I';
let SN = (personalityS_A >= personalityN_B) ? 'S' : 'N';
let TF = (personalityT_A >= personalityF_B) ? 'T' : 'F';
let JP = (personalityJ_A >= personalityP_B) ? 'J' : 'P';

let mbtiPersonality = " " + EI + SN + TF + JP;


console.log(userInput + "You choose....");
console.log(optionA);
console.log(userInput + "You choose....");
console.log(optionB);

console.log("Number of A selected:  " + counterA);
console.log("Number of B selected:  " + counterB);

console.log("Your MBTI Personality is:  " +  mbtiPersonality);
