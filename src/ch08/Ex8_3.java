package ch08;

public class Ex8_3 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 0으로 나눠서 고의로 ArithmeticException 발생
			System.out.println(4); // 실행 안됨
		} catch (Exception e) {	// ArithmeticException 대신 Exception을 사용.
			System.out.println(5);
		} 	// try-catch의 끝
		
		System.out.println(6);
	}	// main method 끝
}
