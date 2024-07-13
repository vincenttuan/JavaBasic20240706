package day3;

public class Test5 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		boolean z = x < y && y > 1;

		System.out.printf("x = %d%n", x);
		System.out.printf("y = %d%n", y);
		System.out.printf("z = %b%n", z);

		//-----------------------------------

		boolean z1 = x < y;
		boolean z2 = y > 1;
		boolean z3 = z1 && z2;

		System.out.printf("z1 = %b%n", z1);
		System.out.printf("z2 = %b%n", z2);
		System.out.printf("z3 = %b%n", z3);

	}

}