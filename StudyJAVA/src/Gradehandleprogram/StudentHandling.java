package Gradehandleprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StudentHandling {
	private Gradehandle[] student = new Gradehandle[5]; // 5명의 학생정보 기록
	private Integer[] rank = new Integer[5]; // 학생들 평균을 내림차순으로 정력
	private String[] name = new String[5]; // 학생이름 담는 배열
	private int number; // 동작변수
	Scanner scan = new Scanner(System.in);

	// 생성자
	public StudentHandling() {
		while (!(number == 5)) {
			System.out.println("1.학적입력 2.평균 학점 조회 3.석차확인 4.학생이름 확인 5.종료");
			this.number = scan.nextInt();
			switch (this.number) {
			case 1:
				insertProgram();
				break;
			case 2:
				System.out.println("이름을 입력해주세요");
				String name = scan.next();
				searchGrade(name);
				break;
			case 3:
				System.out.println("이름을 입력해주세요");
				String name1 = scan.next();
				searchRank(name1);
				break;
			case 4:
				getStudentName();
				break;
			default:
				System.out.println("종료되었습니다.");
			}
		} // while끝

	}

	// null인배열에 학적정보 넣어주기
	private void insertProgram() {

		for (int i = 0; i < this.student.length; i++) {
			if (this.student[i] == null)
				this.student[i] = new Gradehandle();
			this.student[i].start();

		}

		// 입력받으면서 석차 계산하기
		for (int i = 0; i < this.student.length; i++) {
			this.rank[i] = this.student[i].getAverage();
		}

		Arrays.sort(rank, Collections.reverseOrder());
		
		//학생이름 담기
		insertName();
	}

	// 평균, 학점 확인
	private void searchGrade(String name) {
		try {
			for (int i = 0; i < this.student.length + 1; i++) {
				// 이름이 같은 student를 찾기
				if (this.student[i].getName().equals(name)) {
					System.out.printf("평균은=%2d%n", student[i].getAverage());
					System.out.printf("학점은:%2d%n", student[i].getGrade());
					break;
				}

			}

		} catch (Exception e) {

		}

	}

	// 몇등인지 출력
	private void searchRank(String name) {
		int rank = 0;
		try {
			for (int i = 0; i < this.student.length; i++) {
				// 이름이 같은 student를 찾기
				if (this.student[i].getName().equals(name)) {
					// 등수 확인
					for (int j = 0; j < this.rank.length; j++) {
						if (this.rank[j] == this.student[i].getAverage()) {
							rank = j + 1;
							break;
						}
					}
				}

			} // 바깥 for문 끝
			if (rank == 0) {
				System.out.println("해당이름의 정보가 없습니다.");
			} else {
				System.out.printf("등수는:%2d등%n", rank);
			}
		} catch (NullPointerException e) {

		}

	}
	
	//학생이름 담기
	private void insertName() {
		for(int i=0; i<student.length; i++) {
			this.name[i] =this.student[i].getName();
		}
 	}
	// 학생이름 확인
	private void getStudentName() {
		if (this.name[0]==null) {
			System.out.println("입력된 정보가 없습니다.");
		}
		else System.out.println(Arrays.toString(this.name));
	}

}
