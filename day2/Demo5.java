package day2;

/**
 * 基本資料型別變數的應用
 * */
public class Demo5 {
	public static void main(String[] args) {
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40;
		float e = 3.14f;
		double f = 3.14; // 3.14d; 3.14D;
		char g = 'A';
		boolean h = true;
		boolean i = 70 > 60;

		// 利用字串加號(+)變數來印出內容, 此時的加號(+)會變成連接符號
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		System.out.println("i = " + i);

	}
}