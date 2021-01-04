package JAVATIL;

public class StudyConstructor {
	private String name; // 속성, field, 상태, data
	private int age;
	private String address;
	
	public StudyConstructor() {} // 기본생성자
	
	public StudyConstructor(String name) { // 이름 삽입
		this.name=name;
	}
	public StudyConstructor(String name, int age) { // 이릅 나이 삽입
		this(name); // 이름 삽입 생성자 호출
		this.age = age;
	}
	public StudyConstructor(int age, String address, String name) { // 나이 이름 주소 삽입
		this(name, age); // 이름 나이 생성자 호출
		this.address = address; 
	}
	public StudyConstructor(Object obj) { // 어떠한 객체 받아도 가능! but Integer타입인지 확인후 맞으면 객체 age에 삽입 
		if (obj instanceof Integer)
			this.age= (int)obj;
	}
	public int getAge() { // 은닉화로 직접접근이 불가하므로 나이를 얻는 메서드 
		return this.age;
	}
	public String getName() { // 은닉화로 직접접근이 불가하므로 이름를 얻는 메서드
		return this.name;
	} 
	public String getAddress() {// 은닉화로 직접접근이 불가하므로 주소를 얻는 메서드
		return this.address;
	}
	
	public void setAge(int age) { // 나이를 메소드를 통해 삽입시 0살 이하를 삽입하면 변수에 삽입이 안되게끔 설정
		if(age<=0) return;
		this.age=age;
		
		
	}
	public static void main(String[] args) {
		StudyConstructor p = new StudyConstructor(28, "tech", "서울");
		
		
	}
}
