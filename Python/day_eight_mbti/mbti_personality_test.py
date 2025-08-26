optionA = []
optionB = []

counterA = 0
counterB = 0

personalityE_A = 0
personalityI_B = 0

personalityS_A = 0
personalityN_B = 0

personalityT_A = 0
personalityF_B = 0

personalityJ_A = 0
personalityP_B = 0


userInput = input("What is your name:   ").upper()

print("YOU CAN ONLY CHOOSE JUST OPTION A & B\n\n\n")



letter_one = input(("(1) A. expand energy, enjoy group,	B. conserve energy, enjoy one-on-one:   \n")).upper()
if(letter_one == "A") :
	optionA.append("expand energy, enjoy group ")
	counterA = counterA + 1
	personalityE_A = personalityE_A + 1
elif (letter_one == "B") :
	optionB.append("conserve energy, enjoy one-on-one ")
	counterB = counterB + 1
	personalityI_B = personalityI_B + 1
elif (letter_one != "A" and letter_one != "B") :
	print("invalid input")




letter_two = input(("\n(2) A. Interpret literally,	B. look for meaning and possibilities:   \n")).upper()
if(letter_two == "A") :
	optionA.append("Interpret literally ")
	counterA = counterA + 1
	personalityS_A = personalityS_A + 1
elif(letter_two == "B") :
	optionB.append("look for meaning and possibilities ");
	counterB = counterB + 1
	personalityN_B = personalityN_B + 1
elif (letter_two != "A" and letter_two != "B") :
	print("invalid input")





letter_three = input(("(3) A. logical, thinking, questioning,	B. empathetic, feeling, accomodating:   \n")).upper()
if(letter_three == "A") :
	optionA.append("logical, thinking, questioning ")
	counterA = counterA + 1
	personalityT_A = personalityT_A + 1
elif (letter_three == "B") :
	optionB.append("empathetic, feeling, accomodating ")
	counterB = counterB + 1
	personalityF_B = personalityF_B + 1
elif (letter_three != "A" and letter_three != "B") :
	print("invalid input")




letter_four = input(("(4) A. organized, orderly,	B. flexible, adaptable:   \n")).upper()
if(letter_four == "A") :
	optionA.append("organized, orderly ")
	counterA = counterA + 1
	personalityJ_A = personalityJ_A + 1
elif (letter_four ==  "B") :
	optionB.append("flexible, adaptable ")
	counterB = counterB + 1
	personalityP_B = personalityP_B + 1
elif (letter_four != "A" and letter_four != "B") :
	print("invalid input")




answer_five = input(("(5) A. more outgoing, think out load,	B. more reserved, think to yourself:   \n")).upper()
if(answer_five == "A") :
	optionA.append("more outgoing, think out load ")
	counterA = counterA + 1
	personalityE_A = personalityE_A + 1
elif (answer_five == "B") :
	optionB.append("more reserved, think to yourself ");
	counterB = counterB + 1
	personalityI_B = personalityI_B + 1
elif (answer_five != "A" and answer_five != "B") :
	print("invalid input")




answer_six = input(("(6) A. practical, realistic, experimental,	B. imaginative, innovative, theoretical:   \n")).upper()
if(answer_six == "A") :
	optionA.append("practical, realistic, experimental ")
	counterA = counterA + 1
	personalityS_A = personalityS_A + 1
elif (answer_six == "B") :
	optionB.append("imaginative, innovative ");
	counterB = counterB + 1
	personalityN_B = personalityN_B + 1
elif (answer_six != "A" and answer_six != "B") :
	print("invalid input")




answer_seven = input(("(7) A. candid, straight forward, frank,	B. tactful, kind, encouraging:   \n")).upper()
if(answer_seven == "A") :
	optionA.append("candid, straight forward, frank ")
	counterA = counterA + 1
	personalityT_A = personalityT_A + 1
elif (answer_seven == "B") :
	optionB.append("tactful, kind, encouraging ");
	counterB = counterB + 1
	personalityF_B = personalityF_B + 1
elif (answer_seven != "A" and answer_seven != "B") :
	print("invalid input")




answer_eight = input(("(8) A. plan, schedule,	B. unplanned, spontaneous:   \n")).upper()
if(answer_eight == "A") :
	optionA.append("plan, schedule ")
	counterA = counterA + 1
	personalityJ_A = personalityJ_A + 1
elif (answer_eight == "B") :
	optionB.append("unplanned, spontaneous ");
	counterB = counterB + 1
	personalityP_B = personalityP_B + 1
elif (answer_eight != "A" and answer_eight != "B") :
	print("invalid input")




answer_nine = input(("(9) A. seek many tasks, public activities,	B. interaction with others, seek private, solitary activities with quiet to concentrate:   \n")).upper()
if(answer_nine == "A") :
	optionA.append("seek many tasks, public activities ")
	counterA = counterA + 1
	personalityE_A = personalityE_A + 1
elif (answer_nine == "B") :
	optionB.append("interaction with others, seek private, solitary activities with quiet to concentrate ")
	counterB = counterB + 1
	personalityI_B = personalityI_B + 1
elif (answer_nine != "A" and answer_nine != "B") :
	print("invalid input")




answer_ten = input(("(10) A. standard usual, convertional,	B. different, novel, unique:   \n")).upper()
if(answer_ten == "A") :
	optionA.append("standard usual, convertional ")
	counterA = counterA + 1
	personalityS_A = personalityS_A + 1
elif (answer_ten == "B") :
	optionB.append("different, novel, unique ")
	counterB = counterB + 1
	personalityN_B = personalityN_B + 1
elif (answer_ten != "A" and answer_ten != "B") :
	print("invalid input")




answer_eleven = input(("(11) A. firm, tend to criticize, hold the line,    B. gentle, tend to appriciate, conciliate:   \n")).upper()
if(answer_eleven == "A") :
	optionA.append("firm, tend to criticize, hold the line ")
	counterA = counterA + 1
	personalityT_A = personalityT_A + 1
elif (answer_eleven == "B") :
	optionB.append("gentle, tend to appriciate, conciliate ")
	counterB = counterB + 1
	personalityF_B = personalityF_B + 1
elif (answer_eleven != "A" and answer_eleven != "B") :
	print("invalid input")





answer_twelve = input(("(12) A. regular, structure,	B. easy-going, live and let live:   \n")).upper()
if(answer_twelve == "A") :
	optionA.append("regular, structure ")
	counterA = counterA + 1
	personalityJ_A = personalityJ_A + 1
elif (answer_twelve == "B") :
	optionB.append("easy-going, live and let live ")
	counterB = counterB + 1
	personalityP_B = personalityP_B + 1
elif (answer_twelve != "A" and answer_twelve != "B") :
	print("invalid input")





answer_thirteen = input(("(13) A. external, communicative, express yourself,    B. internal, reticnet, keep to yourself:   \n")).upper()
if(answer_thirteen == "A") :
	optionA.append("external, communicative, express yourself ")
	counterA = counterA + 1
	personalityE_A = personalityE_A + 1
elif (answer_thirteen == "B") :
	optionB.append("internal, reticnet, keep to yoursel ")
	counterB = counterB + 1
	personalityI_B = personalityI_B + 1
elif (answer_thirteen != "A" and answer_thirteen != "B") :
	print("invalid input")




answer_fourteen = input(("(14) A. focus on here and now,	B. look to the future, global perspective, big picture:   \n")).upper()
if(answer_fourteen == "A") :
	optionA.append("focus on here and now ")
	counterA = counterA + 1
	personalityS_A = personalityS_A + 1
elif (answer_fourteen == "B") :
	optionB.append("look to the future, global perspective, big picture ")
	counterB = counterB + 1
	personalityN_B = personalityN_B + 1
elif (answer_fourteen != "A" and answer_fourteen != "B") :
	print("invalid input")




answer_fifteen = input(("(15) A. tough-minded, just,    B. tender-hearted, merciful:   \n")).upper()
if(answer_fifteen == "A") :
	optionA.append("tough-minded, just ")
	counterA = counterA + 1
	personalityT_A = personalityT_A + 1
elif (answer_fifteen == "B") :
	optionB.append("tender-hearted, merciful ")
	counterB = counterB + 1
	personalityF_B = personalityF_B + 1
elif (answer_fifteen != "A" and answer_fifteen != "B") :
	print("invalid input")




answer_sixteen = input(("(16) A. preparative, plan ahead,	B. go with the flow, adapt as you go:   \n")).upper()
if(answer_sixteen == "A") :
	optionA.append("preparative, plan ahead ")
	counterA = counterA + 1
	personalityJ_A = personalityJ_A + 1
elif (answer_sixteen == "B") :
	optionB.append("go with the flow, adapt as you go ")
	counterB = counterB + 1
	personalityP_B = personalityP_B + 1
elif (answer_sixteen != "A" and answer_sixteen != "B") :
	print("invalid input")




answer_seventeen = input(("(17) A. active, initiate,    B. reflective, delibrate:   \n")).upper()
if(answer_seventeen == "A") :
	optionA.append("active, initiate ")
	counterA = counterA + 1
	personalityE_A = personalityE_A + 1
elif (answer_seventeen == "B") :
	optionB.append("reflective, delibrate ")
	counterB = counterB + 1
	personalityI_B = personalityI_B + 1
elif (answer_seventeen != "A" and answer_seventeen != "B") :
	print("invalid input")




answer_eighteen = input(("(18) A. facts, things, what is,    B. ideas, dream, what could be, philosophical:   \n")).upper()
if(answer_eighteen == "A") :
	optionA.append("facts, things, what is ")
	counterA = counterA + 1
	personalityS_A = personalityS_A + 1
elif (answer_eighteen == "B") :
	optionB.append("ideas, dream, what could be, philosophical ")
	counterB = counterB + 1
	personalityN_B = personalityN_B + 1
elif (answer_eighteen != "A" and answer_eighteen != "B") :
	print("invalid input")




answer_nineteen = input(("\n(19) A. matter of fact, issue-oriented,    B. sensitive, people-oriented, compasonate:   \n")).upper()
if(answer_nineteen == "A") :
	optionA.append("matter of fact, issue-oriented ")
	counterA = counterA + 1
	personalityT_A = personalityT_A + 1
elif (answer_nineteen == "B") :
	optionB.append(" sensitive, people-oriented ")
	counterB = counterB + 1
	personalityF_B = personalityF_B + 1
elif (answer_nineteen != "A" and answer_nineteen != "B") :
	print("invalid input")



answer_twenty = input(("(20) A. control, govern,    B. latitude, freedom:   \n")).upper()
if(answer_twenty == "A") :
	optionA.append("control, govern.")
	counterA = counterA + 1
	personalityJ_A = personalityJ_A + 1
elif (answer_twenty == "B") :
	optionB.append("latitude, freedom.")
	counterB = counterB + 1
	personalityP_B = personalityP_B + 1
elif (answer_twenty != "A" and answer_twenty != "B") :
	print("invalid input")


EI = 'E' if personalityE_A >= personalityI_B else 'I'
SN = 'S' if personalityS_A >= personalityN_B else 'N'
TF = 'T' if personalityT_A >= personalityF_B else 'F'
JP = 'J' if personalityJ_A >= personalityP_B else 'P'

mbtiPersonality = " " + EI + SN + TF + JP


print("\n\n", userInput + " ",  "you choose....", "\n\n\n")
print(optionA)
print("\n\n", userInput + " ",  "you choose....", "\n\n\n")
print(optionB)

print("\n\n", "Number of A selected:  ",  counterA, "\n\n\n")
print("Number of B selected:  ", counterB, "\n\n\n")

print("Your MBTI Personality is:   ",  mbtiPersonality, "\n\n\n")
