public class TaskEleven{

public static void main(String[] args) {

int factorial = 10;
int getFactorial = 1;
for (int count = factorial; count >= 1; count--) {
	getFactorial *= count;
}
System.out.print("The factorial is :  " + getFactorial);

}
}