package JAVATIL;

import java.util.Arrays;

public class StudyArray1 {

	public void lotto(int i) {//�ζǹ�ȣ �������� ������ ��ȣ�� 5����÷�Ѱ��� �����ִ� �޼���
		if (i>=6) return;
		int[] lottoNumber = new int[6];
		for (int k=0; k<6; k++) {
			int randomNumber = (int)((Math.random()*45)+1);
			lottoNumber[k]= randomNumber;
		}
		lotto(i+1);
		// ����Լ��� ����ó�� �۵��ϱ� ������ ���ÿ��� ����鼭 ���.
		System.out.println(Arrays.toString(lottoNumber));	
		
	}
	public static void main(String[] args) {
		StudyArray1 start = new StudyArray1();
		start.lotto(1); // �ζ� �ڵ����� 5�� �ּ���~
	}
	
}
