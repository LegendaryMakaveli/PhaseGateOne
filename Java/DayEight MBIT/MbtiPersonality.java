import java.util.Scanner;
import java.util.ArrayList;

public class MbtiPersonality {

public static ArrayList<String> optionA = new ArrayList<>();
public static ArrayList<String> optionB = new ArrayList<>();

public static void main(String... makaveli) {
Scanner input = new Scanner(System.in);

int counterA = 0;
int counterB = 0;

int personalityE_A = 0;
int personalityI_B = 0;

int personalityS_A = 0;
int personalityN_B = 0;

int personalityT_A = 0;
int personalityF_B = 0;

int personalityJ_A = 0;
int personalityP_B = 0;


System.out.print("What is you name:   ");
String userInput = input.nextLine().toUpperCase();

System.out.print("YOU CAN ONLY CHOOSE JUST OPTION A & B\n\n\n");



System.out.println("(1) A. expand energy, enjoy group,	B. conserve energy, enjoy one-on-one:   \n");
String letterOne = input.next().toUpperCase();
if(letterOne.equalsIgnoreCase("A")) {
	optionA.add("expand energy, enjoy group, ");
	counterA++;
	personalityE_A++;
} else if (letterOne.equalsIgnoreCase("B")){
	optionB.add("conserve energy, enjoy one-on-one, ");
	counterB++;
	personalityI_B++;
} else if (!letterOne.equals("A") && !letterOne.equals("B")){
	System.out.println("invalid input");
}




System.out.println("\n(2) A. Interpret literally,	B. look for meaning and possibilities:   \n");
 String letterTwo = input.next().toUpperCase();
if(letterTwo.equalsIgnoreCase("A")) {
	optionA.add("Interpret literally, ");
	counterA++;
	personalityS_A++;
} else  if(letterTwo.equalsIgnoreCase("B")){
	optionB.add("look for meaning and possibilities, ");
	counterB++;
	personalityN_B++;
} else if (!letterTwo.equals("A") && !letterTwo.equals("B")){
	System.out.println("invalid input");
}





System.out.println("(3) A. logical, thinking, questioning,	B. empathetic, feeling, accomodating:   \n");
String letterThree = input.next().toUpperCase();
if(letterThree.equalsIgnoreCase("A")) {
	optionA.add("logical, thinking, questioning, ");
	counterA++;
	personalityT_A++;
} else if (letterThree.equalsIgnoreCase("B")){
	optionB.add("empathetic, feeling, accomodating, ");
	counterB++;
	personalityF_B++;
} else if (!letterThree.equals("A") && !letterThree.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(4) A. organized, orderly,	B. flexible, adaptable:   \n");
String letterFour = input.next().toUpperCase();
if(letterFour.equalsIgnoreCase("A")) {
	optionA.add("organized, orderly, ");
	counterA++;
	personalityJ_A++;
} else if (letterFour.equalsIgnoreCase ("B")){
	optionB.add("flexible, adaptable, ");
	counterB++;
	personalityP_B++;
} else if(!letterFour.equals("A") && !letterFour.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(5) A. more outgoing, think out load,	B. more reserved, think to yourself:   \n");
String answerFive = input.next().toUpperCase();
if(answerFive.equalsIgnoreCase("A")) {
	optionA.add("more outgoing, think out load, ");
	counterA++;
	personalityE_A++;
} else if (answerFive.equalsIgnoreCase("B")){
	optionB.add("more reserved, think to yourself, ");
	counterB++;
	personalityI_B++;
} else if (!answerFive.equals("A") && !answerFive.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(6) A. practical, realistic, experimental,	B. imaginative, innovative, theoretical:   \n");
String answerSix = input.next().toUpperCase();
if(answerSix.equalsIgnoreCase("A")) {
	optionA.add("practical, realistic, experimental, ");
	counterA++;
	personalityS_A++;
} else if (answerSix.equalsIgnoreCase("B")){
	optionB.add("imaginative, innovative, ");
	counterB++;
	personalityN_B++;
} else if (!answerSix.equals("A") && !answerSix.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(7) A. candid, straight forward, frank,	B. tactful, kind, encouraging:   \n");
String answerSeven = input.next().toUpperCase();
if(answerSeven.equalsIgnoreCase("A")) {
	optionA.add("candid, straight forward, frank, ");
	counterA++;
	personalityT_A++;
} else if (answerSeven.equalsIgnoreCase("B")){
	optionB.add("tactful, kind, encouraging, ");
	counterB++;
	personalityF_B++;
} else if (!answerSeven.equals("A") && answerSeven.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(8) A. plan, schedule,	B. unplanned, spontaneous:   \n");
String answerEight = input.next().toUpperCase();
if(answerEight.equalsIgnoreCase("A")) {
	optionA.add("plan, schedule, ");
	counterA++;
	personalityJ_A++;
} else if (answerEight.equalsIgnoreCase("B")){
	optionB.add("unplanned, spontaneous, ");
	counterB++;
	personalityP_B++;
} else if (!answerEight.equals("A") && !answerEight.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(9) A. seek many tasks, public activities,	B. interaction with others, seek private, solitary activities with quiet to concentrate:   \n");
String answerNine = input.next().toUpperCase();
if(answerNine.equalsIgnoreCase("A")) {
	optionA.add("seek many tasks, public activities, ");
	counterA++;
	personalityE_A++;
} else if (answerNine.equalsIgnoreCase("B")){
	optionB.add("interaction with others, seek private, solitary activities with quiet to concentrate, ");
	counterB++;
	personalityI_B++;
} else if (!answerNine.equals("A") && !answerNine.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(10) A. standard usual, convertional,	B. different, novel, unique:   \n");
String answerTen = input.next().toUpperCase();
if(answerTen.equalsIgnoreCase("A")) {
	optionA.add("standard usual, convertional, ");
	counterA++;
	personalityS_A++;
} else if (answerTen.equalsIgnoreCase("B")){
	optionB.add("different, novel, unique, ");
	counterB++;
	personalityN_B++;
} else if (!answerTen.equals("A") && !answerTen.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(11) A. firm, tend to criticize, hold the line,    B. gentle, tend to appriciate, conciliate:   \n");
String answerEleven = input.next().toUpperCase();
if(answerEleven.equalsIgnoreCase("A")) {
	optionA.add("firm, tend to criticize, hold the line");
	counterA++;
	personalityT_A++;
} else if (answerEleven.equalsIgnoreCase("B")){
	optionB.add("gentle, tend to appriciate, conciliate");
	counterB++;
	personalityF_B++;
} else if (!answerEleven.equals("A") && !answerEleven.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(12) A. regular, structure,	B. easy-going, live and let live:   \n");
String answerTwelve = input.next().toUpperCase();
if(answerTwelve.equalsIgnoreCase("A")) {
	optionA.add("regular, structure, ");
	counterA++;
	personalityJ_A++;
} else if (answerTwelve.equalsIgnoreCase("B")){
	optionB.add("easy-going, live and let live, ");
	counterB++;
	personalityP_B++;
} else if (!answerTwelve.equals("A") && !answerTwelve.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(13) A. external, communicative, express yourself,    B. internal, reticnet, keep to yourself:   \n");
String answerThirteen = input.next().toUpperCase();
if(answerThirteen.equalsIgnoreCase("A")) {
	optionA.add("external, communicative, express yourself, ");
	counterA++;
	personalityE_A++;
} else if (answerThirteen.equalsIgnoreCase("B")){
	optionB.add("internal, reticnet, keep to yoursel, ");
	counterB++;
	personalityI_B++;
} else if (!answerThirteen.equals("A") && !answerThirteen.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(14) A. focus on here and now,	B. look to the future, global perspective, big picture:   \n");
String answerFourteen = input.next().toUpperCase();
if(answerFourteen.equalsIgnoreCase("A")) {
	optionA.add("focus on here and now, ");
	counterA++;
	personalityS_A++;
} else if (answerFourteen.equalsIgnoreCase("B")){
	optionB.add("look to the future, global perspective, big picture, ");
	counterB++;
	personalityN_B++;
} else if (!answerFourteen.equals("A") && !answerFourteen.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(15) A. tough-minded, just,    B. tender-hearted, merciful:   \n");
String answerFifteen = input.next().toUpperCase();
if(answerFifteen.equalsIgnoreCase("A")) {
	optionA.add("tough-minded, just, ");
	counterA++;
	personalityT_A++;
} else if (answerFifteen.equalsIgnoreCase("B")){
	optionB.add("tender-hearted, merciful, ");
	counterB++;
	personalityF_B++;
} else if (!answerFifteen.equals("A") && !answerFifteen.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(16) A. preparative, plan ahead,	B. go with the flow, adapt as you go:   \n");
String answerSixteen = input.next().toUpperCase();
if(answerSixteen.equalsIgnoreCase("A")) {
	optionA.add("preparative, plan ahead, ");
	counterA++;
	personalityJ_A++;
} else if (answerSixteen.equalsIgnoreCase("B")){
	optionB.add("go with the flow, adapt as you go, ");
	counterB++;
	personalityP_B++;
} else if (!answerSixteen.equals("A") && !answerSixteen.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(17) A. active, initiate,    B. reflective, delibrate:   \n");
String answerSeventeen = input.next().toUpperCase();
if(answerSeventeen.equalsIgnoreCase("A")) {
	optionA.add("active, initiate, ");
	counterA++;
	personalityE_A++;
} else if (answerSeventeen.equalsIgnoreCase("B")){
	optionB.add("reflective, delibrate, ");
	counterB++;
	personalityI_B++;
} else if (!answerSeventeen.equals("A") && !answerSeventeen.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(18) A. facts, things, what is,    B. ideas, dream, what could be, philosophical:   \n");
String answerEighteen = input.next().toUpperCase();
if(answerEighteen.equalsIgnoreCase("A")) {
	optionA.add("facts, things, what is, ");
	counterA++;
	personalityS_A++;
} else if (answerEighteen.equalsIgnoreCase("B")){
	optionB.add("ideas, dream, what could be, philosophical, ");
	counterB++;
	personalityN_B++;
} else if (!answerEighteen.equals("A") && !answerEighteen.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("\n(19) A. matter of fact, issue-oriented,    B. sensitive, people-oriented, compasonate:   \n");
String answerNineteen = input.next().toUpperCase();
if(answerNineteen.equalsIgnoreCase("A")) {
	optionA.add("matter of fact, issue-oriented, ");
	counterA++;
	personalityT_A++;
} else  if (answerNineteen.equalsIgnoreCase("B")){
	optionB.add(" sensitive, people-oriented, ");
	counterB++;
	personalityF_B++;
} else if (!answerNineteen.equals("A") && !answerNineteen.equals("B")) {
	System.out.println("invalid input");
}




System.out.println("(20) A. control, govern,    B. latitude, freedom:   \n");
String answerTwenty = input.next().toUpperCase();
if(answerTwenty.equalsIgnoreCase ("A")) {
	optionA.add("control, govern.");
	counterA++;
	personalityJ_A++;
} else if (answerTwenty.equalsIgnoreCase("B")){
	optionB.add("latitude, freedom.");
	counterB++;
	personalityP_B++;
} else if (!answerTwenty.equals("A") && !answerTwenty.equals("B")) {
	System.out.println("invalid input");
}

char EI = (personalityE_A >= personalityI_B) ? 'E' : 'I';
char SN = (personalityS_A >= personalityN_B) ? 'S' : 'N';
char TF = (personalityT_A >= personalityF_B) ? 'T' : 'F';
char JP = (personalityJ_A >= personalityP_B) ? 'J' : 'P';

String mbtiPersonality = " " + EI + SN + TF + JP;


System.out.println(userInput + " " + "you choose....\n\n\n");
System.out.println(optionA + "\n\n\n");
System.out.println(userInput + " " + "you choose....\n\n\n");
System.out.println(optionB + "\n\n\n");

System.out.println("Number of A selected:  " + counterA + "\n\n");
System.out.println("Number of B selected:  " + counterB + "\n\n");

System.out.println("Your MBTI Personality is:   " + mbtiPersonality + " \n\n");

}
}