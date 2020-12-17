package JAVATIL;

import java.util.Scanner;

public class StudyIF {
	//IF문 연습
	public String resultgrade(int grade) {
		String result;
		if (grade >= 90) {
			result ="A";
		}else if (grade >= 80) {
			result = "B";
		}else if (grade >= 70) {
			result = "C";
		}else {
			result = "D";
		}
		return result;
	}	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시험점수를 입력해주세요:");
		int InputGrade = scan.nextInt();
		StudyIF st = new StudyIF();
		String result = st.resultgrade(InputGrade);
		System.out.println(result);
	}
}
