import java.util.Scanner;
import java.util.ArrayList;

public class MiniParkingSystem {
public static final int SIZE	 = 20;
public static int [] parkSpace = new int [SIZE];
public static void main(String... makaveli) {
Scanner input = new Scanner(System.in);
boolean mainMenu = true;
while (mainMenu) {
	String showMenu = """
	WELCOME TO MAKAVELI PARKING SPACE
		
1 ->  Park your car in the parking lot
2 -> Remove you car from the parking lot
3 -> Show available spaces and occupied ones
0 -> Exit
					""";
	System.out.println(showMenu);
	System.out.println("Enter 1, 2, or 3 to perform operation and 0 to quit");
	int number = input.nextInt();
	switch(number) {

			case 1:	System.out.print("Park your car:  ");
					int addCar = input.nextInt();
					 MiniParkingSystem.parkCarInLot(addCar); break;
			
			case 2:	System.out.println("Remove your car from the parked slot:  ");
					int removeCar = input.nextInt();
					MiniParkingSystem.removeCarFromTheLot(removeCar); break;

			case 3:	MiniParkingSystem.ShowAvailableSpace(); break;
			default : System.out.println("invalid"); break;
			case 0: mainMenu = false; {
				System.out.println("Safe journey");break;
			}
		}
	}
}

public static String parkCarInLot(int parkCar) {
	for(int count = 0; count <= SIZE; count++) {
		if( parkSpace[count] == 0) {
			     parkSpace[count] = 1;
				return "Car Parked Successfully" + (count + 1);
			}
		}	
	return "eze emmanuel";
}
public static String removeCarFromTheLot(int removeCar) {						      	if(removeCar > 1 && removeCar <= parkSpace.length){
		if(parkSpace[removeCar] == 1) {
			parkSpace[removeCar] = 0;
				return "Car removed successfully";
		} else {
		return " No space";
	     }
	}
return "invalid spot";
	}

public static void ShowAvailableSpace() {
System.out.println("..................Grocery_lists.............");
for(int count = 0; count < parkSpace.length; count++) {
	System.out.println(parkSpace[count]);
} 
}


}
