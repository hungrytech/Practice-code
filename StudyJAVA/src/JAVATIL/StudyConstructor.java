package JAVATIL;

public class StudyConstructor {
	private String name; // �Ӽ�, field, ����, data
	private int age;
	private String address;
	
	public StudyConstructor() {} // �⺻������
	
	public StudyConstructor(String name) { // �̸� ����
		this.name=name;
	}
	public StudyConstructor(String name, int age) { // �̸� ���� ����
		this(name); // �̸� ���� ������ ȣ��
		this.age = age;
	}
	public StudyConstructor(int age, String address, String name) { // ���� �̸� �ּ� ����
		this(name, age); // �̸� ���� ������ ȣ��
		this.address = address; 
	}
	public StudyConstructor(Object obj) { // ��� ��ü �޾Ƶ� ����! but IntegerŸ������ Ȯ���� ������ ��ü age�� ���� 
		if (obj instanceof Integer)
			this.age= (int)obj;
	}
	public int getAge() { // ����ȭ�� ���������� �Ұ��ϹǷ� ���̸� ��� �޼��� 
		return this.age;
	}
	public String getName() { // ����ȭ�� ���������� �Ұ��ϹǷ� �̸��� ��� �޼���
		return this.name;
	} 
	public String getAddress() {// ����ȭ�� ���������� �Ұ��ϹǷ� �ּҸ� ��� �޼���
		return this.address;
	}
	
	public void setAge(int age) { // ���̸� �޼ҵ带 ���� ���Խ� 0�� ���ϸ� �����ϸ� ������ ������ �ȵǰԲ� ����
		if(age<=0) return;
		this.age=age;
		
		
	}
	public static void main(String[] args) {
		StudyConstructor p = new StudyConstructor(28, "tech", "����");
		
		
	}
}
