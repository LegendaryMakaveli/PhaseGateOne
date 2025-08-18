public class TaskNine{

public static void main(String[] args) {


int [] anotherArray = {12,23,34,45,56,67,78,89,90,110};
int maximum = anotherArray[0];
int minimum = anotherArray[1];

for (int rows : anotherArray) {
		if (rows > maximum) maximum = rows;
		if (rows < minimum) minimum = rows;
		}
System.out.println(" ");
System.out.println("The Maximum Number is:  " + maximum);
System.out.println("The minimum Number is:  " + minimum);

}
}