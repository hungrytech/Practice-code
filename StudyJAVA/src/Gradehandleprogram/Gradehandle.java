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
	private Map<String, Integer> map = new HashMap<>(); // ������ ���� �Է� 
	
	private String name; // �л��̸�
	private int studentNumber; // �й�
	
	private int average; // ��հ�
	private String grade; // ����
	
	Scanner scan = new Scanner(System.in);
	//������
	public Gradehandle() {
		
		
	}
	//���� ��
	public void start() {
		// �����Է�
		studentinfo();
		//����, �����Է�
		insertNameGrade();
		
	}
	
	//���� �Է�
	private void studentinfo() { 
		System.out.println("�̸��� �Է����ּ���.");
		this.name = scan.next();
		System.out.println("�й��� �Է����ּ���");
		this.studentNumber = scan.nextInt();
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
	}
	
	// ��� ���
	private void average() {
		Collection<Integer> values = this.map.values(); // value���� �̱�
		Iterator<Integer> it = values.iterator();
		int temp = 0; // �ӽ� ���� ��Ƶ� ����
		while (it.hasNext()) {
			this.list.add(it.next()); // ����Ʈ�� �� ����
		}

		for (int i : this.list) {
			temp += i;
		}
		this.average = temp / this.list.size();

	}

	// ����� ���� ���� ����
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
	
	// �����, ���� �Է¹ޱ�
	private void insertNameGrade() {
		// ���� ���� ���� ���� ��ȸ 5�� ����
		System.out.println("������� 5���� ������ ������ �Է����ּ��� ");
		while (!(this.map.size()==5)) {
			System.out.println("����� �Է��ϼ���");
			String name = scan.next();
			System.out.println("���� �Է��ϼ���");
			int grade = scan.nextInt();
			// 100�� �ѱ�ų� ������ �Է½� ���Է� ȣ��
			if(grade < 0 || grade > 100) { 
				while (grade < 0 || grade > 100) {
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���.");
					grade= scan.nextInt();
				}
				
			}
			this.map.put(name, grade);
		}
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
		// ���� �Է�
		average();
		resultGrade();
	}
	// �����ȸ
	public int getAverage() {
		return this.average;
	}
	// ������ȸ
	public String getGrade() {
		return this.grade;
	}
	//�̸���ȸ
	public String getName() {
		return this.name;
	}

}
