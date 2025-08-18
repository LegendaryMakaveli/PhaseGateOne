import java.util.Arrays;

public class TaskEleven{

public static void main(String[] args) {

int [] array = {3,4,5,6,7,8,9,3,4,5};
int largest = array[0];
int secondLargest = array[1];

for (int rows : array) {
	if (rows > largest) {
		secondLargest = largest;
		largest = rows;
		}
	if (rows > largest && rows < secondLargest) secondLargest = rows;
	}
	System.out.println("The secondLargest is:  " + secondLargest);
}
}