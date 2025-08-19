public class TaskFour {


public static boolean getTheMilliage(int gallon, int mile) {
	int newMile = mile + mile;
	if (newMile == gallon) {
		return true;
	} else {
		return false;
	}
} 


public static void main(String... makaveli) {
	System.out.print(getTheMilliage(50,25));
}
}