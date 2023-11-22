package ch08;

public class Ex8_5 {
	public static void main(String args[])		{
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	// 예외발생!
			System.out.println(4);		// 실행안됨
		} catch (ArithmeticException ae)		{
			ae.printStackTrace(); // 참조변수 ae 를 통해 생성된 ArithmeticException 인스턴스에 접근 가능
			System.out.println("예외메시지 : " + ae.getMessage());
		}	// try-catch의 끝
		
		System.out.println(6);
	}	// main method 의 끝
}
