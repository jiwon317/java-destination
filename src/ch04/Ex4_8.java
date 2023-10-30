package ch04;

public class Ex4_8 {
	public static void main(String args[]) {
		//int i;   이렇게하면 int i를 for 문 밖에서도 사용가능 scope는 근데 좁을 수록 좋다.
		//왜냐하면 오류 위치 찾기 귀찮. 
		//변수의 범위는 선언위치부터 선언된 블럭의 끝까지이다.
		
		// for 문 조건식 생략하면 true로 간주되어서 무한반복문이 된다.
		for (int i = 1; i <= 3; i++) { // 괄호 {} 안의 문장을 3번 반복
			System.out.println("Hello");
		}
	}
}
