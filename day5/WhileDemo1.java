package day5;

import java.util.Random;

public class WhileDemo1 {

	public static void main(String[] args) {
		
		Random random = new Random(); // 隨機物件

		int n = random.nextInt(100); // 0~99 的隨機數
		System.out.println(n); // 印出隨機數

	}

}