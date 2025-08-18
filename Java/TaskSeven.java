public class TaskSeven{

public static void main(String[] args) {

int [] array = {1,2,3,4,5,6,7,8,9,10};
int smallest = array[3];
for (int rows : array) {
	if (rows < smallest) smallest = rows;
	}
System.out.println("The Smallest Number is:  " + smallest);

}
}