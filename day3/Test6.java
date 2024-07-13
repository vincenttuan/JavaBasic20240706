package day3;

public class Test6 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;

		boolean z = x > y & ++x > 1;

		System.out.printf("x = %d%n", x);
		System.out.printf("y = %d%n", y);
		System.out.printf("z = %b%n", z);
	}

}