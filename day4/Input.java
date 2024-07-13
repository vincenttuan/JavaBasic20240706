package day4;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// 使用者可以輸入身高與體重
		// 系統會計算出 BMI 值與診斷訊息
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身高(cm): ");
		double h = sc.nextDouble(); // 將使用者在鍵盤上輸入的訊息字串轉 double
		System.out.print("請輸入體重(kg): ");
		double w = sc.nextDouble();

		System.out.printf("身高: %.1f cm 體重: %.1f kg%n", h, w);



	}

}