package ObjectOut;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private transient String SocialSecurityNumber; // ÁÖ¹Î¹øÈ£
	private int age;
	private String gender;
	
	
	
	public Student(String name, String socialSecurityNumber, int age, String gender) {
		super();
		this.name = name;
		SocialSecurityNumber = socialSecurityNumber;
		this.age = age;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "(" + name + "," + age + "," + gender + ")";
	}
	
}
