package Gradehandleprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StudentHandling {
	private Gradehandle[] student = new Gradehandle[5]; // 5���� �л����� ���
	private Integer[] rank = new Integer[5]; // �л��� ����� ������������ ����
	private String[] name = new String[5]; // �л��̸� ��� �迭
	private int number; // ���ۺ���
	Scanner scan = new Scanner(System.in);

	// ������
	public StudentHandling() {
		while (!(number == 5)) {
			System.out.println("1.�����Է� 2.��� ���� ��ȸ 3.����Ȯ�� 4.�л��̸� Ȯ�� 5.����");
			this.number = scan.nextInt();
			switch (this.number) {
			case 1:
				insertProgram();
				break;
			case 2:
				System.out.println("�̸��� �Է����ּ���");
				String name = scan.next();
				searchGrade(name);
				break;
			case 3:
				System.out.println("�̸��� �Է����ּ���");
				String name1 = scan.next();
				searchRank(name1);
				break;
			case 4:
				getStudentName();
				break;
			default:
				System.out.println("����Ǿ����ϴ�.");
			}
		} // while��

	}

	// null�ι迭�� �������� �־��ֱ�
	private void insertProgram() {

		for (int i = 0; i < this.student.length; i++) {
			if (this.student[i] == null)
				this.student[i] = new Gradehandle();
			this.student[i].start();

		}

		// �Է¹����鼭 ���� ����ϱ�
		for (int i = 0; i < this.student.length; i++) {
			this.rank[i] = this.student[i].getAverage();
		}

		Arrays.sort(rank, Collections.reverseOrder());
		
		//�л��̸� ���
		insertName();
	}

	// ���, ���� Ȯ��
	private void searchGrade(String name) {
		try {
			for (int i = 0; i < this.student.length + 1; i++) {
				// �̸��� ���� student�� ã��
				if (this.student[i].getName().equals(name)) {
					System.out.printf("�����=%2d%n", student[i].getAverage());
					System.out.printf("������:%2d%n", student[i].getGrade());
					break;
				}

			}

		} catch (Exception e) {

		}

	}

	// ������� ���
	private void searchRank(String name) {
		int rank = 0;
		try {
			for (int i = 0; i < this.student.length; i++) {
				// �̸��� ���� student�� ã��
				if (this.student[i].getName().equals(name)) {
					// ��� Ȯ��
					for (int j = 0; j < this.rank.length; j++) {
						if (this.rank[j] == this.student[i].getAverage()) {
							rank = j + 1;
							break;
						}
					}
				}

			} // �ٱ� for�� ��
			if (rank == 0) {
				System.out.println("�ش��̸��� ������ �����ϴ�.");
			} else {
				System.out.printf("�����:%2d��%n", rank);
			}
		} catch (NullPointerException e) {

		}

	}
	
	//�л��̸� ���
	private void insertName() {
		for(int i=0; i<student.length; i++) {
			this.name[i] =this.student[i].getName();
		}
 	}
	// �л��̸� Ȯ��
	private void getStudentName() {
		if (this.name[0]==null) {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}
		else System.out.println(Arrays.toString(this.name));
	}

}
