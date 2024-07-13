package day3;

public class Test8 {

	public static void main(String[] args) {
		// 位元運算
		int x = 5 & 3;
		/*
			 0101 -> 5
		   & 0011 -> 3
		  -------------
             0001 -> 1
		*/
		System.out.printf("x = %d%n", x);

		int y = 5 | 3;
		/*
			 0101 -> 5
		   | 0011 -> 3
		  -------------
             0111 -> 7
		*/
		System.out.printf("y = %d%n", y);

		int z = 5 ^ 3; // XOR
		/*
			 0101 -> 5
		   ^ 0011 -> 3
		  -------------
             0110 -> 6
		*/
		System.out.printf("z = %d%n", z);

		int a = ~13;
		/*
			0000 0000 0000 0000 0000 0000 0000 1101 -> 13
			補數 ~13
			公式: -(x)-1
			範例: -(13)-1 = -14
			1111 1111 1111 1111 1111 1111 1111 0010 -> -14
		*/
		System.out.printf("a = %d%n", a);
	}

}