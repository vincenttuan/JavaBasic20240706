package day5;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		
		int ans = 38;
		int min = 0, max = 100;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.printf("請在 %d ~ %d 之間輸入一數字:", min, max);
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
			
		} while(true); // ;分號要加

		System.out.println("Game Over !");
	}

}