package JAVATIL;



public class StudyArray2 {
	public void getmode(int[] x) {// �ֺ� ���ϱ�
		int[] tmp = new int[x.length];//�ֺ�� ���ִ� �迭
		int inputdata; //�Ͻ����� ������
		for(int i=0; i<tmp.length; i++) {
			tmp[i]=0;
		}// 1���� �ʱ�ȭ �����ش�.
		for(int i=0; i<x.length; i++) {// �󵵼���ŭ ���ֱ�
			inputdata = x[i];
			for(int j=1; j<x.length; j++) {
				if(inputdata==x[j]) {
					tmp[i]++;
				}
			}
		}
		for(int i=0; i<tmp.length; i++) { // �ֺ� ���ϱ�
			if (tmp[i]>1) {
				for (int j=1; j<x.length; j++) {
					if(x[i]==x[j]) continue;
					
				}
				System.out.printf("�ֺ�:%2d �� ����:%2d",x[i],tmp[i]);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		StudyArray2 get = new StudyArray2();
		int [] arr = {78,15,46,15,26,48,25};
		get.getmode(arr);
		
	}
}
