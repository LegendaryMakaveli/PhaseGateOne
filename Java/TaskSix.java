public class TaskSix{

public static void main(String[] args) {


int [] array = {1,2,3,4,5,6,7,8,9,10};
int largest = array[3];
for (int rows : array) {
	if (rows > largest) largest = rows;
	}
System.out.println("The largest Number is:  " + largest);

}
}