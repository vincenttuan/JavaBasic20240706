package day2;

/**
 * 整數資料型別
 * byte, short, int(預設), long
 * */
public class Demo1 {

	public static void main(String[] args) {
		System.out.println(100 + 90); // int 100 + int 90 = 190
		System.out.println(100 - 90); // = 10
		System.out.println(100 * 90); // = 9000
		System.out.println(100 / 90); // = 1 (整數相除只會得到商)
		System.out.println(100 % 90); // = 10 (餘數)
		
		System.out.println(0b110); // 二進位
		System.out.println(0017); // 八進位
		System.out.println(0xabc); // 十六進位
	}

}