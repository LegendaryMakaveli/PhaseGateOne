public class TaskEighteen{

public static void main(String[] args) {

int total = 0;
int count = 1;
for (count = 1; count <= 100; count++) {
	System.out.print(count);
	}

if (count % 3 == 0) {
		System.out.print("Frizz");
		}
	if (count % 5 == 0) {
		System.out.print("Buzz");
		}
	if (count % 3 == 0 && count % 5 == 0) {
		System.out.print("FrizzBuzz");
		}
}
}