package day4;

import java.util.Scanner;

public class Input6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身份證字號:");
		String id = sc.next();
		char no1 = id.charAt(0); // 取字串第一個字元
		char no2 = id.charAt(1); // 取字串第二個字元
		char no3 = id.charAt(2); // 取字串第三個字元
		System.out.printf("出生地: %c 性別: %c 身分碼: %c%n", no1, no2, no3);

		// 判斷性別 if-else
		if(no2 == '1') {
			System.out.println("男性");
		} else if(no2 == '2') {
			System.out.println("女性");
		} else {
			System.out.println("性別碼錯誤");
		}

		// 判斷性別 switch-case
		switch(no2) {
			case '1':
				System.out.println("男性");
				break;
			case '2':
				System.out.println("女性");
				break;
			default:
				System.out.println("性別碼錯誤");	
		}

		// 判斷身分碼 switch-case
		switch(no3) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
				System.out.println("在臺灣出生之本籍國民");
				break;
			case '6':
				System.out.println("入籍國民，原為外國人");
				break;
			case '7':
				System.out.println("入籍國民，原為無戶籍國民");
				break;
			case '8':
				System.out.println("入籍國民，原為香港居民或澳門居民");
				break;
			case '9':	
				System.out.println("入籍國民，原為大陸地區居民");
				break;
			default:
				System.out.println("身分碼錯誤");	
		}
	}
}