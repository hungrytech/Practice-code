package ObjectOut;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class OutClass {
	
	
	public static void main(String[] args) {
		conductSerializing();
		conductDeserializing();
	}
	
	
	
	
	
	//직렬화
	public static void conductSerializing() {
		try {
			FileOutputStream fos = new FileOutputStream("StudentInfo_ser");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			Student s1 = new Student("이종원", "940321-1032043", 23, "M");
			Student s2 = new Student("박혜선", "930513-2052043", 29, "W");
			
			ArrayList<Object> list = new ArrayList<>();
			list.add(s1);
			list.add(s2);
			
			out.writeObject(s1);
			out.writeObject(s2);
			out.writeObject(list);
			out.close();
			System.out.println("직렬화 완료~");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//역직렬화
	public static void conductDeserializing() {
		
		try {
			FileInputStream fis = new FileInputStream("StudentInfo_ser");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			Student s1 = (Student)in.readObject();
			Student s2 = (Student)in.readObject();
			ArrayList<Object> list= (ArrayList<Object>)in.readObject();
			
			System.out.println(s1.toString());
			System.out.println(s2.toString());
			System.out.println(list.toString());
			System.out.println("리스트 사이즈는 = "+ list.size());
			
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
 	}
	
	
}
