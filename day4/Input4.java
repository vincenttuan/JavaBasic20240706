package day4;

import java.util.Scanner;

// 停車場-停車
public class Input4 {
	public static void main(String[] args) {
		int parking = 0b10101; // 21
		System.out.printf("停車場數值: %d 空位 %s%n", parking, Integer.toBinaryString(parking));

		//-------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.print("請選車位(0~4):");
		int choice = sc.nextInt(); // 選位
		int no = (int)Math.pow(2, choice); // 2 的 choice 次方會得到 double 所以要轉 int
		// 判斷 no 車位是否可以停車 ?
		if((parking & no) == 0) {
			System.out.printf("%d 號車位可以停車%n", choice);
			// 將車子停進指定車位
			parking += no;
		} else {
			System.out.printf("%d 號車位不可以停車%n", choice);
		}
		//-------------------------------------------------------------------------------------

		System.out.printf("停車場數值: %d 空位 %s%n", parking, Integer.toBinaryString(parking));
	}
}