package Gradehandleprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Gradehandle {
	private List<Integer> list = new ArrayList<>(); // 
	private Map<String, Integer> map = new HashMap<>(); // 과목명과 성적 입력 
	
	private String name; // 학생이름
	private int studentNumber; // 학번
	
	private int average; // 평균값
	private String grade; // 학점
	
	Scanner scan = new Scanner(System.in);
	//생성자
	public Gradehandle() {
		
		
	}
	//시작 끝
	public void start() {
		// 학적입력
		studentinfo();
		//과목, 성적입력
		insertNameGrade();
		
	}
	
	//학적 입력
	private void studentinfo() { 
		System.out.println("이름을 입력해주세요.");
		this.name = scan.next();
		System.out.println("학번을 입력해주세요");
		this.studentNumber = scan.nextInt();
		System.out.println("입력이 완료되었습니다.");
	}
	
	// 평균 계산
	private void average() {
		Collection<Integer> values = this.map.values(); // value값만 뽑기
		Iterator<Integer> it = values.iterator();
		int temp = 0; // 임시 숫자 담아둘 변수
		while (it.hasNext()) {
			this.list.add(it.next()); // 리스트에 다 삽입
		}

		for (int i : this.list) {
			temp += i;
		}
		this.average = temp / this.list.size();

	}

	// 평균을 통해 성적 산출
	private void resultGrade() {
		if (this.average >= 95)
			this.grade = "A+";
		else if (this.average >= 90 && this.average < 95)
			this.grade = "A";
		else if (this.average >= 80 && this.average < 90)
			this.grade = "B+";
		else if (this.average >= 70 && this.average < 80)
			this.grade = "B";
		else
			this.grade = "C";

	}
	
	// 과목명, 점수 입력받기
	private void insertNameGrade() {
		// 국어 수학 영어 과학 사회 5개 과목
		System.out.println("시험과목 5개의 과목명과 성적을 입력해주세요 ");
		while (!(this.map.size()==5)) {
			System.out.println("과목명 입력하세요");
			String name = scan.next();
			System.out.println("성적 입력하세요");
			int grade = scan.nextInt();
			// 100점 넘기거나 음수값 입력시 재입력 호출
			if(grade < 0 || grade > 100) { 
				while (grade < 0 || grade > 100) {
					System.out.println("잘못입력하셨습니다. 다시입력하세요.");
					grade= scan.nextInt();
				}
				
			}
			this.map.put(name, grade);
		}
		System.out.println("입력이 완료되었습니다.");
		// 성적 입력
		average();
		resultGrade();
	}
	// 평균조회
	public int getAverage() {
		return this.average;
	}
	// 학점조회
	public String getGrade() {
		return this.grade;
	}
	//이름조회
	public String getName() {
		return this.name;
	}

}
