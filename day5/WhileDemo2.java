package day5;

public class WhileDemo2 {

	public static void main(String[] args) {
		
		// 跑 5 次的迴圈
		int i = 1; // 計數
		while(i <= 5) {
			System.out.print(i+" -> ");

			//------------------------------------------
			int x = 3; // 計數
			while(x > 0) {
				System.out.print("Java "); // 印出 Java
				x--; // 計數 - 1
			}
			System.out.println(); // 換行
			//------------------------------------------

			i++; // 計數 + 1
		}


	}

}