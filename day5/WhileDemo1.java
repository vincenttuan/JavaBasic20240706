package day5;

import java.util.Random;

public class WhileDemo1 {

	public static void main(String[] args) {
		
		Random random = new Random(); // 隨機物件

		while(true) {
			int n = random.nextInt(100); // 0~99 的隨機數

			// 若 n 是奇數則重新執行迴圈判斷
			// 若 n 是偶數則繼續執行程序
			if(n % 2 == 1) {
				continue; // 重新執行迴圈判斷
			}

			System.out.println(n); // 印出隨機數
			
			if(n == 0) {
				break; // 離開迴圈
			}
		}

	}

}
