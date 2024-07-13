package day4;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		// 判斷分數是否及格 ?
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分數:");
		int score = sc.nextInt();

		if(score >= 60) {
			System.out.printf("分數: %d 及格%n", score);
		} else {
			System.out.printf("分數: %d 不及格%n", score);
		}

		// 判斷分數等第
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		} else if(score >= 70 && score < 80) {
			System.out.println("C");
		} else if(score >= 60 && score < 70) {
			System.out.println("D");
		} else if(score >= 0 && score < 60) {
			System.out.println("F");
		} else {
			System.out.println("成績輸入錯誤");
		}

	}

}