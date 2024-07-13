package day3;

public class Test7 {

	public static void main(String[] args) {
		int x = 1, y = 1;

		boolean z = x++ > y; // 先比較 x > y 再運算 x+1
		//boolean z = ++x > y; // 先運算 x+1 再比較 x > y 
	
		System.out.printf("x = %d%n", x);
		System.out.printf("y = %d%n", y);
		System.out.printf("z = %b%n", z);
	}

}