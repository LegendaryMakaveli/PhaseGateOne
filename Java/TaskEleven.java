import java.util.Arrays;

public class TaskEleven{

public static void main(String[] args) {

int [] array = {3,4,5,6,7,8,9,3,4,5};

for (int row = 0; row < array.length; row++) {
	for (int column = 0; column < array.length - 1; column++) {
		if (array[row] < array[column]){
			int temp = array[column];
		array[column] = array[row];
		array[row] = temp;
		}
	}
}
System.out.println(Arrays.toString(array));
}
}