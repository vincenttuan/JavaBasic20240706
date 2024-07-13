package day3;

public class Test2 {

	public static void main(String[] args) {
		int age = 10;
		int var = age++ - age-- + ++age;
		System.out.printf("age = %d%n", age);
		System.out.printf("var = %d%n", var);
	}

}