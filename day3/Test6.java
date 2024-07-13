package day3;

public class Test6 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;

		//boolean z = x > y && ++x > 1; // 短路型(可能會提前結束後續判斷)
		boolean z = x > y & ++x > 1; // 一般型(逐步型)

		System.out.printf("x = %d%n", x);
		System.out.printf("y = %d%n", y);
		System.out.printf("z = %b%n", z);
	}

}