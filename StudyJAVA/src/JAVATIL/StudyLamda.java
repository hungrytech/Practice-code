package JAVATIL;

// �Լ��� �������̽�
@FunctionalInterface
interface Function {
	void function();
}


public class StudyLamda {
	
	public static void myFunction(Function f) {
		f.function();
	}
	
	
	
	public static void main(String[] args) {
		//���ٽ����� function�޼��� ����
		Function fun = () -> System.out.println("�Լ��� �������̽��Դϴ�.");
		
		//fun ���������� �޼��� ���� 
		fun.function();
		
		//StudyLamda Ŭ������ myFunction�޼��� �Ķ���Ϳ� fun �־ ����
		StudyLamda.myFunction(fun);
		
		//StudyLamda Ŭ������ myFunction�޼��� �Ķ���Ϳ� ���ٽ� �־ ����
		StudyLamda.myFunction(() -> System.out.println("���ٽ����� �ֱ�"));
		
	}
}
