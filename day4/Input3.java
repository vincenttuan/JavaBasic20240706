package day4;

/**
Harris-Benedict方程式是一種用來計算基礎代謝率（BMR，Basal Metabolic Rate）的公式，
基礎代謝率是指人在靜止狀態下（如坐著或躺著）所消耗的能量。這些公式考慮了性別、年齡、體重和身高。
以下是Harris-Benedict方程式的中文說明：

男性 BMR 計算公式：
BMR=88.362+(13.397×體重(kg))+(4.799×身高(cm))−(5.677×年齡)

女性 BMR 計算公式：
BMR=447.593+(9.247×體重(kg))+(3.098×身高(cm))−(4.330×年齡)

這些公式根據以下因素計算基礎代謝率：

體重：以公斤為單位。
身高：以公分為單位。
年齡：以年為單位。
基礎代謝率表示一個人在完全靜止狀態下一天內所消耗的總能量，即維持身體基本功能所需的最低能量，包括呼吸、血液循環、體溫調節等。

 * */

import java.util.Scanner;

public class Input3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入性別(男-1/女-2):");
		int gender = sc.nextInt(); // 性別
		System.out.print("請輸入年齡:");
		int age = sc.nextInt();
		System.out.print("請輸入身高(cm):");
		double h = sc.nextDouble();
		System.out.print("請輸入體重(kg):");
		double w = sc.nextDouble();
		// 印出使用者所輸入的資料
		System.out.printf("性別: %d 年齡 :%d 身高: %.1f 體重: %.1f%n", gender, age, h, w);

		// 計算 BMR
		double bmr = 0;
		if(gender == 1) { // 男性
			bmr = 88.362+(13.397*w)+(4.799*h)-(5.677*age);
		} else if(gender == 2) { // 女性
			bmr = 447.593+(9.247*w)+(3.098*h)-(4.330*age);
		} else {
			System.out.println("性別輸入錯誤");
			return; // main 方法提前結束
		}

		// 印出 bmr
		System.out.println("男性正常: 1600~1800 大卡/天");
		System.out.println("女性正常: 1400~1600 大卡/天");
		System.out.printf("BMR: %.1f 大卡/天%n", bmr);
	}
}
