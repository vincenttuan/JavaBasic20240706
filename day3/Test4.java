package day3;

public class Test4 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		// 當值域小於 int 的型別在進行運算時會自動將結果晉升 int
		// 所以 a + b = 30 <-- int
		// 因此 byte c = a + b; 會發生編譯錯誤
		// 需改成 byte c = (byte)(a + b);
		//byte c = a + b;
		byte c = (byte)(a + b);
		System.out.printf("a = %d%n", a);
		System.out.printf("b = %d%n", b);
		System.out.printf("c = %d%n", c);
	}

}