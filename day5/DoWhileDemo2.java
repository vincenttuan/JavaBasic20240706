package day5;

import java.util.Scanner;
import java.util.Random;

// 猜數字: 對戰版
public class DoWhileDemo2 {

	public static void main(String[] args) {
		Random random = new Random();
		int ans = random.nextInt(99) + 1; // 0~98 + 1 -> 1~99
		int min = 0, max = 100;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.printf("請玩家在 %d ~ %d 之間輸入一數字:", min, max);
			// 玩家猜數字
			int userGuess = sc.nextInt();
			// 判斷玩家使否猜對
			if(userGuess > ans) {
				max = userGuess;
			} else if(userGuess < ans) {
				min = userGuess;
			} else {
				System.out.println("賓果 ! 玩家贏了");
				break;
			}
			//-----------------------------------------------------------
			// 電腦猜數字
			System.out.printf("請電腦在 %d ~ %d 之間輸入一數字:", min, max);
			int pcGuess = random.nextInt(max - min - 1) + min + 1;
			System.out.printf("電腦猜: %d%n", pcGuess);
			// 判斷電腦使否猜對
			if(pcGuess > ans) {
				max = pcGuess;
			} else if(pcGuess < ans) {
				min = pcGuess;
			} else {
				System.out.println("賓果 ! 電腦贏了");
				break;
			}
			
		} while(true); // ;分號要加

		System.out.println("Game Over !");
	}

}
