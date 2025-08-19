public class TaskOne{

public static int checkfatherToSonAge(int fatherAge, int sonAge) {
int fatherPastAge = fatherAge - sonAge * 2;

	if (fatherPastAge < 0) {
		return 0;
	}

 return  fatherPastAge;
}

public static void main(String... makaveli) {
System.out.print(checkfatherToSonAge(50,16));

}
}