package ch03;

public class kang1022 {
	public static int makeSum(int something) {
		int sum = 0;
		for (int i = 1; i <= something; i++) {
			sum = sum + i;
		}
		return sum;
	}
	public static char makeGrade(int score) {
		char grade; 
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		return grade;
	}
	public static void main(String args[]) {
		int score = 91;
		int i = 5;
		int sum = makeSum(i);
		char grade = makeGrade(score);
		
		System.out.println("최지원군의 학점은 " + grade + " 입니다.");	
		System.out.println("입력한 정수는 " + i + " 이고, " + "합은 " + sum + " 입니다.");
	}
}
