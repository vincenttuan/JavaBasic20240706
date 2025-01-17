package day2;

/**
 * 基本資料型別變數的應用
 * */
public class Demo6 {

	public static void main(String[] args) {
		// BMI 計算
		// 若身高 = 170, 體重 = 60 求 bmi (到小數點第2位)	
		double h = 170; // 170.0
		double w = 60; // 60.0
		// 將 h 除以 100
		h = h / 100;
		// 計算 bmi 值
		double bmi = w / (h*h);

		// 使用 println 來印出內容
		System.out.println("身高:" + (h*100) + "cm 體重:" + w + "kg BMI:" + bmi);

		// 使用 printf 來印出內容
		System.out.printf("身高:%.1fcm 體重:%.1fkg BMI:%.2f\n", (h*100), w, bmi);
		System.out.printf("身高:%.1fcm 體重:%.1fkg BMI:%.1f\n", (h*100), w, bmi);
	}
}