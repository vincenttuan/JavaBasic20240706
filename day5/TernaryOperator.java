package day5;

// 三元運算子
// if - else 的簡化版
public class TernaryOperator {

	public static void main(String[] args) {
		
		int score = 75;
		System.out.println(score);

		// if else -----------------------------------
		if(score >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		// ? : ---------------------------------------
		System.out.println( (score >= 60) ? "Pass" : "Fail" );

		String result = (score >= 60) ? "Pass" : "Fail";
		System.out.println(result);

	}

}