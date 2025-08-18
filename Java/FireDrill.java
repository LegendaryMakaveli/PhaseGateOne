public class FireDrill{

public static void main(String[] args) {

for(int count = 1; count <= 10; count++){
	System.out.print(count + " ");
}


int [] array = {1,2,3,4,5,6,7,8,9,10};
int largest = array[3];
int smallest = array[2];
int total = 0;
for (int rows : array) {
	if (rows > largest) largest = rows;
	if (rows < smallest) smallest = rows;
	}
System.out.println(" ");
System.out.println("The largest Number is:  " + largest);
System.out.println("The Smallest Number is:  " + smallest);
for (int count = 0; count < array.length; count++) {
	total += count;
	}
System.out.println("The total is:  " + total);

System.out.print("The array in reverse:  ");
for (int count = array.length; count > 0; count--) {
	System.out.print(count + " ");
}

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











