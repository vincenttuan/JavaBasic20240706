package day2;

/**
 * 浮點數資料型別:
 * float(32bits), double(預設 64bits)
 * */
public class Demo2 {

	public static void main(String[] args) {
		System.out.println(3.14); // double
		System.out.println(3.14d); // double
		System.out.println(3.14f); // float
		// 科學記號(double)
		System.out.println(4.2e4);
		System.out.println(5e5);
		// 半徑=10
		System.out.println(10*10*3.14); // 圓面積
		System.out.println((4.0/3)*3.14*10*10*10); // 球體積
		System.out.println(4*3.14*10*10); // 球表面積
	}

}