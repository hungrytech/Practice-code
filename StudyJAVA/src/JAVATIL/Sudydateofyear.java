package JAVATIL;

public class Sudydateofyear {
	
	public void getresult(String name,int correntyear, int year, int month, int day) {
		int leapmonth = getleapMonth(year); // �����ϰ�� 2���� 29���̹Ƿ� +1
		String zodiacsign= getzodiacsign(year); //�� �����̸�
		int myyear = (correntyear-year)+1;
		int tmpyear = (year-1)*365; // �׳⵵���� �� �ϼ�
		int days =0; // �Է��� �ް� �ϱ����� �� �ϼ�
		int result; // ����� �Ѱ�
		String dayofweek = ""; // 2020���� �ƴ� �Է��� ��¥�� �ش��ϴ� ����
		for(int i=1; i<month; i++) { // �Է¹��� ��, �״��� �ϼ������� �� �ϼ��� �����ش�.
			switch (i) {
			case 1 :
			case 2 :
				days+=28;
				break;
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				days+=31;
				break;
			default :
				days+=30;
				break;
			}
		}
		
		result=(tmpyear+(days+day)+leapmonth); // �� �ϼ�
		
		switch(result%7) { // ���ϼ��� 7�γ��� �������� ��������� ���ϱ�
		case 0 :
			dayofweek= "�Ͽ���";
			break;
		case 1 :
			dayofweek= "������";
			break;
		case 2 :
			dayofweek= "ȭ����";
			break;
		case 3 :
			dayofweek= "������";
			break;
		case 4 :
			dayofweek= "�����";
			break;
		case 5 :
			dayofweek= "�ݿ���";
			break;
		case 6 :
			dayofweek= "�����";
			break;
		}
		System.out.println("�̸���:"+name+" "+"���̴�:"+myyear+" "+"���:"+zodiacsign+" "+"������:"+dayofweek);
		
	}
	public int getleapMonth(int year) { // �������� �ƴ��� �Ǵ��Ͽ� �����ϰ�� 1�� return
		int result=0;
		if(year%4==0&& year%100!=0 || year%400==0) {
			result+=1;
		}
		return result;
	}
	public String getzodiacsign(int year) { // ���� �̸��� �����ش�.
		String result = "";
		switch (year%12) {
		case 0 :
			result="������";
			break;
		case 1 :
			result="��";
			break;
		case 2 :
			result="��";
			break;
		case 3 :
			result="����";
			break;
		case 4 :
			result="��";
			break;
		case 5 :
			result="��";
			break;
		case 6 :
			result="ȣ����";
			break;
		case 7 :
			result="�䳢";
			break;
		case 8 :
			result="��";
			break;
		case 9 :
			result="��";
			break;
		case 10 :
			result="��";
			break;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Sudydateofyear date = new Sudydateofyear();
		date.getresult("��ö��", 2020, 1987, 3, 5); //�޼��忡 �� �Է�
		
	}	
	
	
	
}
