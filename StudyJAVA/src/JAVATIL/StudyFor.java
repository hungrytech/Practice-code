package JAVATIL;

public class StudyFor {
	
	//switch ����
	public void practiceSwitch(int value) {
		switch(value) {
		case 3 :
			System.out.println("�� 3�Դϴ�.");
			break;
		case 5 :
			System.out.println("�� 5�Դϴ�.");
		case 10 :
			System.out.println("�� 10�Դϴ� �׸��� break��� ���� ���Ϳ�");
		}
	}
	// for�� ���� ���������� ¦�� Ȧ���� ������ �� ���
	public void practiceFor(int value) {
		int resultEven=0;
		int resultOdd=0;
		for(int i=1; i<value+1; i++) {
			if(i%2==0) {
				resultEven+=i;
			}else if(i%2!=0) {
				resultOdd+=i;
			}
		}//for�� ��
		System.out.println("¦������:"+resultEven+"Ȧ������:"+resultOdd);
	}
	
	public static void main(String[] args) {
		StudyFor stf = new StudyFor();
		//switch �Լ�
		stf.practiceSwitch(3);
		stf.practiceSwitch(5);
		stf.practiceSwitch(10);
		//for�� �Լ�
		stf.practiceFor(10);
//		stf.practiceFor(100);
		
	}
}
