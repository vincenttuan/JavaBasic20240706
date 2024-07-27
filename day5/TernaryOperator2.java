package day5;

public class TernaryOperator2 {

	public static void main(String[] args) {
		
		int score = 95;
		System.out.println(score);
		
		// 利用三元運算子來判定
		// 若 score >= 90 印出 Great
		// 若 score >= 60 印出 Pass
		// 若 score < 60 印出 Fail

		String result = (score >= 90) ? "Great" : (score >= 60) ? "Pass" : "Fail";
		System.out.println(result);

	}

}