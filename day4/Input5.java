package day4;

import java.util.Scanner;

// 停車場-移車
public class Input5 {
	public static void main(String[] args) {
		int parking = 0b10101; // 21
		System.out.printf("停車場數值: %d 空位 %s%n", parking, Integer.toBinaryString(parking));

		//-------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.print("移車:請選車位(0~4):");
		int choice = sc.nextInt(); // 選位
		int no = (int)Math.pow(2, choice); // 2 的 choice 次方會得到 double 所以要轉 int
		// 判斷 no 車位是否有車可以移出 ?
		if((parking & no) == 0) {
			System.out.printf("%d 號車位無車可以移%n", choice);
		} else {
			System.out.printf("%d 號車位可以移車%n", choice);
			// 將車子移出
			parking -= no; // parking = parking - no;
		}
		//-------------------------------------------------------------------------------------

		System.out.printf("停車場數值: %d 空位 %s%n", parking, Integer.toBinaryString(parking));
	}
}