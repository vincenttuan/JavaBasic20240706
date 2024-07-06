package day2;

/**
 * 字元資料型別
 * char(16bits)
 * */
public class Demo3 {
	public static void main(String[] args) {
		System.out.println('A');
		System.out.println('我');
		System.out.println('A' + 'a');
		System.out.println('我' + '愛' + '你');
		// 透過 int 變數可以反查 char 所對應的數值
		int x = '我';
		System.out.println(x);
		// 透過 char 變數可以反查 int 所對應的字元
		char y = 33333;
		System.out.println(y);
	}
}